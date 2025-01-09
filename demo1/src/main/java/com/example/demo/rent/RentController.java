package com.example.demo.rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rents")
public class RentController {

	@Autowired
	RentServices rentServices;

 	@GetMapping("/hello")
	public String hello() {
		return "Hello! :)";
	}
}


