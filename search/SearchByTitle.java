package search;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.Library;
import model.SearchBy;
import services.LibraryService;

public class SearchByTitle implements Isearch {

	private LibraryService libService = new LibraryService();
	@Override
	public List<Book> find(String title,Library library) {
		
		List<Book> allBooks = libService.getBooks(library,SearchBy.TITLE,title);
		return allBooks;
	}

}
