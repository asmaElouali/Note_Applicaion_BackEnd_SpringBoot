package com.example.notes.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="tbl_notes")
public class Note {
    
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column
	private Long id;
    
    @Column
 	private String body;
    
    @Column
	private String category;
    
    @Column
	private String title;
    
    @Column(name="created_at",nullable=false, updatable=false)
    @CreationTimestamp
    private LocalDate createdAt;
    
    @Column(name="updated_at")
    @UpdateTimestamp
    private LocalDate updatedAt;
    
    
    
    public Note() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

    
 
    

}
