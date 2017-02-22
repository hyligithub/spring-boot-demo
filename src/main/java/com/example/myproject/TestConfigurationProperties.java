package com.example.myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by lihuiyan on 2017/2/22.
 */
@RestController
@SpringBootApplication
public class TestConfigurationProperties {
    @Autowired
    public AuthorBean authorBean;

    @RequestMapping("/123")
    public String index() {
        return "author name is " + authorBean.getName() + ",author age is " + authorBean.getAge();
    }

    public static void main(String[] args) {
        SpringApplication.run(TestConfigurationProperties.class);
    }
}
