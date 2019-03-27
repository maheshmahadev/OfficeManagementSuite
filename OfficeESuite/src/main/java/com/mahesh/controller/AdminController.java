package com.mahesh.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahesh.model.Employee;
import com.mahesh.repository.EmployeeRepository;

@RestController
public class AdminController {

	private final EmployeeRepository employeeRepository;

	@Autowired
	public AdminController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@PostMapping("/addemployee")
	public String addEmployee(@Valid Employee employee) {
		employeeRepository.save(employee);
		return "success";
	}
}
