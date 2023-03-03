package com.example.demo.serviceimpl;

//Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.service.EmployeeService;

//Annotation
@Service

//Class
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	
	// Save operation
	@Override
	public Employee saveEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	

	// Read operation
	@Override public List<Employee> fetchEmployeeList()
	{
		return (List<Employee>)
				employeeRepository.findAll();
	}
	
	

	// Update operation
	@Override
	public Employee updateEmployee(Employee employee,Long employeeId)
	{
		Employee depDB= employeeRepository.findById(employeeId).get();

		if (Objects.nonNull(employee.getEmployeeFirstName())
				&& !"".equalsIgnoreCase(
						employee.getEmployeeFirstName())) {
			depDB.setEmployeeFirstName(
					employee.getEmployeeFirstName());
		}

		if (Objects.nonNull(
				employee.getEmployeeLastName())
				&& !"".equalsIgnoreCase(
						employee.getEmployeeLastName())) {
			depDB.setEmployeeLastName(
					employee.getEmployeeLastName());
		}

		if (Objects.nonNull(employee.getEmployeeEmail())
				&& !"".equalsIgnoreCase(
						employee.getEmployeeEmail())) {
			depDB.setEmployeeEmail(
					employee.getEmployeeEmail());
		}
		return employeeRepository.save(depDB);
	}
	

	// Delete operation
	@Override
	public void deleteEmployeeById(Long employeeId)
	{
		employeeRepository.deleteById(employeeId);
	}
}