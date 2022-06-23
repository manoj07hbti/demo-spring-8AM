package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public void hello(){

        System.out.println("Hello, Welcome to Spring Boot");
    }

    //END POINT 2

    @RequestMapping("/msg")
    public String helloMessage(){

       return "Hello, Welcome to Spring Boot";
    }

    @RequestMapping("/age")
    public int age(){

        return 25;
    }

    @RequestMapping("/arr")
    public  int[]  array(){

        int arr[]={4,5,6,7,8};
        return arr;
    }

    @RequestMapping("/courses")
    public ArrayList<String> arrayList(){
        ArrayList<String> course= new ArrayList<>();
        course.add("Java");
        course.add("Spring Boot");
        course.add("Cloud");

        return course;
    }

}
