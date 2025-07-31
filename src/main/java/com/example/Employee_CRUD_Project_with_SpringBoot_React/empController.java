package com.example.Employee_CRUD_Project_with_SpringBoot_React;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class empController {

    // List<Employee> employees = new ArrayList<>();
    empServices empServices = new impEmpServices(); 

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return empServices.readEmployees();
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        // employees.add(employee);

        return empServices.createEmployee(employee);
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable int id){
        if(empServices.deleteEmployee(id))
            return "Record Delete Successfully";
        else
            return "Record not found"; 
    }
    
    

}
