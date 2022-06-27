package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();

    //1- C -  create / add

    @RequestMapping("/add_emp")
    public String addEmployee(){

        Employee employee= new Employee("Raj",234345.2,"IT");
        employeeArrayList.add(employee);
        return "Successfully Added Employee ..";
    }

    //2-R- read /get

    @RequestMapping("/get_all_emp")
    public ArrayList<Employee> getEmployeeArrayList(){

        return employeeArrayList;
    }

    //3- U- update

    @RequestMapping("/update_emp")
    public String update(@RequestParam String name){

        employeeArrayList.get(0).setName(name);

        return "Successfully Updated name as "+name;
    }

    @RequestMapping("/delete_emp/{index}")
    public String delete(@PathVariable int index){

        employeeArrayList.remove(index);
        return "Successfully Deleted ....";
    }
}
