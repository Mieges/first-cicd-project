package com.example.cicdtestapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerCICD {

    @GetMapping("/hello")
    String simpleTest() {
        return "Hello CI/CD";
    }
}
