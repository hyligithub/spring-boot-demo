package com.example.myproject;

/**
 * Created by lihuiyan on 2017/2/22.
 */
public class HelloService {

    private String msg;

    public String sayHello() {
        return "hello" + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
