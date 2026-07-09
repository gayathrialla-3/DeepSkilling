package com.cognizant.demo.service;

import com.cognizant.demo.entity.Employee;
import com.cognizant.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public Employee addEmployee(Employee employee){

        return employeeRepository.save(employee);

    }

}