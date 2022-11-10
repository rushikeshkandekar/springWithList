package com.example.springproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeEntity {
    private Long employeeId;
    private String firstName;
    private String lastName;

}
