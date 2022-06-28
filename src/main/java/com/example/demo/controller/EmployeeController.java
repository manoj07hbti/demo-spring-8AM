package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();

    //1- C -  create / add

    @RequestMapping(value="/add_emp", method = RequestMethod.POST)
    public String addEmployee(@RequestBody Employee employee){

        employeeArrayList.add(employee);
        return "Successfully Added Employee ..";
    }

    //2-R- read /get

    @RequestMapping(value="/get_all_emp", method = RequestMethod.GET)
    public ArrayList<Employee> getEmployeeArrayList(){

        return employeeArrayList;
    }

    //3- U- update

    @RequestMapping(value = "/update_emp", method = RequestMethod.PUT)
    public String update(@RequestParam String name){

        employeeArrayList.get(0).setName(name);

        return "Successfully Updated name as "+name;
    }

    @RequestMapping(value = "/delete_emp/{index}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int index){

        employeeArrayList.remove(index);
        return "Successfully Deleted ....";
    }
}
