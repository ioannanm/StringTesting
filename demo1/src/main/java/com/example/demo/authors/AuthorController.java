//package com.example.demo.authors;
//
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("themes")
//public class AuthorController {
//	@Autowired
//	AuthorServices authorServices;
//
// 	@GetMapping("/hello")
//	public String hello() {
//		return "Hello! :)";
//	}
//
//// 	@GetMapping("/allthemes")
////	public List<Author> getAuthorsAll() {
////		return authorServices.getAuthors();
////	}
//// 	
//// 	@PostMapping("/add")
////	public List<Author> addTheme(@RequestBody Author author) {
////		return authorServices.addAuthor(author);
////	}
//}
