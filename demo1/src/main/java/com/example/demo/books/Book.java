package com.example.demo.books;

import java.util.ArrayList;

import com.example.demo.authors.Author;
import com.example.demo.themes.Theme;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "book_id", nullable = false )
	private int id;
	
	@Column(name = "title", nullable = false )
	private String title;
	
	@Column(name = "author", nullable = false )
	private Author author;
	
	@Column(name = "publisher", nullable = false )
	private String publisher;
	
	@Column(name = "publishedYear", nullable = false )
	private int publishedYear;
	
	@Column(name = "description", nullable = true )
	private String description;

	@Column(name = "themes", nullable = true )
	private ArrayList<Theme> themes = new ArrayList<>();
	
	public Book() {}
	public Book(int id, String title, Author author, String publisher, int publishedYear, String description,
			ArrayList<Theme> themes) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishedYear = publishedYear;
		this.description = description;
		this.themes = themes;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", publishedYear=" + publishedYear + ", description=" + description + ", themes=" + themes + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Theme> getThemes() {
		return themes;
	}

	public void setThemes(ArrayList<Theme> themes) {
		this.themes = themes;
	}
	
	
	public void addTheme(Theme theme) {
		themes.add(theme);
		
	}
	
	
	
}
