package com.booksadmin.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.booksadmin.entity.BookCollectionEntity;

@FeignClient(url = "http://localhost:9092" , value = "Book-Collection-client")
//below line work with same service but different ports. / Load balancing chapter
/* @FeignClient(name = "BOOKS-COLLECTION") */
public interface BookCollectionClient {
	
	@RequestMapping(value = "/bookCollection/getBookCollectionByBookId")
	List<BookCollectionEntity> getBookCollectionByBookId(@RequestBody BookCollectionEntity req);

}
