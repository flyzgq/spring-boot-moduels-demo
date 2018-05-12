package com.fly.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther fly
 * @date 2018/5/9 22:07
 **/
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hello spingboot modules";
    }
}
