package com.fj.mvc.controller;

import com.fj.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/10 14:10    since 1.0.0
 */
@Controller
public class ParamController {
    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username = " + username+"  password"+password);
        return "success";
    }
    @RequestMapping("/testParam")
    public String testParam(@RequestParam(value = "user_name",required = false,defaultValue = "hehe") String username,
                            String password,
                            String[] hobby,
                            @RequestHeader("Host") String host,
                            @CookieValue("JSESSIONID") String JSESSIONID){
        System.out.println("username = " + username+"\tpassword = "+password+"\t hobby="+ Arrays.toString(hobby));
        System.out.println("host = " + host);
        System.out.println("JSESSIONID = " + JSESSIONID);
        return "success";
    }
    @RequestMapping("/testBean")
    public String testBean(User user){
        System.out.println("user = " + user);
        return "success";
    }
}
