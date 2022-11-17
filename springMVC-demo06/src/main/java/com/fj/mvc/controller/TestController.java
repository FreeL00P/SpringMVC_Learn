package com.fj.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/13 15:49    since 1.0.0
 */
@Controller
public class TestController {
    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        return "success";
    }
}
