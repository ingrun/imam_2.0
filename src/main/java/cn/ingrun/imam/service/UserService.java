package cn.ingrun.imam.service;

import cn.ingrun.imam.domain.User;

import java.util.Map;


/**
 * @Author: IngRun
 * @Date: 2019/8/2 9:48
 * @Description:
 */
public interface UserService {

    public User getUserInfo(String username);

    public Map login(User user);

    public Map isLogin();

}
