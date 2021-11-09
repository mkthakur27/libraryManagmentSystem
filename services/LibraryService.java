package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.Book;
import model.Library;
import model.SearchBy;

public class LibraryService {

	public LibraryService() {
		// TODO Auto-generated constructor stub
	}
	public void addBook(Library library, Book book)
	{
		library.addBook(book);
	}
	public List<Book> getBooks(Library library,SearchBy searchBy, String toSearch) {
		List<Book> allBooks = new ArrayList<>();
		for (Map.Entry<Integer, List<Book>> entity : library.getRack().entrySet())
		{
			for (Book book : entity.getValue())
			{
				String str = getStr(book,searchBy);
				if (str.equals(toSearch))
				{
					allBooks.add(book);
				}
			}
		}
		return allBooks;
	}
	private String getStr(Book book, SearchBy searchBy) {
		// TODO Auto-generated method stub
		if (searchBy.equals(SearchBy.TITLE))
		{
			return book.getTitle();
		}
		else if (searchBy.equals(SearchBy.AUTHOR))
		{
			return book.getAuthor();
		}
		else if (searchBy.equals(SearchBy.SUBJECT))
		{
			return book.getSubject();
		}
		return null;
	}
	
	
}
