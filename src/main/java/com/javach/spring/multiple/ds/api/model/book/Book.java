package com.javach.spring.multiple.ds.api.model.book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_book")
public class Book {

	@Id
	private int id;
	private String bookName;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int id, String bookName) {
		this.id = id;
		this.bookName = bookName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
}
