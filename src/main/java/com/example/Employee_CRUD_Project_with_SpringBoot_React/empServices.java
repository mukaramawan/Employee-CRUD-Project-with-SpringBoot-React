package com.example.Employee_CRUD_Project_with_SpringBoot_React;

import java.util.List;

public interface empServices {
    String createEmployee(Employee Employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(int id);
} 
