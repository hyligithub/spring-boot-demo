package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lihuiyan on 2017/2/16.
 */
@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    String home() {
        return "hello  aaa ";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}
