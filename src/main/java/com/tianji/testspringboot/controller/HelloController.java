package com.tianji.testspringboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "没有任务拦截,成功写通了第一个纯净版接口!";
    }

}
