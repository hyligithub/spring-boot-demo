package com.example.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by lihuiyan on 2017/2/20.
 */
@Component
public class EventListner implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("我接收到了事件发布者发布的消息：" + msg);
    }
}
