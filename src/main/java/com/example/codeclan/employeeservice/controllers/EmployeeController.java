package com.example.codeclan.employeeservice.controllers;

import com.example.codeclan.employeeservice.models.Employee;
import com.example.codeclan.employeeservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @GetMapping(value = "/employees/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeRepo.findById(id);
    }
}
