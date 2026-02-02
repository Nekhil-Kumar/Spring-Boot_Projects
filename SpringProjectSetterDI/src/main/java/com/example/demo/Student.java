package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	Laptop laptopRef;
	
	public void study() {
		System.out.println("Student is studying.");
	}
	public void uselaptop() {
		laptopRef.work();
	}
	public Laptop getLaptopRef() {
		return laptopRef;
	}
	@Autowired
	public void setLaptopRef(Laptop laptopRef) {
		this.laptopRef = laptopRef;
	}
	
}

