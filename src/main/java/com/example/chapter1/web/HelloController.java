package com.example.chapter1.web;

import com.example.error.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lihuiyan on 2017/2/23.
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "www.jd.com");
        return "index";
    }

    @RequestMapping("/er")
    public String error() throws Exception {
        throw new Exception("发生异常");
    }

    @RequestMapping("/jsonError")
    public String jsonError() throws MyException {
        throw new MyException("发生json异常");
    }
}
