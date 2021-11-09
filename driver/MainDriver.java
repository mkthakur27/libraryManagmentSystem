package driver;

import java.util.List;

import model.Book;
import model.Library;
import model.Role;
import model.User;
import search.Isearch;
import search.SearchByTitle;
import services.BookService;
import services.LibraryService;
import services.UserService;


public class MainDriver {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library(1);
		LibraryService libraryService = new LibraryService();
		UserService userService = new UserService();
		BookService bookService = new BookService();
		
		Book book_1 = new Book(1, "boat", "apple", "Historical", 1);
		Book book_2 = new Book(2, "car", "mango", "Mystry", 1);
		Book book_3 = new Book(3, "train", "apple", "Historical", 1);
		Book book_4 = new Book(4, "train", "apple", "Historical", 1);
		Book book_5 = new Book(5, "Bike", "orange", "Horror", 2);
		Book book_6 = new Book(6, "Bike", "orange", "Horror", 2);
		Book book_7 = new Book(7, "flight", "Bannana", "classic", 2);
		Book book_8 = new Book(8, "boat", "apple", "Historical", 2);
		
		libraryService.addBook(library, book_1);
		libraryService.addBook(library, book_2);
		libraryService.addBook(library, book_3);
		libraryService.addBook(library, book_4);
		libraryService.addBook(library, book_5);
		libraryService.addBook(library, book_6);
		libraryService.addBook(library, book_7);
		libraryService.addBook(library, book_8);
		
		Isearch search = new SearchByTitle();
		
		List<Book> res = search.find("apple",library);
		
		for (Book book : res)
		{
			System.out.println(book.toString());
		}
		
		User admin = new User(1, "Bob", Role.ADMIN);
		User user_1 = new User(2, "Rohit", Role.CUSTOMER);
		User user_2 = new User(3, "Rahul", Role.CUSTOMER);
		User user_3 = new User(4, "Kisan", Role.CUSTOMER);
		
		bookService.checkOutBook(book_8, user_2, user_3);
		List<Book> allBooks = userService.booksAllocatedByUser(admin);
		
		
		
		
		
		
	}

}
