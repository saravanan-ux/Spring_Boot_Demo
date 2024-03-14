package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("user")
public class DemoController {

    @GetMapping
    public String test(){
        return "demo";
    }

    @GetMapping("/rest")
    @ResponseBody
    public String testRest(){
        return "demo";
    }
}
