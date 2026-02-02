package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	Laptop laptopRef;

	@Autowired
	public Student(Laptop laptopRef) {
		this.laptopRef = laptopRef;
	}

	public void study() {
		System.out.println("Student is Studying.");
	}
	
	public void useLaptop() {
		laptopRef.work();
	}
	
}
