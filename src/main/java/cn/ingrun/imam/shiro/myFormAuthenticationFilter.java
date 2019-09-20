package cn.ingrun.imam.shiro;

import cn.ingrun.imam.Utils.RetMsgUtil;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.json.JSONObject;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-06 18:53
 * @Description:  自定义的shirofilter
 */


//自定义的shirofilter   过滤器
public class myFormAuthenticationFilter extends FormAuthenticationFilter {

    @Override    //非法访问处理
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
//        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        HttpServletResponse httpServletResponse = (HttpServletResponse)response;
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json");
        JSONObject jsonObject = new JSONObject(RetMsgUtil.getRetMsg(0,"请登录后重试！",""));
        httpServletResponse.getWriter().write(jsonObject.toString());

        return Boolean.FALSE;
    }


    @Override   //访问验证
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        Subject subject = getSubject(request, response);
        //当前用户是否已经登录或者是使用了rememberMe;
        return subject.isAuthenticated()||subject.isRemembered();
    }
}
