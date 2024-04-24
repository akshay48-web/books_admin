package com.booksadmin.bookAdminController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.booksadmin.entity.BooksEntity;
import com.booksadmin.service.BookCollectionClient;
import com.booksadmin.service.BooksService;

@RestController
@RequestMapping("/booksAdmin")
public class BookAdminController {
	
	@Autowired
	BooksService service;
	
	@Autowired
	BookCollectionClient client;
	
	//Testing Api
	@RequestMapping(value = "getAdminName", method = RequestMethod.GET)
	public List<String> getAdminName(){
		return List.of("Akshay","Kapil","Dhaval");
	}
	
	//add
	@PostMapping(value = "/addBooksSubject")
	public BooksEntity add(@RequestBody BooksEntity req){
		return service.addBooksubject(req);
	}
	
	//delete
	@PostMapping(value = "/deleteById/{id}")
	public String deleteById(@PathVariable Long id) {
		return service.deleteById(id);
	}

	//GetBookName and BookCount By bookId feignClient
	@GetMapping(value="/getAllBooksSubjectList")
	public List<BooksEntity> getAllBooksSubjectList(){
		return service.getAllBooksSubjectList();
	}
	
	
	
}
