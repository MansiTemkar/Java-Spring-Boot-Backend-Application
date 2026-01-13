package com.sit.repository;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sit.entity.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	SessionFactory factory;

	public void createemployee(Employee emp) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(emp);
		transaction.commit();
		session.close();
	}

	public List<String> getAllEmpNames() {
		Session session = factory.openSession();

		List<String> list = session.createQuery("select e.name from Employee e", String.class).list();

		session.close();
		return list;
	}

	public long countEmp() {
		Session session = factory.openSession();

		long count = session.createQuery("select count(e) from Employee e", Long.class).uniqueResult();

		session.close();
		return count;
	}

	public List<Object[]> getAllNamesDept() {

		Session session = factory.openSession();

		List<Object[]> list = session.createQuery("select e.name, e.department from Employee e", Object[].class).list();

		session.close();
		return list;
	}

	public List<Object[]> countEmpsEachDept() {
		Session session = factory.openSession();

		List<Object[]> list = session
				.createQuery("select e.department,count(e) from Employee e group by e.department", Object[].class)
				.list();

		session.close();
		return list;
	}

	public List<Object[]> highPaidEmp() {

		Session session = factory.openSession();

		List<Object[]> emp = session.createQuery(
				"select e.name, e.salary from Employee e where e.salary = (select max(e2.salary) from Employee e2)",
				Object[].class).list();

		session.close();
		return emp;
	}

	public List<Object[]> lowPaidEmp() {

		Session session = factory.openSession();

		List<Object[]> emp = session.createQuery(
				"select e.name, e.salary from Employee e where e.salary = (select min(e2.salary) from Employee e2)",
				Object[].class).list();

		session.close();
		return emp;
	}

	public long countEmpEarn() {
		Session session = factory.openSession();

		long count = session.createQuery("select count(e) from Employee e where e.salary>50000", Long.class)
				.uniqueResult();

		session.close();
		return count;
	}

	public Double avgSalary() {

		Session session = factory.openSession();

		Double avgSalary = session.createQuery("select round(avg(e.salary),2) from Employee e", Double.class)
				.uniqueResult();

		session.close();
		return avgSalary;
	}

	public List<Employee> topFive() {

		Session session = factory.openSession();

		List<Employee> list = session.createQuery("from Employee e order by e.salary desc", Employee.class)
				.setMaxResults(5).list();

		session.close();
		return list;
	}

	public List<Employee> deptDev() {

		Session session = factory.openSession();

		List<Employee> list = session
				.createQuery("from Employee e where e.department = 'Software Developer'", Employee.class).list();

		session.close();
		return list;
	}

	public List<Employee> salaryBetn() {

		Session session = factory.openSession();

		List<Employee> list = session
				.createQuery("from Employee e where e.salary between 30000 and 60000", Employee.class).list();

		session.close();
		return list;
	}

	public List<Employee> deptNull() {

		Session session = factory.openSession();

		List<Employee> list = session.createQuery("from Employee e where e.department is null", Employee.class).list();

		session.close();
		return list;
	}

	public List<Employee> NameStartsM() {

		Session session = factory.openSession();

		List<Employee> list = session.createQuery("from Employee e where e.name like 'm%'", Employee.class).list();

		session.close();
		return list;
	}

	public List<Employee> salOrderByDesc() {

		Session session = factory.openSession();

		List<Employee> list = session.createQuery("from Employee e order by e.salary desc", Employee.class).list();

		session.close();
		return list;
	}

	public BigDecimal totalSal() {

		Session session = factory.openSession();

		BigDecimal total = session.createQuery("select sum(e.salary) from Employee e", BigDecimal.class).uniqueResult();

		session.close();
		return total;
	}

	public List<String> sameName() {

		Session session = factory.openSession();

		List<String> list = session
				.createQuery("SELECT e.name FROM Employee e GROUP BY e.name HAVING COUNT(e) > 1", String.class).list();

		session.close();
		return list;
	}

	public long countPuneLocEmp() {

		Session session = factory.openSession();

		Long count = session.createQuery("SELECT COUNT(e) FROM Employee e WHERE e.location = 'Pune'", Long.class)
				.uniqueResult();

		session.close();
		return count;
	}

	public Double avgSalaryDev() {

		Session session = factory.openSession();

		Double avgSalary = session
				.createQuery("select round(avg(e.salary),2) from Employee e where e.department='Backend Developer'",
						Double.class)
				.uniqueResult();

		session.close();
		return avgSalary;
	}

	public List<Employee> salAboveAvgSal() {

		Session session = factory.openSession();

		List<Employee> list = session.createQuery(
				"FROM Employee e WHERE e.salary > (SELECT AVG(e2.salary) FROM Employee e2)", Employee.class).list();

		session.close();
		return list;
	}
	
	public List<Employee> lowestSalaryInTestDept() {

	    Session session = factory.openSession();

	    List<Employee> list = session.createQuery(
	        "FROM Employee e WHERE e.department = 'Test' " +
	        "AND e.salary = (SELECT MIN(e2.salary) FROM Employee e2 WHERE e2.department = 'Test')",
	        Employee.class
	    ).list();

	    session.close();
	    return list;
	}

	public long countEmpHiredIn2023() {

	    Session session = factory.openSession();

	    Long count = session.createQuery(
	        "SELECT COUNT(e) FROM Employee e WHERE YEAR(e.hireDate) = 2023",
	        Long.class
	    ).uniqueResult();

	    session.close();
	    return count;
	}
	
	public List<Employee> nameEmpHiredIn2023() {

	    Session session = factory.openSession();

	    List<Employee> list = session.createQuery(
	        "SELECT COUNT(e) FROM Employee e WHERE YEAR(e.hireDate) = 2023",
	        Employee.class
	    ).list();

	    session.close();
	    return list;
	}

	public List<Employee> empHiredIn2023() {

	    Session session = factory.openSession();

	    List<Employee> list = session.createQuery(
	        "FROM Employee e WHERE YEAR(e.hireDate) = 2023",
	        Employee.class
	    ).list();

	    session.close();
	    return list;
	}

	public double totalSalaryDevAndSupport() {

	    Session session = factory.openSession();

	    Double sum = session.createQuery(
	        "SELECT SUM(e.salary) FROM Employee e WHERE e.department IN ('Dev', 'Support')",
	        Double.class
	    ).uniqueResult();

	    session.close();
	    return sum != null ? sum : 0.0;
	}
	
	public List<Employee> salaryAboveDevAvg() {

	    Session session = factory.openSession();

	    List<Employee> list = session.createQuery(
	        "FROM Employee e WHERE e.salary > (" +
	        "SELECT AVG(e2.salary) FROM Employee e2 WHERE e2.department = 'Dev'" +
	        ")",
	        Employee.class
	    ).list();

	    session.close();
	    return list;
	}

	public double totalSalaryInPune() {

	    Session session = factory.openSession();

	    Double sum = session.createQuery(
	        "SELECT SUM(e.salary) FROM Employee e WHERE e.location = 'Pune'",
	        Double.class
	    ).uniqueResult();

	    session.close();
	    return sum;
	}



}
