package library;

/**
 * Title: The Book class
 * 
 * Description: This class 
 * 
 * @author Kevin Mangar
 */
public class Book {
	private String title;
	private String author;
	private String status;
	
	/**
	 * Name: default parameterized constructor
	 * Description: gives parameters to the default Book constructor
	 * @param nTitle
	 * @param nAuthor
	 * @param nStatus
	 */
	
	public Book(String nTitle, String nAuthor, String nStatus) {
		title = nTitle;
		author = nAuthor;
		status = nStatus;
	}
	
	/**
	 * Name: setTitle1 method
	 * Description: assigns the title instance variable to the nTitle1 parameter
	 * @param nTitle1
	 */
	
	public void setTitle(String nTitle1) {
		title = nTitle1;
	}
	
	/**
	 * Name: setAuthor1 method
	 * Description: assigns the author instance variable to the nAuthor1 parameter
	 * @param nAuthor1
	 */
	
	public void setAuthor(String nAuthor1) {
		author = nAuthor1;
	}
	
	/**
	 * Name: setStatus1 method
	 * Description: assigns the status instance variable to the nStatus1 parameter
	 * @param nTitle1
	 */
	
	public void setStatus(String nStatus1) {
		if(nStatus1.equals("available") || nStatus1.equals("out") || nStatus1.equals("overdue"))
				status = nStatus1;
	}
	
	/**
	 * Name: getTitle
	 * @return the instance variable title
	 */
	
	public String getTitle() {
		return title;
	}
	
	/**
	 * Name: getAuthor
	 * @return the instance variable author
	 */
	
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Name: getStatus
	 * @return the instance variable status
	 */
	
	public String getStatus() {
		return status;
	}
	
	/**
	 * Name: toString
	 * @return the three instance variables in a string sentence
	 */
	
	public String toString() {
		String str = title + " by " + author + " is currently " + status + ".";
		return str;
	}
}


