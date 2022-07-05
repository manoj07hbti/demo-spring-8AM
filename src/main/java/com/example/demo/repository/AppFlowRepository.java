package com.example.demo.repository;

import org.springframework.stereotype.Repository;

// ALl database operation : insert , delete , update
@Repository
public class AppFlowRepository {

    public String hello(){

        return "Response from Repository....";
    }
}
