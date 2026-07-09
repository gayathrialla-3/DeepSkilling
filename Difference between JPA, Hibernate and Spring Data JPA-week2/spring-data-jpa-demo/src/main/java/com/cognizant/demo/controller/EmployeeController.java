package com.cognizant.demo.controller;

import com.cognizant.demo.entity.Employee;
import com.cognizant.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){

        return employeeService.addEmployee(employee);

    }

}