package com.example.demo.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	@RequestMapping("/books/book/{id}")
	public Book getBookById(@PathVariable String id) { //Opcionalmente puedes añadir ("nomVariable") si no son iguales
		return bookService.getBook(id);
	}
	@RequestMapping("/books/{value}")
	public List<Book> getBooksByValue(@PathVariable String value) {
		return bookService.getBookByValue(value);

	}
}
