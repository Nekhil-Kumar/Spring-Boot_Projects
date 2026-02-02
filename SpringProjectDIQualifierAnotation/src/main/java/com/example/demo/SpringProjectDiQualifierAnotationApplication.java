package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectDiQualifierAnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ac =  SpringApplication.run(SpringProjectDiQualifierAnotationApplication.class, args);
		
		Student stu = ac.getBean(Student.class);
		
		stu.study();
		stu.workingDevice();
	}

}
