package com.practice.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("com.practice.spring");
		appContext.refresh();

		CustomerService customerService = (CustomerService) appContext.getBean("customerService");
		customerService.toString();

		appContext.close();
	}

}
