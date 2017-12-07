package com.stackroute.springhibernate.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int EmpId;
	private String EmpName;
	private String EmpStatus;
	private Timestamp postedDate;
	
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpStatus() {
		return EmpStatus;
	}
	public void setEmpStatus(String empStatus) {
		EmpStatus = empStatus;
	}
	public Timestamp getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(Timestamp postedDate) {
		this.postedDate = postedDate;
	}
	
	public Timestamp setCurrentDate() {
		return new Timestamp(System.currentTimeMillis());
	}
}
