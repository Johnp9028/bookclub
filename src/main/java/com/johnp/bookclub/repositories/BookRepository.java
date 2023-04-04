package com.johnp.bookclub.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.johnp.bookclub.models.Book;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findAll();
	public Optional<Book> findById(Long Id);
}
