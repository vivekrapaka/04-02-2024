package libraryManagement;

import java.util.ArrayList;
import java.util.Scanner;
public class Library {
	ArrayList<book> books;
	Scanner sc = new Scanner(System.in);
	public Library() {
		books = new ArrayList<book>();
	}
	public void addBook(book book) {
		books.add(book);
		return;
	}
	public void viewBooks() {
		if(books.isEmpty()) {
			System.out.println("Books are not avilable");
		}else {
			for(book book : books) {
				System.out.println(book);
			}
		}
	}
	public void searchBook(String author) {
		for(book book : books) {
			if(book.getBookName().equalsIgnoreCase(author)) {
				System.out.println("the book is found"+ book);
				return;
			}else {
				System.out.println("book is not found");
			}
		}
	}
	
}
