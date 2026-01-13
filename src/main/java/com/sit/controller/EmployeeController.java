package com.sit.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sit.entity.Employee;
import com.sit.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	// http://localhost:8080/create

	@PostMapping("create")
	public String createProduct(@RequestBody Employee emp) {
		service.createEmployee(emp);
		return "Product Added Successfully.";
	}

	// http://localhost:8080/getAllNames

	@GetMapping("getAllNames")
	public List<String> getAllEmpNames() {
		List<String> list = service.getAllEmpNames();
		return list;
	}

	// http://localhost:8080/countEmp

	@GetMapping("countEmp")
	public long countEmployees() {
		long empCount = service.countEmployees();
		return empCount;
	}

	// http://localhost:8080/getAllNamesDept

	@GetMapping("getAllNamesDept")
	public List<Object[]> getAllNamesDept() {
		List<Object[]> list = service.getAllNamesDept();
		return list;
	}

	// http://localhost:8080/countEmpsEachDept

	@GetMapping("countEmpsEachDept")
	public List<Object[]> countEmpsEachDept() {
		List<Object[]> list = service.countEmpsEachDept();
		return list;
	}

	// http://localhost:8080/highPaidEmp

	@GetMapping("highPaidEmp")
	public List<Object[]> highPaidEmp() {
		List<Object[]> emp = service.highPaidEmp();
		return emp;
	}
	// http://localhost:8080/lowPaidEmp

	@GetMapping("lowPaidEmp")
	public List<Object[]> lowPaidEmp() {
		List<Object[]> emp = service.lowPaidEmp();
		return emp;
	}

	// http://localhost:8080/avgSalary

	@GetMapping("avgSalary")
	public Double avgSalary() {
		Double avgSalary = service.avgSalary();
		return avgSalary;
	}

	// http://localhost:8080/countEmpEarn

	@GetMapping("countEmpEarn")
	public long countEmpEarn() {
		long count = service.countEmpEarn();
		return count;
	}

	// http://localhost:8080/topFive

	@GetMapping("topFive")
	public List<Employee> topFive() {
		List<Employee> topFive = service.topFive();
		return topFive;
	}

	// http://localhost:8080/deptDev

	@GetMapping("deptDev")
	public List<Employee> deptDev() {
		List<Employee> deptDev = service.deptDev();
		return deptDev;
	}

	// http://localhost:8080/salaryBetn

	@GetMapping("salaryBetn")
	public List<Employee> salaryBetn() {
		List<Employee> salaryBetn = service.salaryBetn();
		return salaryBetn;
	}

	// http://localhost:8080/deptNull

	@GetMapping("deptNull")
	public List<Employee> deptNull() {
		List<Employee> deptNull = service.deptNull();
		return deptNull;
	}

	// http://localhost:8080/NameStartsM

	@GetMapping("NameStartsM")
	public List<Employee> NameStartsM() {
		List<Employee> NameStartsM = service.NameStartsM();
		return NameStartsM;
	}

	// http://localhost:8080/salOrderByDesc

	@GetMapping("salOrderByDesc")
	public List<Employee> salOrderByDesc() {
		List<Employee> orderByDesc = service.salOrderByDesc();
		return orderByDesc;
	}

	// http://localhost:8080/totalSal

	@GetMapping("totalSal")
	public BigDecimal totalSal() {
		BigDecimal totalSal = service.totalSal();
		return totalSal;
	}

	// http://localhost:8080/sameName

	@GetMapping("sameName")
	public List<String> sameName() {
		List<String> sameName = service.sameName();
		return sameName;
	}

	// http://localhost:8080/countPuneLocEmp

	@GetMapping("countPuneLocEmp")
	public long countPuneLocEmp() {
		long count = service.countPuneLocEmp();
		return count;
	}
	// http://localhost:8080/avgSalaryDev

	@GetMapping("avgSalaryDev")
	public Double avgSalaryDev() {
		Double count = service.avgSalaryDev();
		return count;
	}

	// http://localhost:8080/SalAboveAvgSal

	@GetMapping("SalAboveAvgSal")
	public List<Employee> SalAboveAvgSal() {
		List<Employee> list = service.SalAboveAvgSal();
		return list;
	}

	// http://localhost:8080/lowestSalaryInTestDept

	@GetMapping("lowestSalaryInTestDept")
	public List<Employee> lowestSalaryInTestDept() {
		List<Employee> list = service.lowestSalaryInTestDept();
		return list;
	}

	// http://localhost:8080/countEmpHiredIn2023

	@GetMapping("countEmpHiredIn2023")
	public long countEmpHiredIn2023() {
		long count = service.countEmpHiredIn2023();
		return count;
	}

	// http://localhost:8080/nameEmpHiredIn2023

	@GetMapping("nameEmpHiredIn2023")
	public List<Employee> nameEmpHiredIn2023() {
		List<Employee> list = service.nameEmpHiredIn2023();
		return list;
	}

	// http://localhost:8080/totalSalaryDevAndSupport

	@GetMapping("totalSalaryDevAndSupport")
	public Double totalSalaryDevAndSupport() {
		Double count = service.totalSalaryDevAndSupport();
		return count;
	}

	// http://localhost:8080/salaryAboveDevAvg

	@GetMapping("salaryAboveDevAvg")
	public List<Employee> salaryAboveDevAvg() {
		List<Employee> list = service.salaryAboveDevAvg();
		return list;
	}

	// http://localhost:8080/totalSalaryInPune

	@GetMapping("totalSalaryInPune")
	public Double totalSalaryInPune() {
		Double count = service.totalSalaryInPune();
		return count;
	}

}
