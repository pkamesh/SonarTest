package com.example.demosonar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {

	
	@RequestMapping("/hi")
	public String getmethod() {
		System.out.println("11111");
		//System.out.println("11111");
		System.out.println("11111");
		System.out.println("22222");
		return "success";
		
		
	}
	
	
	
	
	
}
