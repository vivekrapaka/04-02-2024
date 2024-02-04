package libraryManagement;

public class book {
	private String bookName;
	private String author;
	public book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String toString() {
		return "the book " + bookName + " is present on "+ author+ "is avialble";
	}
	
}
