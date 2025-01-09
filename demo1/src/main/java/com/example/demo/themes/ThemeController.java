package com.example.demo.themes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("themes")
public class ThemeController {
	@Autowired
	ThemeServices themeServices;

 	@GetMapping("/hello")
	public String hello() {
		return "Hello! :)";
	}

}
