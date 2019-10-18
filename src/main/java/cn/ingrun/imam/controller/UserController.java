package cn.ingrun.imam.controller;

import cn.ingrun.imam.Utils.RetMsgUtil;
import cn.ingrun.imam.domain.User;
import cn.ingrun.imam.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author: IngRun
 * @Date: 2019/8/2 9:18
 * @Description:
 */

@Controller
public class UserController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserService userService;


    @GetMapping("hello")
    @ResponseBody
    public Map hello(){
        logger.info("controller:  /hello");
        return RetMsgUtil.getRetMsg(1,"这是一个测试请求","hello world");
    }

    @GetMapping("api/isLogin")
    @ResponseBody
    public Map isLogin(){
        logger.info("controller:  /isLogin");
        return userService.isLogin();
    }

    @PostMapping("api/login")
    @ResponseBody
    public Map login( @RequestBody User user){
        logger.info("controller:  /login");
        return userService.login(user);
    }

    @PostMapping("api/updPassword")
    @ResponseBody
    public Map updPassword( @RequestBody User user){
        logger.info("controller:  /updPassword");
        return userService.login(user);
    }



}
