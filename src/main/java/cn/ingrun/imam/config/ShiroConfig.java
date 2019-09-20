package cn.ingrun.imam.config;


import cn.ingrun.imam.shiro.MyShiroRealm;
import cn.ingrun.imam.shiro.myFormAuthenticationFilter;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.mgt.SecurityManager;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;



/**
 * @Author: IngRun
 * @CreateTime: 2019-05-06 15:08
 * @Description: Shiro配置文件
 */
@Configuration
public class ShiroConfig {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Bean
    public ShiroFilterFactoryBean shirFilter() {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager());

        //  配置拦截规则   anon  放行  , authc 拦截
        Map<String,String> map = new LinkedHashMap<>();
        map.put("/","anon");   //回调接口
        map.put("/api/login","anon");   //回调接口
        map.put("/api/isLogin","anon");   //回调接口
        map.put("/**","user");
//        map.put("/**","authc");
        Map<String, Filter> filterMap = new LinkedHashMap<>();
        filterMap.put("user",new myFormAuthenticationFilter());
        shiroFilterFactoryBean.setFilters(filterMap);
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
//        shiroFilterFactoryBean.setLoginUrl("/toLogin");
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");


        return shiroFilterFactoryBean;
    }

    /**
     * 注入 securityManager   shiro 管理器
     */
    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 设置realm.
        securityManager.setRealm(myShiroRealm());   //设置realm
        securityManager.setRememberMeManager(cookieRememberMeManager());  // Remember 管理器
        return securityManager;
    }

    /**
     * 自定义身份认证 realm;
     * <p>
     * 必须写这个类，并加上 @Bean 注解，目的是注入 CustomRealm，
     * 否则会影响 CustomRealm类 中其他类的依赖注入
     */
    @Bean
    public MyShiroRealm myShiroRealm() {
        return new MyShiroRealm();
    }


    //设置cookie信息
    @Bean
    public SimpleCookie rememberMeCookie(){
          SimpleCookie simpleCookie = new SimpleCookie("rememberMe");
          simpleCookie.setMaxAge(604800);
          return simpleCookie;
    }

    //设置 RememberMeManager 管理器  添加要记录的cookie 信息
    @Bean
    public CookieRememberMeManager cookieRememberMeManager(){
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        cookieRememberMeManager.setCookie(rememberMeCookie());
        return cookieRememberMeManager;
    }


}
