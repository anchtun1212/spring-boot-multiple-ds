package com.javach.spring.multiple.ds.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javach.spring.multiple.ds.api.model.book.Book;
import com.javach.spring.multiple.ds.api.model.user.User;
import com.javach.spring.multiple.ds.api.repository.book.BookRepository;
import com.javach.spring.multiple.ds.api.repository.user.UserRepository;

@SpringBootApplication
@RestController
public class SpringBootMultipleDsApplication {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@PostConstruct
	public void addData2DB() {
		userRepository.saveAll(Stream.of(new User(1, "charrada"), new User(2, "skhiri")).collect(Collectors.toList()));
		bookRepository.saveAll(Stream.of(new Book(1, "Java"), new Book(2, "JavaScript")).collect(Collectors.toList()));
	}

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/getBooks")
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultipleDsApplication.class, args);
	}
}
