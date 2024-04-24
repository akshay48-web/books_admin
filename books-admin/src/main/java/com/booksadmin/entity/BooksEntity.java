package com.booksadmin.entity;

import java.util.List;

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

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books_entity")
public class BooksEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long bookId;
	@Column(name="subject_name")
	private String subjectName;
	//transient not performing any operation in Db
	transient private List<BookCollectionEntity> bookCollectionEntity;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public List<BookCollectionEntity> getBookCollectionEntity() {
		return bookCollectionEntity;
	}

	public void setBookCollectionEntity(List<BookCollectionEntity> bookCollectionEntity) {
		this.bookCollectionEntity = bookCollectionEntity;
	}
	
	

}
