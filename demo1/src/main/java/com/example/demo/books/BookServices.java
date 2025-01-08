package com.example.demo.books;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.themes.Theme;


public class BookServices {
	
	private List<Book> books = new ArrayList<Book>();
	
	public void viewAllBooks() {
		if (books.isEmpty()) {
			System.out.println("There are no books.");
			} else {
				System.out.println("Books: ");
				for (Book book : books) {
					System.out.println(book);
					}
				}
	}
	
	public void addBook(Book book) {
		System.out.println("Adding book : " + "'" + book.getTitle() + "'");
		books.add(book);
	}
	
	public void deleteBook(Book book) {
		if (books.isEmpty()) {
			System.out.println("There are no books to delete.");
			} else {
				System.out.println("Deleting book : " + "'" + book.getTitle() + "'");
				books.remove(book);
		}
	}
	
	public void updateBook(int id, Book book) {
		for (Book book1 : books) {
			if(id == book1.getId())
				book1 = book;				
		}
	}
	
	

}
