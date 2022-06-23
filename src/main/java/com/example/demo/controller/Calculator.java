package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @RequestMapping("/addition")
    public String  add(){
        int a=3;
        int b=7;

       return "Addition of number is " +(a+b);
    }

}
