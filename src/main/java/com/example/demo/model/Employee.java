package com.example.demo.model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="EMPLOYEE_8_AM")// step 1
public class Employee {

    // STEP 3 Primary Key

    @Id   // makes primary key
    @GeneratedValue// automatically assign value and increase it one by one 1,2,3,4,5,6,7........
    Long Id;

    String name;
    double salary;
    String dept;

    // default constructor  // STEP 2
    public Employee() {
    }

    public Employee(String name, double salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    // getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
