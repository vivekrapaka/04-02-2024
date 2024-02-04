package libraryManagement;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library library = new Library();
		int choice;
		do {
			System.out.println("Library management menu");
			System.out.println("1. add book");
			System.out.println("2. view books");
			System.out.println("3. search book");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 : System.out.println();
			System.out.println("Enter the book name");
			String bookName = sc.nextLine();
			System.out.println("Enter the book author");
			String bookAuthor = sc.nextLine();
			book book = new book(bookName, bookAuthor);
			library.addBook(book);
			break;
			case 2: System.out.println();
			library.viewBooks();
			break;
			case 3 : System.out.println();
			String searchs = sc.nextLine();
			library.searchBook(searchs);
			defalut : System.out.println("enter the correct input");
			}
		}while(choice != 4);
	}
}
