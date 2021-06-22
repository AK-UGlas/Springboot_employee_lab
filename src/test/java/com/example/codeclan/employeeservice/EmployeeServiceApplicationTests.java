package com.example.codeclan.employeeservice;

import com.example.codeclan.employeeservice.models.Employee;
import com.example.codeclan.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository repo;

	@Test
	void contextLoads() {
	}

	@Test
	void canSaveEmployee(){
		Employee employee = new Employee("Allen the Intellij breaker", 38, 123456789, "fakeEmail");
		repo.save(employee);
	}

}
