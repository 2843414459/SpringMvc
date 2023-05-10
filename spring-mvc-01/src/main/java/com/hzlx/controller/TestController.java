package com.hzlx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * spring-mvc
 * 2023/5/10 11:59
 * 星期三
 */
@Controller
public class TestController {
    /**
     * 测试方法
     * @return
     */
    @RequestMapping("/test")
    public String test(){
        return "Hello SpringMVC";
    }
}
