package com.example.demo.themes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import jakarta.persistence.Id;

@Entity
@Table(name = "themes")
public class Theme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "theme_id", nullable = false )
	private int id;
	
	@Column(name = "name", nullable = false )
	private String name;

	@Column(name = "description", nullable = true )
	private String description;
	
	public Theme() {}
	
	public Theme(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desscription) {
		this.description = desscription;
	}

	@Override
	public String toString() {
		return "Theme [id=" + id +"]";
	}
	
	

}
