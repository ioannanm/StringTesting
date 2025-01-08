package com.example.demo.themes;

import java.util.ArrayList;
import java.util.List;

public class ThemeServices {
	
	private List<Theme> themes = new ArrayList<Theme>();
	

	public void viewAllThemes() {
		if (themes.isEmpty()) {
			System.out.println("There are no themes.");
			} else {
				System.out.println("Themes: ");
				for (Theme theme : themes) {
					System.out.println(theme);
					}
				}
	}
	
	public void addTheme(Theme theme) {
		System.out.println("Adding theme : " + "'" + theme.getName() + "'");
		themes.add(theme);
	}
	
	public void deleteTheme(Theme theme) {
		if (themes.isEmpty()) {
			System.out.println("There are no themes to delete.");
			} else {
				System.out.println("Deleting theme : " + "'" + theme.getName() + "'");
				themes.remove(theme);
		}
	}
	
	public void updateTheme(int id, Theme theme) {
		for (Theme theme1 : themes) {
			if(id == theme1.getId())
				theme1 = theme;				
		}
	}
	
	
	
}
