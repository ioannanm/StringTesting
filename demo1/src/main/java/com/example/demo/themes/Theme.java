package com.example.demo.themes;

public class Theme {
	
	private int id;
	private String name;
	private String description;
	
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
		return "Theme [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	

}
