package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SonarRestController {
	
	@GetMapping("/sonar")
	public String test(){
		return "Welcome to Sonar Project";
	}

}
