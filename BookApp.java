package library;

public class BookApp {
	public static void main(String [] args) {
		Book test1 = new Book("Of Mice and Men", "John Steinbeck", "available");
		
		//testing the parameterized constructor
		System.out.println("Test the parameterized Book constructor and call the toString method: ");
		System.out.println(test1.toString());
		
		//testing the accessor methods
		System.out.println("\nTest the accessors: ");
		System.out.println("Title: " + test1.getTitle());
		System.out.println("Author: " + test1.getAuthor());
		System.out.println("Status: " + test1.getStatus());
		
		//Testing the mutator methods
		System.out.println("\nTest the mutators on the same object and call the toString method: ");
		test1.setTitle("Romeo and Juliet");
		test1.setAuthor("William Shakespeare");
		test1.setStatus("out");
		System.out.println(test1.toString());
		
		//testing the status mutator method
		System.out.println("\nSet the status to \"damaged\" and call the toString method: ");
		test1.setStatus("damaged");
		System.out.println(test1.toString());


	}
}
 