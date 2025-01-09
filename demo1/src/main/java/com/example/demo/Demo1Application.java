package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.themes.Theme;
import com.example.demo.themes.ThemeServices;
import com.example.demo.users.User;
import com.example.demo.users.UserServices;
import com.example.demo.authors.Author;
import com.example.demo.authors.AuthorServices;
import com.example.demo.books.Book;
import com.example.demo.books.BookServices;
import com.example.demo.rent.Rent;
import com.example.demo.rent.RentServices;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		
		
		
		ThemeServices themeServices = new ThemeServices();
		AuthorServices authorServices = new AuthorServices();
		BookServices bookServices = new BookServices(themeServices, authorServices);
		UserServices userServices  = new UserServices();
		RentServices rentServices  = new RentServices(bookServices, userServices);
		
		themeServices.addTheme(new Theme(1, "Sci-Fi", "Science Fiction"));
		themeServices.addTheme(new Theme(2, "Romance", "Love"));
		themeServices.addTheme(new Theme(3, "Comedy", "Hahaha"));
		themeServices.addTheme(new Theme(4, "Fantasy", "Vampires and Werewolves"));
		themeServices.addTheme(new Theme(5, "Horror", "So scary"));
		
		Author author1 = new Author(1,"Ioanna","Markou", "7 Feb");
		authorServices.addAuthor(author1);
		authorServices.addAuthor(new Author(2,"Despoina","Papadopoulou", "20 Feb"));
		authorServices.addAuthor(new Author(3,"Thodoris","Maikantis", "19 Dec"));
		
		Book book1 = new Book(1,"Twilight", author1, " ", 2017, "Edward and Bella Meet", new ArrayList<Theme>());
		bookServices.addBook(book1);
		bookServices.addBook(new Book(2,"Twilight: New Moon", author1, " ", 2018, "Edward and Bella Break Up", new ArrayList<Theme>()));
		bookServices.addBook(new Book(3,"Twilight: Eclipse", author1, " ", 2019, "Edward and Bella Get Back Together", new ArrayList<Theme>()));
		bookServices.addBook(new Book(4,"Twilight: Breaking Dawn", author1, " ", 2020, "Edward and Bella Get Married and Have a Baby", new ArrayList<Theme>()));
		
		bookServices.addBookTheme(1, 2);
		bookServices.addBookTheme(2, 2);
		bookServices.addBookTheme(3, 2);
		bookServices.addBookTheme(4, 2);
		
		User user1 = new User(1,"name1","sname1", "7 Feb");
		userServices.addUser(user1);
		userServices.addUser(new User(2,"name2","sname2", "20 Feb"));
		userServices.addUser(new User(3,"name3","sname2", "19 Dec"));
		
		//Rent rent1 = new Rent(1,user1, book1, "Date");
		//rentServices.addRentedBook(rent1);
		rentServices.rentBook(1,1); //o user 1 kanei rent to book 1
		rentServices.viewAllRentedBooks();
		
		rentServices.rentBook(2,1);
		rentServices.viewAllRentedBooks();
		
		rentServices.returnBook(1, 1);

		rentServices.viewAllRentedBooks();

		rentServices.rentBook(2,1);
		rentServices.viewAllRentedBooks();
		

		rentServices.rentBook(2,2);
		rentServices.viewAllRentedBooks();

		rentServices.rentBook(1,3);
		rentServices.viewAllRentedBooks();

		rentServices.returnBook(2, 2);

		rentServices.viewAllRentedBooks();
//		bookServices.addBookTheme(3, 1);
		
		themeServices.getThemes().forEach(x -> System.out.println(x.toString()));
		
		System.out.println("-----------------------------------------");
		bookServices.viewAllBooks();
		

		System.out.println("-----------------------------------------");	
		
		bookServices.updateBook(4,"Twilight: Breaking Dawn Part 1", null, null, 0, null, null);		
		bookServices.viewAllBooks();

		System.out.println("-----------------------------------------");
		
		bookServices.updateBookAuthor(3,2);
		bookServices.viewAllBooks();
		
		
		System.out.println("-----------------------------------------");
		bookServices.removeBook(2);
		bookServices.viewAllBooks();
		
		
		System.out.println("-----------------------------------------");
		bookServices.addBookTheme(3, 5);
		bookServices.viewAllBooks();
		
		
	}

}
