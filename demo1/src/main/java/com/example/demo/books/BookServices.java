package com.example.demo.books;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.authors.Author;
import com.example.demo.authors.AuthorServices;
import com.example.demo.themes.Theme;
import com.example.demo.themes.ThemeServices;


public class BookServices {


	ThemeServices ThemeServices ;
	AuthorServices AuthorServices;
	private List<Book> books = new ArrayList<Book>();
	
	public BookServices(ThemeServices themeServices, AuthorServices authorServices) {
		this.AuthorServices = authorServices;
		this.ThemeServices = themeServices;
	}
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
	

	public List<Book> removeBook(int id) {
		books.removeIf(book -> book.getId() == id);
		return books;
	}

	public List<Book> updateBook(int id, String newTitle ,Author newAuthor, String newPublisher, int newYear, String newDesc, ArrayList<Theme> newThemes) {
		for (Book book : books) {
			if (id == book.getId()) {
				if (newTitle != null)
					book.setTitle(newTitle);;
				if (newAuthor != null)
					book.setAuthor(newAuthor);
				if (newPublisher != null)
					book.setPublisher(newPublisher);
				if (newYear != 0)
					book.setPublishedYear(newYear);
				if (newDesc != null)
					book.setDescription(newDesc);
				if (newThemes != null)
					book.setThemes(newThemes);				
			}
		}
		return books;
	}
	
	public List<Book> updateBookAuthor(int idBook,int idAuthor) {
		for (Book book : books) {
			if (idBook == book.getId()) {
				for(Author author : AuthorServices.getAuthors()) {
					if(author.getId() == idAuthor) {
						book.setAuthor(author);
					//	break;
					}
				}
				//authors.setAuthor();
			}
		}
		return books;
	}
	
	public List<Book> addBookTheme(int idBook,int idTheme) {
		for (Book book : books) {
			if (idBook == book.getId()) {
				for(Theme theme : ThemeServices.getThemes()) { //allios methodos mesa sti ThemeServices 
					if(theme.getId() == idTheme) {
						book.addTheme(theme);
					}
				}
			}
		}
		return books;
	}

}
