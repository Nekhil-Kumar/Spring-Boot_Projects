package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectDiPrimaryAnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ac =  SpringApplication.run(SpringProjectDiPrimaryAnotationApplication.class, args);
	
		Student stu = ac.getBean(Student.class);
		
		stu.study();
		stu.workingWithDevice();
	}

}
