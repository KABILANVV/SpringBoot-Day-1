package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController2 {
		String name = "Kabilan";
		@GetMapping("/2")
		public String getName() {
					return "welcome "+name+" !";
				}
	}

