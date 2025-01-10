package com.example.demo.authors;


import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//
//import com.example.demo.books.Book;
//import com.example.demo.themes.Theme;

import com.example.demo.themes.ThemeRepository;

@Service
public class AuthorServices {

//	private List<Author> authors = new ArrayList<Author>();
//
//	public void viewAllAuthors() {
//		if (authors.isEmpty()) {
//			System.out.println("There are no authors.");
//		} else {
//			System.out.println("Authors: ");
//			for (Author author : authors) {
//				System.out.println(author);
//			}
//		}
//	}

	@Autowired AuthorRepository repository;
	
	
	public List<Author> addAuthor(Author author) {
		//System.out.println("Adding author : " + "'" + author.getFirstName() + "'" + "'" + author.getLastName() + "'");
		repository.save(author);
		return this.getAuthors();
		
	}
	
	
	//events services -> 
	//reservation -> make reservation (eventID ,visitorID)
	// visitor services -> apothikeuei neous visitor, (opos book)
	// visitor -> mono setters getters
	

	

	public List<Author> getAuthors() {
		return repository.findAll();
	}


	public List<Author> removeAuthor(Integer id) {
		repository.deleteById(id);
		return this.getAuthors();
	}

	public List<Author> updateAuthor(int id, String newFirstName, String newLastName, String newDateOfBirth) {
		for (Author author : this.getAuthors()) {
			if (id == author.getId()) {
				if (newFirstName != null)
					author.setFirstName(newFirstName);
				if (newLastName != null)
					author.setLastName(newLastName);
				if (newDateOfBirth != null)
					author.setDateOfBirth(newDateOfBirth);
			}
		}
		return this.getAuthors();
	}

}
