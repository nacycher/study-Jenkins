package com.sky.studyjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
user = User.where(id: 1).first
user.password = 'linbo.123'
user.password_confirmation = 'linbo.123'
user.save!