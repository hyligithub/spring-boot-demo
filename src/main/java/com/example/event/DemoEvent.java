package com.example.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by lihuiyan on 2017/2/20.
 */
public class DemoEvent extends ApplicationEvent {
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
