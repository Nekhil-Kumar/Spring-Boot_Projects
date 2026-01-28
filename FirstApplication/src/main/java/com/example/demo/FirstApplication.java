package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FirstApplication.class, args);
		Student stu = ac.getBean(Student.class);
		stu.setRoll(12);
		stu.setName("Nekhil");
		System.out.println("Student Roll : " + stu.getRoll());
		System.out.println("Student Name : " + stu.getName());
	}

}
