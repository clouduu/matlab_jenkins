package com.jenkins.matlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Hello {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello matlab";
    }
}
