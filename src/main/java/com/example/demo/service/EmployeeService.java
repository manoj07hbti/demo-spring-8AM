package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;

    public String addEmployee(Employee employee){

        repository.save(employee);// it will insert data into database
        return "Successfully Added Employee ..";
    }

    public List<Employee> getEmpDB(){

      return repository.findAll();// fetch all records from DB
    }

    public String updateEmployee(String name, Long id){

        //step 1 : get record from DB
        Employee employee=repository.getById(id);// find record from DB
        //change data and save again to db
        employee.setName(name);
        repository.save(employee);
       return "Successfully updated name in DB as "+name;
    }

    public String delete( Long index){

        repository.deleteById(index);// delete form DB
        return "Successfully Deleted ....";
    }
}
