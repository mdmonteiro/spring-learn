package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Employee;
import com.example.demo.services.SalaryService;

@SpringBootApplication
public class ClassApplication implements CommandLineRunner {

	private SalaryService salaryService;

	public ClassApplication(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ClassApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maycon", 11000.0);
		double discount = salaryService.netSalary(employee);
		System.out.println("Salário de " + employee.getName() + " = " + discount);

	}

}
