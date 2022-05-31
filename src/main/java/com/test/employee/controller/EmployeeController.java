package com.test.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.employee.model.Employee;
import com.test.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees () {
		return eService.getEmployee();
	}
	
	@GetMapping("/employees/{id}")
	public String getEmployee (@PathVariable("id") Long id) {
		return "Fetching the employee details for the id " + id;
	}
	
	@PostMapping("/employees")
	public String saveEmployee (@RequestBody Employee employee) {
		return "Saving the employee details to the datebase" + employee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		System.out.println("Updateing the employee date for the id " + id);	
		return employee;
	}

	@DeleteMapping("/employees")
	public String deleteEmployee (@RequestParam("id") Long id) {
		return "Deleting the employee details for the id " + id;
	}
}
