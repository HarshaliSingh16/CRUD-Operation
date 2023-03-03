package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	 // Save operation
    Employee saveEmployee(Employee employee);
 
    List<Employee> fetchEmployeeList();
 
    Employee updateEmployee(Employee employee,Long employeeId);
 
    // Delete operation
    void deleteEmployeeById(Long employeeId);

}
