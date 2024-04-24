package com.booksadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.booksadmin.entity.BookCollectionEntity;
import com.booksadmin.entity.BooksEntity;
import com.booksadmin.repositories.BooksRepositories;

@Service
public class BooksService {
	
	@Autowired
	BooksRepositories repo;
	
	@Autowired
	BookCollectionClient client;

	public BooksEntity addBooksubject(BooksEntity req) {
		return repo.save(req);
	}

	public String deleteById(Long id) {
		 repo.deleteById(id);
		return "Data Deleted";
	}

	public List<BooksEntity> getAllBooksSubjectList() {
		List<BooksEntity> list = repo.findAll();
		
//		List<BooksEntity> booksEntity = list.stream().map(i ->{
//			i.setBookCollectionEntity(client.getBookCollectionByBookId(i.getBookCollectionEntity()))
//		})
				try {
				for(BooksEntity obj:list) {
					BookCollectionEntity r = new BookCollectionEntity();
					r.setBookId(obj.getBookId());
					System.out.println(r.getBookId());
					obj.setBookCollectionEntity(client.getBookCollectionByBookId(r));
				}
				}catch (Exception e) {
					e.printStackTrace();
				}
		
		return list;
	}

}
