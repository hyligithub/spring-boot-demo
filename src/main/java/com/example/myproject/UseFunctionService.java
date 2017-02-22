package com.example.myproject;

/**
 * Created by lihuiyan on 2017/2/20.
 */
public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String method2(String str) {
        return functionService.method(str);
    }
}
