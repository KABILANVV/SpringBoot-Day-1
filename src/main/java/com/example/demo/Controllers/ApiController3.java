package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController3 {
		String color = "Blue";
		@GetMapping("/3")
		public String getMyFav() {
					return "My Favorite color is "+color+" !";
				}
	}

