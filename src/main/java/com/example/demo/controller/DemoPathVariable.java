package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoPathVariable {

    //path variable SYNTAX  endpoint/{var_name}

    @RequestMapping("/welcome/{name}")
    public String hello(@PathVariable String name){

        return "Welcome to Spring Boot "+name;
    }

    @RequestMapping("/square/{number}")
    public String makeSquare(@PathVariable int number){

        return "Square of given number is "+number*number;
    }


    @RequestMapping("/vote/{age}/{city}")
    public String checkeligiblity(@PathVariable int age, @PathVariable String city ){




        return "You have entered  ...age is "+age +" And city  is :"+city;

    }

}
