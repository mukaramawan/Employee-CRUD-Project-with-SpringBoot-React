package com.example.Employee_CRUD_Project_with_SpringBoot_React;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class empController {

    List<Employee> employees = new ArrayList<>();

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee nEmployee) {
        employees.add(nEmployee);
        return "Employee Saved Successfully";
    }
    
    

}
