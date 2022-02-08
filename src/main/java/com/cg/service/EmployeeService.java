package com.cg.service;

import java.util.List;

import com.cg.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public List<Employee> getEmployees();
//
//	public String getEmployeeById(int eid);
//
//	public String deleteEmployee(int eid);
//
//	public String updateEmployee(Employee employee, int eid);

}
