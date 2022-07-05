package com.example.demo.controller;

import com.example.demo.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {
    @Autowired
    AppFlowService service;

    @RequestMapping("/app_flow")
    public String hello(){

        //AppFlowService obj= new AppFlowService();

        return service.hello();


    }
}
