package com.sit.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sit.entity.Employee;
import com.sit.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public void createEmployee(Employee emp) {
		repository.createemployee(emp);

	}

	public List<String> getAllEmpNames() {
		List<String> list = repository.getAllEmpNames();
		return list;
	}

	public long countEmployees() {
		long countEmp = repository.countEmp();
		return countEmp;
	}

	public List<Object[]> getAllNamesDept() {
		List<Object[]> list = repository.getAllNamesDept();
		return list;
	}

	public List<Object[]> countEmpsEachDept() {
		List<Object[]> list = repository.countEmpsEachDept();
		return list;
	}

	public List<Object[]> highPaidEmp() {
		List<Object[]> emp = repository.highPaidEmp();
		return emp;
	}

	public List<Object[]> lowPaidEmp() {
		List<Object[]> emp = repository.lowPaidEmp();
		return emp;
	}
	
	public long countEmpEarn() {
		long count = repository.countEmpEarn();
		return count;
	}

	public Double avgSalary() {
		Double avgSalary = repository.avgSalary();
		return avgSalary;
	}

	public List<Employee> topFive() {
		List<Employee> topFive = repository.topFive();
		return topFive;
	}

	public List<Employee> deptDev() {
		List<Employee> deptDev = repository.deptDev();
		return deptDev;
	}

	public List<Employee> salaryBetn() {
		List<Employee> salaryBetn = repository.salaryBetn();
		return salaryBetn;
	}

	public List<Employee> deptNull() {
		List<Employee> deptNull = repository.deptNull();
		return deptNull;
	}

	public List<Employee> NameStartsM() {
		List<Employee> NameStartsM = repository.NameStartsM();
		return NameStartsM;
	}

	public List<Employee> salOrderByDesc() {
		List<Employee> salOrderByDesc = repository.salOrderByDesc();
		return salOrderByDesc;
	}
	
	public BigDecimal totalSal() {
		BigDecimal totalSal = repository.totalSal();
		return totalSal;
	}
	
	public List<String> sameName() {
		List<String> sameName = repository.sameName();
		return sameName;
	}

	public long countPuneLocEmp() {
		long count = repository.countPuneLocEmp();
		return count;
	}
	
	public Double avgSalaryDev() {
		Double count = repository.avgSalaryDev();
		return count;
	}
	
	public List<Employee> SalAboveAvgSal() {
		List<Employee> list = repository.salAboveAvgSal();
		return list;
	}

	public List<Employee> lowestSalaryInTestDept() {
		List<Employee> list = repository.lowestSalaryInTestDept();
		return list;
	}
	
	public long countEmpHiredIn2023() {
		long count = repository.countEmpHiredIn2023();
		return count;
	}
	
	public List<Employee> nameEmpHiredIn2023() {
		List<Employee> list = repository.nameEmpHiredIn2023();
		return list;
	}
	
	public double totalSalaryDevAndSupport() {
		double total = repository.totalSalaryDevAndSupport();
		return total;
	}
	
	public List<Employee> salaryAboveDevAvg() {
		List<Employee> list = repository.salaryAboveDevAvg();
		return list;
	}
	
	public double totalSalaryInPune() {
		double total = repository.totalSalaryInPune();
		return total;
	}
	
}
