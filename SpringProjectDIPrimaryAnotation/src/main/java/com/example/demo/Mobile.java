package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mobile implements ElectronicDevices {

	public void useDevices() {
		System.out.println("Student is using mobile phone.");
	}
}
