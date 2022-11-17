package com.fj.mvc.controller;

import com.fj.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/12 20:52    since 1.0.0
 */
@RestController
public class HttpController {
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) throws UnsupportedEncodingException {
        System.out.println("requestBody = " + URLDecoder.decode(requestBody,"UTF-8"));
        return "success";
    }

    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) throws UnsupportedEncodingException {
        System.out.println("requestEntity：" + requestEntity);
        System.out.println("请求头" + requestEntity.getHeaders());
        System.out.println("请求体" + requestEntity.getBody());
        return "success";
    }
    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello response");
    }
    @RequestMapping("/testResponseBody")
    public String testResponseBody(){
        return "success";
    }
    @RequestMapping("/testResponseUser")
    public User testResponseUser(){
        return new User(1001,"admin","125534",13,"女");
    }
}
