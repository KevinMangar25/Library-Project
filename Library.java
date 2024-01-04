package library;

public class Library {
	private Book[] books;
	private int numBooks;
	
	public Library () {
		books = new Book[50];
		numBooks = 0;
	}
	
	public void addBook(Book newBook) {
		if(numBooks < books.length) {
			books[numBooks] = newBook;
			numBooks++;
		}
	}
	
	public int search(String bookTitle) {
		for(int i = 0; i < numBooks; ++i) {
			if(books[i].getTitle().equals(bookTitle)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean checkOut(String title) {
		int index = search(title);
		boolean answer = false;
		if(index != -1 && books[index].getStatus().equals("available")) {
			books[index].setStatus("out");
			answer = true;
		}
		return answer;
	}
	
	public boolean checkIn(String title) {
		int index = search(title);
		if(index != -1 && (books[index].getStatus().equals("out") || books[index].getStatus().equals("overdue"))) {
			books[index].setStatus("available");
			return true;
		}
		return false;
	}
	
	public boolean markOverdue(String title) {
		int index = search(title);
		if(index != -1 && books[index].getStatus().equals("out")) {
			books[index].setStatus("overdue");
			return true;
		}
		return false;
	}
	
	public String findBooksByStatus(String status) {
		String str = "";
		for(int i = 0; i < numBooks; ++i) {
			if(books[i].getStatus().equals(status)) {
				str += books[i] + "\n" ;
			}
		}
		return str;
	}
	
	public String toString() {
		String str = "";
		for(int i = 0; i < numBooks; ++i) {
			str += books[i] + "\n";
		}
		return str;
	}
}
