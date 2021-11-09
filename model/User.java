package model;

import java.util.List;

public class User {
	private int id;
	private String name;
	private List<Book> allocatedBooks;
	private List<Book> bookAllocatedByUser;
	Role role;
	
	public User(int id, String name, Role role) {
		this.id = id;
		this.name = name;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getAllocatedBooks() {
		return allocatedBooks;
	}
	public void setAllocatedBooks(List<Book> allocatedBooks) {
		this.allocatedBooks = allocatedBooks;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Book> getBookAllocatedByUser() {
		return bookAllocatedByUser;
	}
	public void setBookAllocatedByUser(List<Book> bookAllocatedByUser) {
		this.bookAllocatedByUser = bookAllocatedByUser;
	}
}
