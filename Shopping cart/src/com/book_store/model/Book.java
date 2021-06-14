package com.book_store.model;

import java.time.LocalDate;
import java.util.Date;

public class Book {

	private int id;
	private String title;
	private LocalDate DATE_OF_PUBLISH;
	private String img;
	private String author;
	
	public Book() {
		
	}

	public Book(int id, String title, LocalDate dATE_OF_PUBLISH, String author, String img) {
		this.id = id;
		this.title = title;
		DATE_OF_PUBLISH = dATE_OF_PUBLISH;
		this.author = author;
		this.img = img;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDATE_OF_PUBLISH() {
		return DATE_OF_PUBLISH;
	}

	public void setDATE_OF_PUBLISH(LocalDate dATE_OF_PUBLISH) {
		DATE_OF_PUBLISH = dATE_OF_PUBLISH;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
