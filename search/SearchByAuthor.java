package search;

import java.util.List;

import model.Book;
import model.Library;
import model.SearchBy;
import services.LibraryService;

public class SearchByAuthor implements Isearch {

	private LibraryService libService = new LibraryService();
	@Override
	public List<Book> find(String author, Library library) {
		List<Book> allBooks = libService.getBooks(library,SearchBy.AUTHOR,author);
		return allBooks;
	}

}
