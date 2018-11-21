package com.javach.spring.multiple.ds.api.repository.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javach.spring.multiple.ds.api.model.book.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
