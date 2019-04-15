package com.learn.springbootscala.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kimvra on 2019-04-15
 */
@RestController
public class Hello {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello kimvra...";
    }
}
