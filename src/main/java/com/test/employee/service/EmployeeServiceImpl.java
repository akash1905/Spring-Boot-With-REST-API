package com.test.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.employee.model.Employee;
import com.test.employee.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository eRepository;
	
	@Override
	public List<Employee> getEmployee() {
		return eRepository.findAll();
	}
}
