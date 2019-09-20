package cn.ingrun.imam.shiro;


import cn.ingrun.imam.domain.User;
import cn.ingrun.imam.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

//实现AuthorizingRealm接口用户用户认证
public class MyShiroRealm extends AuthorizingRealm {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserService userService;

    //角色权限
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        String name= (String) principalCollection.getPrimaryPrincipal();
//        User user = null;
//        try {
//            user = userService.getUserInfo(name);
//        } catch (Exception e) {
//            logger.info("授权失败！");
//        }

//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        simpleAuthorizationInfo.addRole(user.getRole());

        return null;

    }

    //用户认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //加这一步的目的是在Post请求的时候会先进认证，然后在到请求
        if (authenticationToken.getPrincipal() == null) {
            return null;
        }
        String userName = authenticationToken.getPrincipal().toString();

        User user = userService.getUserInfo(userName);
        if (user != null){
            return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());  //此处一定传用户名  否则会导致rememberMe 失效
        }
        return null;

    }
}