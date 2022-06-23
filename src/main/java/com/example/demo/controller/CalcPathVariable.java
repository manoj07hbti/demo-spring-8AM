package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcPathVariable {


    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b ){

        return "Addition of a and b is "+(a+b);
    }
}
