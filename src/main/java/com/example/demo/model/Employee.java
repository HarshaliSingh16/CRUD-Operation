package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//Importing required classes
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//Annotations
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

//Class
public class Employee {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 
 private Long employeeId;
 private String employeeFirstName;
 private String employeeLastName;
 private String employeeEmail;
 private int employeeAge;
public Long getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Long employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeFirstName() {
	return employeeFirstName;
}
public void setEmployeeFirstName(String employeeFirstName) {
	this.employeeFirstName = employeeFirstName;
}
public String getEmployeeLastName() {
	return employeeLastName;
}
public void setEmployeeLastName(String employeeLastName) {
	this.employeeLastName = employeeLastName;
}
public String getEmployeeEmail() {
	return employeeEmail;
}
public void setEmployeeEmail(String employeeEmail) {
	this.employeeEmail = employeeEmail;
}
public int getEmployeeAge() {
	return employeeAge;
}
public void setEmployeeAge(int employeeAge) {
	this.employeeAge = employeeAge;
}
}
