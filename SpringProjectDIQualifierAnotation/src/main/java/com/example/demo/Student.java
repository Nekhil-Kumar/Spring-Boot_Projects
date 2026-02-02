package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

	ElectronicDevice elecRef;
	
	public Student(@Qualifier("mobile") ElectronicDevice elecRef) {
		this.elecRef = elecRef;
	}
	
	public void study() {
		System.out.println("Student is studying");
	}
	
	public void workingDevice() {
		elecRef.useDevice();
	}
}
