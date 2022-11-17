package com.fj.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/9 20:55    since 1.0.0
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {
    @RequestMapping(
            value = {"/testRequestMapping","/test"},
            method = {RequestMethod.GET,RequestMethod.POST}
    )
    public String success(){
        return "success";
    }
    @GetMapping("/testRequestMapping")
    public String testGetMapping(){
        return "success";
    }
    @RequestMapping(value = "/testput",method = RequestMethod.PUT)
    public String testPut(){
        return "success";
    }
    @RequestMapping("/a?a/testAnt")
    public String testAnt(){
        return "success";
    }
    @RequestMapping("/a*a/testAnt")
    public String testAnt2(){
        return "success";
    }
    @RequestMapping("/**/testAnt")
    public String testAnt3(){
        return "success";
    }
    @RequestMapping("/testPath/{id}")
    public String testPath(@PathVariable("id")Integer id){
        System.out.println("id = " + id);
        return "success";
    }
}
