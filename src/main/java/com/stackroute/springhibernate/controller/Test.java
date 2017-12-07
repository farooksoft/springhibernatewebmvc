package com.stackroute.springhibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stackroute.springhibernate.repository.EmployeeRepository;
@Controller
public class Test {
	@RequestMapping("/")
	public String index(ModelMap model) {
		System.out.println("==============================");
		EmployeeRepository employeeRepository = new EmployeeRepository();
		System.out.println("-------------------------------------------");
		model.addAttribute("employees",employeeRepository.getAllStatus());
		return "index";
	}
	
	@RequestMapping("/pp")
	public String indexpp(ModelMap model) {
		System.out.println("==============================");
		EmployeeRepository employeeRepository = new EmployeeRepository();
		System.out.println("-------------------------------------------");
		model.addAttribute("employees",employeeRepository.getAllStatus());
		return "index";
	}
}
