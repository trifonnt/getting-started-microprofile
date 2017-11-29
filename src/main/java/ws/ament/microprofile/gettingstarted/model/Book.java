package ws.ament.microprofile.gettingstarted.model;

import javax.persistence.Entity;

@Entity
public class Book {
	private String isbn;
	private String author;

	public Book(String isbn, String author) {
		this.isbn = isbn;
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAuthor() {
		return author;
	}
}
