package com.example.notes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notes.entity.Note;
import com.example.notes.service.NoteService;

@RestController
@CrossOrigin
@RequestMapping("/Managment")
public class NoteController {
	
	@Autowired
	private NoteService noteservice;
	
	@GetMapping("/notee")
	public List<Note> getNotes(){
		return noteservice.readAll();
	}
	
	@PostMapping("/notee")
	public Note saveNote(@RequestBody Note note) {
		return noteservice.saveNote(note);
	}
	
	@GetMapping("/notee/{id}")
	public Note readNote(@PathVariable Long id) {
		return noteservice.readNote(id);
	}
	
	@DeleteMapping("/notee/{id}")
	public ResponseEntity<HttpStatus> deleteNote(@PathVariable Long id) {
		noteservice.delete(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}
    
	@PutMapping("/notee")
	public Note Update(@RequestBody Note note) {
		return noteservice.saveNote(note);
	}
}
