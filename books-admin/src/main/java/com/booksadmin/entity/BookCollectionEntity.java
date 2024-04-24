package com.booksadmin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book_collection_entity")
public class BookCollectionEntity {
	
	private Long bookCollectionId;
	
	@Column(name = "book_name")
	private String bookName;
	@Column(name = "book_count")
	private Long bookCount;
	@Column(name = "book_id")
	private Long bookId;
	
	
	public Long getBookCollectionId() {
		return bookCollectionId;
	}
	public void setBookCollectionId(Long bookCollectionId) {
		this.bookCollectionId = bookCollectionId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Long getBookCount() {
		return bookCount;
	}
	public void setBookCount(Long bookCount) {
		this.bookCount = bookCount;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

}
