package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.themes.Theme;
import com.example.demo.themes.ThemeServices;
import com.example.demo.authors.Author;
import com.example.demo.authors.AuthorServices;
import com.example.demo.books.Book;
import com.example.demo.books.BookServices;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		
		
		
		ThemeServices themeServices = new ThemeServices();
		AuthorServices authorServices = new AuthorServices();
		BookServices bookServices = new BookServices(themeServices, authorServices);
		
		ArrayList<Theme> themata = new ArrayList<Theme>();
		themata.add(new Theme(4, "Fantasy", "Vampires and Werewolves"));
		themata.add(new Theme(2, "Romance", "Love"));
		
		themeServices.addTheme(new Theme(1, "Sci-Fi", "Science Fiction"));
		themeServices.addTheme(new Theme(2, "Romance", "Love"));
		themeServices.addTheme(new Theme(3, "Comedy", "Hahaha"));
		
		Author author1 = new Author(1,"Ioanna","Markou", "7 Feb");
		authorServices.addAuthor(author1);
		authorServices.addAuthor(new Author(2,"Despoina","Papadopoulou", "20 Feb"));
		authorServices.addAuthor(new Author(3,"Thodoris","Maikatzis", "19 Dec"));
		
		bookServices.addBook(new Book(1,"Twilight", author1, " ", 2017, "Edward and Bella Meet", themata));
		bookServices.addBook(new Book(2,"Twilight: New Moon", author1, " ", 2018, "Edward and Bella Break Up", themata));
		bookServices.addBook(new Book(3,"Twilight: Eclipse", author1, " ", 2019, "Edward and Bella Get Back Together", themata));
		bookServices.addBook(new Book(4,"Twilight: Breaking Dawn", author1, " ", 2020, "Edward and Bella Get Married and Have a Baby", themata));
		
		
		
		themeServices.getThemes().forEach(x -> System.out.println(x.toString()));
		
		System.out.println("-----------------------------------------");
		bookServices.viewAllBooks();
		

		System.out.println("-----------------------------------------");	
		
		bookServices.updateBook(4,"Twilight: Breaking Dawn Part 1", null, null, 0, null, null);
		
		System.out.println("-----------------------------------------");
		bookServices.viewAllBooks();
		

		
		
	}

}
