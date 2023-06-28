package com.example.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notes.entity.Note;
import com.example.notes.repository.NoteRepository;

@Service
public class NoteServiceimpl implements NoteService {
    
	@Autowired
	private NoteRepository noteRepository;
	
	@Override
	public List<Note> readAll() {
		return noteRepository.findAll();
	}
	
	@Override
	public Note saveNote(Note note) {
		return noteRepository.save(note);
	}

	@Override
	public Note readNote(Long id) {
		return noteRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Note is not present for the id"+id) );
	}

	@Override
	public void delete(Long id) {
		Note existingNote=readNote(id);
		noteRepository.delete(existingNote);
	}


	
	
	
	

}
