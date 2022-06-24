package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRequestParam {


    @RequestMapping("/hi")// no change in endpoint
    public String hi(@RequestParam String message){


        return "Hi Message is : "+message;
    }

    @RequestMapping("/voting")
    public String voting(@RequestParam int age, @RequestParam String city ){

        return "Age is :"+age +" City is : "+city;
    }
}
