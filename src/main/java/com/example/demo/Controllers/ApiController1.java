package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController1 {
		@GetMapping("/")
		public String hello() {
					return "welcome";
				}
	}

