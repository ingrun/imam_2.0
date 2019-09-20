package cn.ingrun.imam.serviceImpl;

import cn.ingrun.imam.Utils.RetMsgUtil;
import cn.ingrun.imam.domain.User;
import cn.ingrun.imam.mapper.UserMapper;
import cn.ingrun.imam.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: IngRun
 * @Date: 2019/8/2 9:49
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserInfo(String username){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username",username);

        User user = null;
        try {
            user = userMapper.selectOne(queryWrapper);
        } catch (Exception e) {
            logger.error("获取用户信息失败");
            logger.info(user.toString());
        }
        return user;
    }

    @Override
    public Map login(User user)  {
        Subject subect = SecurityUtils.getSubject();   //获取Subject
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getUsername(),user.getPassword());
        usernamePasswordToken.setRememberMe(user.getRememberme());
        int code = 1;
        try {
            subect.login(usernamePasswordToken);
        } catch (AuthenticationException e) {
            code = 0;
            logger.error("loginServiceImpl:" + e);
            logger.info("登录失败！ " + this.getClass());
        }
        return RetMsgUtil.getRetMsg(code ,user.getUsername());
    }

    @Override
    public Map isLogin() {
        Subject subect = SecurityUtils.getSubject();   //获取Subject
        int code = 0;
        String msg = "当前用户未登录！";
        if (subect.isAuthenticated()){
            code = 1;
            msg = "当前用户已登录！";
        }
        return RetMsgUtil.getRetMsg(code,msg,"");
    }
}
