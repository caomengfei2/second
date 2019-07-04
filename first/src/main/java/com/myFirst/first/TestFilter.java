package com.myFirst.first;




import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
import java.io.IOException;

@WebFilter(filterName="testFilter",urlPatterns="/*")  //@WebFilter是定义过滤器的注解 ，urlPatterns="/*" 定义过滤器过滤的路径

public class TestFilter implements Filter {


    @Override
    public void destroy() {
        System.out.println("过滤器被销毁");
    }

    @Override
    public void doFilter(ServletRequest arg0,ServletResponse arg1, FilterChain arg2)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) arg0;
        HttpServletResponse response = (HttpServletResponse) arg1;
        String contextPath = ((HttpServletRequest) arg0).getContextPath();
        HttpServletMapping result = request.getHttpServletMapping();
        HttpSession session = request.getSession(true);
        System.out.println("过滤器被执行");
        /*Cookie[] cookie=arg0.getCookies();
        HttpSession session = arg0.getSession(true);*/
        arg2.doFilter(arg0, arg1);
    }
    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {

    }
}
