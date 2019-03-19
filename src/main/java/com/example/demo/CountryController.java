package com.example.demo;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	@Autowired
	CountryRepository counterRepo;
	
	@Autowired
	NoteRepository noteRepo;
	
	@Autowired
	ParentRepo parentRepo;
	
	
	@GetMapping("/getEntries")
	public List<Parent> getAll() {
		
		return parentRepo.findAll();
		
		
	}
	
	@PostMapping("/notes")
	public Note createNote(@Valid @RequestBody Note note) {
	    return noteRepo.save(note);
	}

}
