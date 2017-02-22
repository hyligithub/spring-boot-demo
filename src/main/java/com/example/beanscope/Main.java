package com.example.beanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lihuiyan on 2017/2/20.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
            if (!p1.equals(p2)) {
                System.out.println("p1 <> p2");
            }
        }
    }
}
