package model;

import java.util.Date;

public class Book {

	private int id;
	private String author;
	private String title;
	private String subject;
	private int rackNumber;
	private boolean isAvailable;
	private User allocatedUser;
	private Date allocatedDate;
	private boolean isReserved;
	private User reserveForUser;
	private User allocatedByLibrarian;
	public int getId() {
		return id;
	}
	public Book(int id, String author, String title, String subject, int rackNumber) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.subject = subject;
		this.rackNumber = rackNumber;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getRackNumber() {
		return rackNumber;
	}
	public void setRackNumber(int rackNumber) {
		this.rackNumber = rackNumber;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public User getAllocatedUser() {
		return allocatedUser;
	}
	public void setAllocatedUser(User allocatedUser) {
		this.allocatedUser = allocatedUser;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", subject=" + subject + "]";
	}
	public Date getAllocatedDate() {
		return allocatedDate;
	}
	public void setAllocatedDate(Date allocatedDate) {
		this.allocatedDate = allocatedDate;
	}
	public User getReserveForUser() {
		return reserveForUser;
	}
	public void setReserveForUser(User reserveForUser) {
		this.reserveForUser = reserveForUser;
	}
	public boolean isReserved() {
		return isReserved;
	}
	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}
	public User getAllocatedByLibrarian() {
		return allocatedByLibrarian;
	}
	public void setAllocatedByLibrarian(User allocatedByLibrarian) {
		this.allocatedByLibrarian = allocatedByLibrarian;
	}
	
}
