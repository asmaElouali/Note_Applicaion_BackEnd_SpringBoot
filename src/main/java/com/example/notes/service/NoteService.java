package com.example.notes.service;

import java.util.List;

import com.example.notes.entity.Note;

public interface NoteService{
   
	List<Note> readAll();
	Note saveNote(Note note);
	Note readNote(Long id);
	void delete(Long id);
   
}
