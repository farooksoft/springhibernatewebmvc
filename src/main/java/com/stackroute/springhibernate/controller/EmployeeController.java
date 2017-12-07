package com.stackroute.springhibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.springhibernate.model.Employee;
import com.stackroute.springhibernate.repository.EmployeeRepository;

//@Controller
public class EmployeeController {
	
	//@RequestMapping("/")
	public String index(ModelMap model) {
		System.out.println("==============================");
		EmployeeRepository employeeRepository = new EmployeeRepository();
		System.out.println("-------------------------------------------");
		model.addAttribute("employees",employeeRepository.getAllStatus());
		return "index";
	}
	
	//@RequestMapping("/pp")
	public String indexpp(ModelMap model) {
		System.out.println("==============================");
		EmployeeRepository employeeRepository = new EmployeeRepository();
		System.out.println("-------------------------------------------");
		model.addAttribute("employees",employeeRepository.getAllStatus());
		return "index";
	}
	
	@PostMapping("/sendStatus")
	public String sendStatus(@RequestParam("empName") String empName, @RequestParam("status") String status,ModelMap model) {
		EmployeeRepository employeeRepository = new EmployeeRepository();
		Employee emp = new Employee();
		emp.setEmpName(empName);
		emp.setEmpStatus(status);
		emp.setPostedDate(null);
		
		employeeRepository.sendStatus(emp);
		model.addAttribute("employees",employeeRepository.getAllStatus());
		return "redirect:/";
		
	}
}
