package ws.ament.microprofile.gettingstarted.rest;

import org.eclipse.microprofile.metrics.annotation.Counted;

import ws.ament.microprofile.gettingstarted.model.Book;
import ws.ament.microprofile.gettingstarted.model.Books;
import ws.ament.microprofile.gettingstarted.service.BookService;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/api/books")
@Counted
public class BooksController {
	@Inject
	private BookService bookService;

	@GET
	@RolesAllowed("read-books")
	public Books findAll() {
		return bookService.getAll();
	}

	@GET
	@Path("/{isbn}")
	public Book getBook(@PathParam("isbn") String isbn) {
		return bookService.getBook(isbn);
	}
}