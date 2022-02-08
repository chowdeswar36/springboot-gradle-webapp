package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.EmployeeDao;
import com.cg.entity.Employee;
import com.cg.util.Constants;

@Service
public class EmployeeServiceImpl extends Constants implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee addEmployee(Employee employee) {
		service_logger.info("It adds the employee details ");
		return employeeDao.save(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		service_logger.info("It gives the all employee details ");
		return employeeDao.findAll();
	}
}
