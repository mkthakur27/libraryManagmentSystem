package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

	private int id;
	private Map<Integer,List<Book>> rack;
	public Library(int id) {
		// TODO Auto-generated constructor stub
		rack = new HashMap<>();
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, List<Book>> getRack() {
		return rack;
	}

	public void setRack(Map<Integer, List<Book>> rack) {
		this.rack = rack;
	}

	
	public void addBook(Book book)
	{
		List<Book> bookList = rack.get(book.getRackNumber());
		if (bookList == null)
		{
			bookList = new ArrayList<>();
		}
		bookList.add(book);
		rack.put(book.getRackNumber(), bookList);
	}
}
