package com.booksadmin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booksadmin.entity.BooksEntity;

public interface BooksRepositories extends JpaRepository<BooksEntity,Long>{

}
