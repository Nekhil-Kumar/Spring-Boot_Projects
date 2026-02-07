package com.KodNest.demo.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	public String generateMessag(String name) {
		return "Hello, " + name + " welcome to Kodnest";
	}
}
