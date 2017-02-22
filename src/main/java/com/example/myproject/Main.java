package com.example.myproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lihuiyan on 2017/2/20.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.method2("java config"));
        context.close();
    }
}
