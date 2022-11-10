package com.example.springproject.service;

import com.example.springproject.entity.EmployeeEntity;
import com.example.springproject.model.Employee;
import com.example.springproject.model.EmployeeResponce;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private List<EmployeeEntity> employeeEntities;

    public EmployeeService() {
        employeeEntities = List.of(
                new EmployeeEntity(1L, "rushikesh", "kandekar"),
                new EmployeeEntity(2L, "akshay", "karpe"),
                new EmployeeEntity(3L, "ajit", "aher"),
                new EmployeeEntity(4L, "sanket", "khilari"));
    }

    public EmployeeEntity getEmployee(Long employeeId) {
       EmployeeEntity employeeEntity = null;
       for (EmployeeEntity ex : employeeEntities){
           if (ex.getEmployeeId() == employeeId){
               employeeEntity = ex;
               break;
           }
       }
       return employeeEntity;
    }

    public EmployeeResponce createEmployee(Employee employee) {
        long id = (long) (Math.random() * 20);
        EmployeeResponce emp = new EmployeeResponce();
        emp.setEmployeeid((int) id);
        return emp;
    }

}