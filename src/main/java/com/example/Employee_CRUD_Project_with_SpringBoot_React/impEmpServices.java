package com.example.Employee_CRUD_Project_with_SpringBoot_React;

import java.util.ArrayList;
import java.util.List;

public class impEmpServices implements empServices {

    List<Employee> employees = new ArrayList<>();

    @Override
    public String createEmployee(Employee Employee) {
        employees.add(Employee);
        return "Record Saved Successfully!";
    }

    @Override
    public List<Employee> readEmployees() {
        return employees;
    }

    @Override
    public boolean deleteEmployee(int id) {
        employees.remove(id);
            return true;
    }
    
}
