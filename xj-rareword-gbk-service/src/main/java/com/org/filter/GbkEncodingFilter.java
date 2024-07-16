package com.org.filter;

import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * @author: xj
 * @version: 2024/7/14
 * @description:
 */
@Configuration
public class GbkEncodingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        ServletInputStream inputStream = request.getInputStream();


//        request.setCharacterEncoding("GBK");
//        response.setCharacterEncoding("GBK");
//
        String characterEncoding = request.getCharacterEncoding();

        chain.doFilter(request,response);
    }
}
