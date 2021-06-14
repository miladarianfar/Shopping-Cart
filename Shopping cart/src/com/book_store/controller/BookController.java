package com.book_store.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.book_store.model.Book;

@SessionScoped
@ManagedBean
public class BookController {

	List<Book> books = new ArrayList();
	List<Book> selectedBook = new ArrayList();
	
	LocalDate date = LocalDate.now();
	
	public LocalDate getDate() {
		return date;
	}

	public List<Book> getBooks() {
		return books;
	}
	
	public List<Book> getSelectedBook() {
		return selectedBook;
	}
	
	@PostConstruct
	public void init() {
		
		Book b1 = new Book(1, "شاهنامه", date, "فردوسی", "book.jpg");
		Book b2 = new Book(2, "گلستان", date, "سعدی", "book2.jpg");
		Book b3 = new Book(3, "بوستان", date, "سعدی", "book3.jpg");
		Book b4 = new Book(4, "Masnavi", date, "Molana", "book.jpg");
		Book b5 = new Book(5, "Random Road", date, "Thomas Kies", "book2.jpg");
		Book b6 = new Book(6, "Gold Diggers", date, "John", "book3.jpg");
		Book b7 = new Book(7, "John Green", date, "John", "book.jpg");
		Book b9 = new Book(8, "Divaneh", date, "John", "book2.jpg");
		Book b8 = new Book(9, "Java Learning", date, "John", "book3.jpg");
		Book b10 = new Book(10, "Python Learning", date, "John", "book.jpg");
		Book b11 = new Book(11, "Php Learning", date, "John", "book2.jpg");
		Book b12 = new Book(12, "Javascript Learning", date, "John", "book3.jpg");
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);
		books.add(b7);
		books.add(b8);
		books.add(b9);
		books.add(b10);
		books.add(b11);
		books.add(b12);
	}
	
	public String addToCard(Book b) {
		
		selectedBook.add(b);
		
		return "";
	}
	
	public String removeFromCard(Book b) {
		
		selectedBook.remove(b);
		
		return "Selected_List";
	}
	
}



















