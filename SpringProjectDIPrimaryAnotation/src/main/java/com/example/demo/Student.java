package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {

	ElectronicDevices elecRef;
	
	public Student(ElectronicDevices elecRef) {
		this.elecRef = elecRef;
	}
	
	public void study() {
		System.out.println("Student is studying.");
	}
	
	public void workingWithDevice() {
		elecRef.useDevices();
	}
}
