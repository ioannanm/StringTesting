package com.example.demo.themes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ThemeServices {
	
	
	@Autowired ThemeRepository repository;
	
	
	public List<Theme> getThemes() {
		return repository.findAll();
	}

	
	public List<Theme> addTheme(Theme theme) {
		repository.save(theme);
		return this.getThemes();
	}
	
	public List<Theme> AddManyThemes(List<Theme> list) {
		for(Theme theme : list){
			repository.save(theme);
 		}
		return this.getThemes();
	}
	
	public List<Theme> removeTheme(Integer id) {
		repository.deleteById(id);
		return this.getThemes();
	}
	
	public List<Theme> updateTheme(Integer id, String newName, String newDescription) {
		for (Theme theme : this.getThemes()) {
			if(id == theme.getId()) {
				if(newName != null) 
	        		theme.setName(newName);
				if(newName != null) 
	        		theme.setName(newName);
			}
		}
		return this.getThemes();
	}
	
	
	

}
