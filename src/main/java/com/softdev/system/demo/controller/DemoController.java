package com.softdev.system.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.HashMap;


@Controller
public class DemoController {



    @RequestMapping("/index")
    public String indexHtml(HashMap<String, Object> map) {
        map.put("hello", "欢迎进入HTML页面");
        return "/index";
    }

    @RequestMapping("/page")
    public String websocketHtml(HashMap<String, Object> map) {
        map.put("hello", "欢迎进入HTML页面");
        return "/websocket";
    }
}
