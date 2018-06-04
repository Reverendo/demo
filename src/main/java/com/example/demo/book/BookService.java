package com.example.demo.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {

	private List <Book> books = Arrays.asList(
			new Book("1", "City of mist", "Genial juego de detectives y superheroes en una ambientación NeoNoir."),
			new Book ("2", "Vampiro: La mariscada", "El clásico juego de politiqueo, ahora ambientado en un famoso restaurante junto al congreso."),
			new Book ("3", "Criaturas tranquilas y espacios abiertos", "Increible juego donde los personajes viajarán por bucolicos paisajes"
					+ " conociendo a tranquilas criaturas que no serán ninguna amenaza."));
	
	public List<Book> getAllBooks (){
		return books;
	}
	
	public Book getBook(String id) {
		
		return books.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public List <Book> getBookByValue(String value) {
		List <Book> results = new ArrayList<Book>();
		for (Book b : books) {
			if (b.getId().contains(value) || b.getName().contains(value) || b.getDescription().contains(value)) {
				results.add(b);
			}
		}
		return results;
	}
}
