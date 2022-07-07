package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DBController {

    @Autowired
    EmployeeService service;

    // C- create/Add
    @RequestMapping(value="/add_emp_db", method = RequestMethod.POST)
    public String addEmployee(@RequestBody Employee employee){

        return service.addEmployee(employee);

    }

    //2-R- read /get

    @RequestMapping(value="/get_all_emp_db", method = RequestMethod.GET)
    public List<Employee> getEmployeeArrayList(){

      return service.getEmpDB();
    }

    //3- U- update

    @RequestMapping(value = "/update_emp_db", method = RequestMethod.PUT)
    public String update(@RequestParam String name, @RequestParam Long id){



        return service.updateEmployee(name,id);
    }

    @RequestMapping(value = "/delete_emp_db/{index}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Long index){

       service.delete(index);
        return "Successfully Deleted ....";
    }


}
