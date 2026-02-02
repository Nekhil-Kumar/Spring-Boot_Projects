package com.example.demo;

import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile implements ElectronicDevice {

	public void useDevice() {
		System.out.println("Student is Using Mobile.");
	}
}
