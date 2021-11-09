package services;

import java.util.List;

import model.Book;
import model.User;

public class UserService {

	public void notifyUserForBook(User user,Book book)
	{ 
		
	}
	
	public List<Book> booksAllocatedByUser(User user)
	{
		return user.getBookAllocatedByUser();
	}
}
