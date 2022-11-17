package com.fj.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/10 22:18    since 1.0.0
 */
@Controller
public class TestController {
//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }
    @RequestMapping("/test_view")
    public String testView(){
        return "test_view";
    }
}
