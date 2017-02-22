package com.example.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by lihuiyan on 2017/2/20.
 */
@Component
public class EventPublisher {
    @Autowired
    ApplicationContext context;

    public void publish(String msg) {
        context.publishEvent(new DemoEvent(this,msg));
    }
}
