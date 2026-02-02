package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements ElectronicDevices{

	public void useDevices() {
		System.out.println("Student is using laptop.");
	}
}
