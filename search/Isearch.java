package search;

import java.util.List;

import model.Book;
import model.Library;

public interface Isearch {

	List<Book> find(String string,Library library);
}
