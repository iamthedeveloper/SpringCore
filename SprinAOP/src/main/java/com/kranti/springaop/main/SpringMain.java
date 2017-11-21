package com.kranti.springaop.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kranti.springaop.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		System.out.println("Kranti");
		ClassPathXmlApplicationContext SpringContext = new ClassPathXmlApplicationContext("aop-context.xml");
		EmployeeService empService = SpringContext.getBean("employeeService", EmployeeService.class);
		
		System.out.println(empService.getEmployee().getName());
		
		empService.getEmployee().setName("iamthedeveloper");
		
		empService.getEmployee().throwException();
		
		SpringContext.close();
		
	}
}