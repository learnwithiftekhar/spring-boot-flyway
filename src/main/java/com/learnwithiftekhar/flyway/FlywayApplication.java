package com.learnwithiftekhar.flyway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayApplication implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(FlywayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepository
				.findAll()
				.forEach(System.out::println);

		Book book = Book.builder()
				.isbn("2222222")
				.title("test book")
				.build();

		bookRepository.save(book);
	}
}
