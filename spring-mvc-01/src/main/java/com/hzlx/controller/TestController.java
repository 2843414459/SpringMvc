package com.hzlx.controller;

import com.hzlx.entity.BusinessInfo;
import com.hzlx.service.impl.BusinessInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * spring-mvc
 * 2023/5/10 11:59
 * 星期三
 */
@Controller
public class TestController {
    @Autowired
    BusinessInfoServiceImpl businessInfoService;

    /**
     * 测试方法
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hello,test";
    }

    @RequestMapping("/home")
    public String test2(){
        return "system/home";
    }

    @RequestMapping("/homePage")
    public String test3(){
        return "system/homepage";
    }

    @RequestMapping("/user/login")
    public String login(String userName,String password){
        BusinessInfo businessInfo = businessInfoService.login(userName, password);
        if (businessInfo==null) {
            return "index";
        }else {
            return "system/home";
        }
    }
}
