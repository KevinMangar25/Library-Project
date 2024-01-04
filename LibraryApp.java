package library;
import java.util.Scanner;
import java.io.File;
import javax.swing.JOptionPane;;


public class LibraryApp {
	public static void main(String [] args) throws Exception{
		Library newLibrary = new Library();
		
		Scanner fileScan = new Scanner(new File("libraryHoldings.txt"));
		
		int numItems;
		String title;
		String author;
		String status;
		
		numItems = Integer.parseInt(fileScan.nextLine());
		
		for(int i = 0; i < numItems; ++i) {
			title = fileScan.nextLine();
			author = fileScan.nextLine();
			status = fileScan.nextLine();
			Book newBook = new Book(title, author, status);
			newLibrary.addBook(newBook);
		}
		fileScan.close();
		System.out.println(newLibrary);
		Scanner scnr = new Scanner(System.in);
		String [] choices = {"Check Out Book", "Return Book", "Mark Book as Overdue", "Show Books", "Quit"};
		int choice = 0;
		while (choice != 4) {
			choice = JOptionPane.showOptionDialog(
					null,
					"Enter your choice... ",
					"Main Menu",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					choices,
					choices[0]);

			String [] choices1 = {"available", "out", "overdue"};
			int choice1 = 0;
			if(choice == 3) {
					choice1 = JOptionPane.showOptionDialog(
							null,
							"Enter your status choice... ",
							"Main Menu",
							JOptionPane.DEFAULT_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,
							choices1,
							choices1[0]);
					if(choice1 == 0 || choice1 == 1 || choice1 == 2) {
						JOptionPane.showMessageDialog(
								null,
								newLibrary.findBooksByStatus(choices1[choice1]),
								"Books By Status",
								JOptionPane.INFORMATION_MESSAGE);
					}
					
			}
			else if(choice == 0) {
				String bookName = JOptionPane.showInputDialog("Enter the title of the book to check out");
				if(newLibrary.checkOut(bookName)) {
					JOptionPane.showMessageDialog(
							null,
							"The book " + bookName + " was checked out.",
							"Results of check out",
							JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(
							null,
							"The book " + bookName + " could not be checked out",
							"Results of check out",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else if(choice == 1) {
				String bookName = JOptionPane.showInputDialog("Enter the title of the book to return");
				if(newLibrary.checkIn(bookName)) {
					JOptionPane.showMessageDialog(
							null,
							"The book " + bookName + " was returned.",
							"Results of book return",
							JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(
							null,
							"The book " + bookName + " could not be returned",
							"Results of book return",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else if(choice == 2) {
				String bookName = JOptionPane.showInputDialog("Enter the title of the book to mark overdue");
				if(newLibrary.markOverdue(bookName)) {
					JOptionPane.showMessageDialog(
							null,
							"The book " + bookName + " was marked overdue.",
							"Results of mark book overdue",
							JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(
							null,
							"The book " + bookName + " could not be marked overdue",
							"Results of mark book overdue",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		
	}
	

}
