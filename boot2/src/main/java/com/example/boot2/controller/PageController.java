package com.example.boot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	
	@GetMapping("/auth/login")
	public String loadIndex() {
		return "index";
	}
	
	
	
	
}
