package com.example.demosonar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {

	
	@RequestMapping("/hi")
	public String getmethod() {
		System.out.println("sfsfsf");
		System.out.println("sfsfsf");
		System.out.println("sfsfsf");
		System.out.println("sfsfsf");
		System.out.println("sfsfsf");
		
		return "success";
		
		
	}
	
	
	
	
	
}
