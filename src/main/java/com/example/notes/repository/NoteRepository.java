package com.example.notes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.notes.entity.Note;

public interface NoteRepository extends JpaRepository<Note,Long>{
                
}
