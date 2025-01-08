package com.example.demo.authors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.demo.books.Book;


public class AuthorServices {
	
	private List<Author> authors = new ArrayList<Author>();
	
	public void viewAllAuthors() {
		if (authors.isEmpty()) {
			System.out.println("There are no authors.");
			} else {
				System.out.println("Authors: ");
				for (Author author : authors) {
					System.out.println(author);
					}
				}
	}
	
	public void addAuthor(Author author) {
		System.out.println("Adding author : " + "'" + author.getFirstName() + "'" + "'" + author.getLastName() + "'");
		authors.add(author);
	}
	
	public void deleteTheme(Author author) {
		if (authors.isEmpty()) {
			System.out.println("There are no authors to delete.");
			} else {
				System.out.println("Deleting author : " + "'" + author.getFirstName() + "'" + "'" + author.getLastName() + "'");
				authors.remove(author);
		}
	}

	public void updateAuthor(int id) {
		/*for (Author author1 : authors) {
			if(id == author1.getId()) {
				author1.setFirstName(firstName);
				author1.setLastName(lastName);
				author1.setDateOfBirth(dateOfBirth);
			}
		}*/
		
	//	List<String> authorsS = Arrays.asList("Amanda", "Chris", "amali");
		
		
	}
	

}
