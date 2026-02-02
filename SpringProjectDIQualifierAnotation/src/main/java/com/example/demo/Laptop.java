package com.example.demo;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop implements ElectronicDevice {

	public void useDevice() {
		System.out.println("Student is using laptop.");
	}
}
