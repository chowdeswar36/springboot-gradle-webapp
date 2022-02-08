package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;
import com.cg.util.Constants;

@Controller
public class EmployeeController extends Constants {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/")
	public String getHomePage() {
		control_logger.info("It opend the Homepage");
		return "HomePage";
	}

	@GetMapping("/addemployee")
	public String getAddEmployeePage(Employee employee) {
		control_logger.info("It displayed the AddEmployee page");
		return "AddEmployee";
	}

	@PostMapping("/saveemployee")
	public String saveEmployee(@Valid Employee employee, Errors errors) {
		if (errors.getErrorCount() > 0) {
			control_logger.info("It dispayed the errors messages and return to the AddEmployee page");
			return "AddEmployee";
		}
		employeeService.addEmployee(employee);
		control_logger.info("It saved the employee details and return to the getEmployees path");
		return "redirect:/getemployees";
	}

	@RequestMapping("/getemployees")
	public String getEmployees(Model model) {
		List<Employee> list = employeeService.getEmployees();
		control_logger.info("It gets all the employeee details and adds to the model attribute");
		model.addAttribute("listofemployees", list);
		control_logger.info("It added the list of employees to the ViewEmployee page");
		return "ViewEmployees";
	}

}
