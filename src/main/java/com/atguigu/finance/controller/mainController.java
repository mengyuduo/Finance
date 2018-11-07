package com.atguigu.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {

    @RequestMapping("aaa.html")
    public String toMain() {
        return "main";
    }
}
