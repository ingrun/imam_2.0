package cn.ingrun.imam.serviceImpl;

import cn.ingrun.imam.Utils.RetMsgUtil;
import cn.ingrun.imam.domain.Code;
import cn.ingrun.imam.domain.User;
import cn.ingrun.imam.mapper.CodeMapper;
import cn.ingrun.imam.service.CodeService;
import cn.ingrun.imam.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: IngRun
 * @Date: 2019/8/21 10:21
 * @Description:
 */
@Service
public class CodeServiceImpl implements CodeService {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    CodeMapper codeMapper;

    @Autowired
    UserService userService;

    @Override
    public Code getCodeByid(int id) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",id);
        Code code = null;
        try {
            code = codeMapper.selectOne(queryWrapper);
        } catch (Exception e) {
            logger.error("获取用户信息失败！");
        }
        return code;
    }


    @Override
    public Map getUserCode() {
        Subject subect = SecurityUtils.getSubject();   //获取Subject
        String username = (String) subect.getPrincipal();
        User user = userService.getUserInfo(username);
        if (user == null){
            return RetMsgUtil.getRetMsg(0,"请登录后重试！","");
        }
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("userid",user.getId());
        int c = 0;
        List list = null;
        try {
            list = codeMapper.selectList(queryWrapper);
        } catch (Exception e) {
            logger.error("获取用户密码失败！");
        }
        return RetMsgUtil.getRetMsg(list);
    }

    @Override
    public Map getCodeInfoByid(int id) {


        Code code = getCodeByid(id);

        return RetMsgUtil.getRetMsg(code);
    }

    @Override
    public Map addCode(Code code) {
        Subject subect = SecurityUtils.getSubject();   //获取Subject
        String username = (String) subect.getPrincipal();
        User user = userService.getUserInfo(username);
        code.setUserid(user.getId());
        int code2 = 0;
        try {
            code2 = codeMapper.insert(code);
        } catch (Exception e) {
            logger.error("添加新的密码失败！");
        }
        return RetMsgUtil.getRetMsg(code2,"");
    }

    @Override
    public Map delCode(int id) {
        int code = 0;
        try {
            code = codeMapper.deleteById(id);
        } catch (Exception e) {
            logger.error("删除密码失败！");
        }
        return RetMsgUtil.getRetMsg(code,"");
    }

    @Override
    public Map updCode(Code code) {
        Subject subect = SecurityUtils.getSubject();   //获取Subject
        String username = (String) subect.getPrincipal();
        User user = userService.getUserInfo(username);
        code.setUserid(user.getId());
        int code2 = 0;
        try {
            code2 = codeMapper.updateById(code);
        } catch (Exception e) {
            logger.error("更新密码失败！");
        }

        return RetMsgUtil.getRetMsg(code2,"");
    }
}
