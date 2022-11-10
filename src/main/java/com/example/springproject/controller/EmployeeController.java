package com.example.springproject.controller;

import com.example.springproject.entity.EmployeeEntity;
import com.example.springproject.model.Employee;
import com.example.springproject.model.EmployeeResponce;
import com.example.springproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employees/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeEntity> getEmployee(@PathVariable Long employeeId) {
        EmployeeEntity emp = employeeService.getEmployee(employeeId);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

    @PostMapping(path = "/employees", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeResponce> createEmployee(@RequestBody Employee employee) {
        EmployeeResponce emprs = employeeService.createEmployee(employee);
        return new ResponseEntity<EmployeeResponce>(emprs, HttpStatus.OK);
    }

}
