package com.example.demo.service;

import com.example.demo.repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// We always keep business logic in service class

@Service
public class AppFlowService {
    @Autowired
    AppFlowRepository repository;

    public String hello(){

        return repository.hello();
    }
}
