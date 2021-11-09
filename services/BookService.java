package services;

import java.util.Date;
import java.util.List;

import model.Book;
import model.User;

public class BookService {

	private UserService userService = new UserService();
	public User allocatedFor(Book b)
	{
		if (b.isAvailable() == true)
		{
			System.out.println("Book is not allocated to any user");
			return null;
		}
		return b.getAllocatedUser();
	}
	
	public List<Book> allocatedBooksByLibrarian(User user)
	{
		return user.getBookAllocatedByUser();
	}
	
	public void checkOutBook(Book book,User user,User librarian)
	{
		if (user.getAllocatedBooks().size() >= 5)
		{
			System.out.println("No books can be allocated to this user as this user already allocated 5 Books");
			return;
		}
		
		if (book.isAvailable())
		{
			book.setAvailable(false);
			book.setAllocatedUser(user);
			book.setAllocatedDate(new Date());
			book.setAllocatedByLibrarian(librarian);
			List<Book> allocatedBooks = user.getAllocatedBooks();
			allocatedBooks.add(book);
			user.setAllocatedBooks(allocatedBooks);
			
			List<Book> allocatedBooksByLib = librarian.getBookAllocatedByUser();
			allocatedBooksByLib.add(book);
			librarian.setBookAllocatedByUser(allocatedBooksByLib);
		}
		else if (!book.isReserved())
		{
			book.setReserveForUser(user);
		}	
	}
	
	public int returnBook(Book book,User user)
	{
		int fine = 0;
		Date currentDate = new Date();
		int days = currentDate.compareTo(book.getAllocatedDate());
		if ( days> 10)
		{
			fine = (days-10)*1; 
		}
		
		book.setAvailable(true);
		List<Book> allocatedBooks = user.getAllocatedBooks();
		allocatedBooks.remove(book);
		user.setAllocatedBooks(allocatedBooks);
		
		User librarian = book.getAllocatedByLibrarian();
		List<Book> allocatedBy = librarian.getBookAllocatedByUser();
		allocatedBy.remove(book);
		librarian.setBookAllocatedByUser(allocatedBy);
		
		if (book.isReserved())
		{
			userService.notifyUserForBook(user, book);
		}
		
		return fine;
	}
}
