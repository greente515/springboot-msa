package com.example.orderservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")  //gateway  RewritePath test /order 가 없어도 됨
//    @GetMapping("/order/info")
    public String info(@Value("${server.port}") String port) {
        return "order 서비스의 기본 동작 port : {" + port + "}";
    }
}
