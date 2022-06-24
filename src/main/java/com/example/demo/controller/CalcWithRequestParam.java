package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcWithRequestParam {

    @RequestMapping("/add_request_param")
    public String add(@RequestParam int a , @RequestParam int b){

        return "SUM of a and b is "+(a+b);
    }

}
