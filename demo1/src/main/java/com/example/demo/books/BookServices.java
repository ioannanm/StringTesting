package com.example.demo.books;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.authors.Author;
import com.example.demo.authors.AuthorServices;
import com.example.demo.themes.Theme;
import com.example.demo.themes.ThemeRepository;
import com.example.demo.themes.ThemeServices;


@Service
public class BookServices {

	@Autowired BookRepository repository;
	
	@Autowired
	ThemeServices ThemeServices;
	@Autowired
	AuthorServices AuthorServices;
	//private List<Book> books = new ArrayList<Book>();
	//private List<Book> RentedBooks = new ArrayList<Book>();

	public BookServices(ThemeServices themeServices, AuthorServices authorServices) {
		this.AuthorServices = authorServices;
		this.ThemeServices = themeServices;
	}

//	public void viewAllBooks() {
//		if (books.isEmpty()) {
//			System.out.println("There are no books.");
//		} else {
//			System.out.println("Books: ");
//			for (Book book : books) {
//				System.out.println(book);
//			}
//		}
//	}

	public List<Book> getBooks() {
		return repository.findAll();
	}


	public List<Book> addBook(Book book) {
		repository.save(book);
		return this.getBooks();
	}

	public List<Book> removeBook(Integer id) {
		repository.deleteById(id);
		return this.getBooks();
	}

	public List<Book> updateBook(int id, String newTitle, Author newAuthor, String newPublisher, Integer newYear,
			String newDesc, ArrayList<Theme> newThemes) {
		for (Book book : this.getBooks()) {
			if (id == book.getId()) {
				if (newTitle != null)
					book.setTitle(newTitle);
				if (newAuthor != null)
					book.setAuthor(newAuthor);
				if (newPublisher != null)
					book.setPublisher(newPublisher);
				if (newYear!= null && newYear > 0)
					book.setPublishedYear(newYear);
				if (newDesc != null)
					book.setDescription(newDesc);
				if (newThemes != null)
					book.setThemes(newThemes);
			}
		}
		return this.getBooks();
	}

	public List<Book> updateBookAuthor(int idBook, int idAuthor) {
		for (Book book : this.getBooks()) {
			if (idBook == book.getId()) {
				for (Author author : AuthorServices.getAuthors()) {
					if (author.getId() == idAuthor) {
						book.setAuthor(author);
						// break;
					}
				}
				// authors.setAuthor();
			}
		}
		return this.getBooks();
	}

	public List<Book> addBookTheme(int idBook, int idTheme) {
		for (Book book : this.getBooks()) {
			if (idBook == book.getId()) {
				for (Theme theme : ThemeServices.getThemes()) {
					if (theme.getId() == idTheme) {
						book.addTheme(theme);
					}
				}
			}
		}
		return this.getBooks();
	}
	
//	public void rentBook(int idBook) {
//		for (Book book : RentedBooks) {
//			if (idBook == book.getId()) 
//				System.out.println("You can't rent this book, someone else has rent it! :( ");
//			else
//				RentedBooks.add(book);				
//			}
//	}
//	
//	public void returnBook(int idBook) {
//		for (Book book : RentedBooks) {
//			if (idBook == book.getId()) 
//				RentedBooks.remove(book);				
//			}
//	}


}
