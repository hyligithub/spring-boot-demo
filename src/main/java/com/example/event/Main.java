package com.example.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lihuiyan on 2017/2/20.
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        EventPublisher publisher = context.getBean(EventPublisher.class);
        publisher.publish("this is a event publisher");
        context.close();
    }

}
