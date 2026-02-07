package com.KodNest.demo.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.KodNest.demo.Services.GreetingService;

@Controller
public class Page {

	@Autowired
	GreetingService greetingService;
	
	@GetMapping("/")
	public String home() {
		return "Welcome";
	}
	
	@RequestMapping("/submitName")
	public String submitName(@RequestParam("userName") String userName, Model model) {
		String greeting = greetingService.generateMessag(userName);
		model.addAttribute("message",greeting);
		return "greeting";
	}
}
