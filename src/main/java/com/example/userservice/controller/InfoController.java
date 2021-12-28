package com.example.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")  //gateway RewritePath test /user 가 없어도 됨
//    @GetMapping("/user/info")
    public String info(@Value("${server.port}") String port) {
        return "user 서비스의 기본 동작 port : {" + port + "}";
    }

//    @GetMapping("/user/auth") //gateway AddRequestHeader, AddResponseHeader test
    @GetMapping("/auth")
    public String auth(@RequestHeader(value = "token") String token) {
        return "token is ::::" + token;
    }
}
