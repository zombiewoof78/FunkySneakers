import java.util.*;
/**
 * A class that represents journal articles.  The following attributes are represented
		1.	the title;
		2.	the author(s);
		3.	the name of the journal it was published in;
		4.	the issue number of the journal;
		5.	the year of publication
 */

/**
 * @author Wim Thiels
 *
 *@reminders********temporary, should be deleted***************
 *
 *-> WT : use a stringbuilder instead of string ?  easier to manipulate
 *
 *-> WT : how many constructors should we use ?
 *		* full constructor
 *		* one that automatically fills in the current year
 *		* one that also works if no journal data is provided ?? (default spaces)
 *
 *-> WT : best way to represent the name ?  arraylist ?..
 *		we must be able to handle names like J. K. Rowling
 *
 *-> WT : classvariables should also be initialized with some sort of defaultSetter like getMinHours()..?
 *
 *-> WT : there is also a certain order we need to follow, need to check that
 *
 *
 *************end reminders : to be deleted
 */
public class JournalArticle {
	
	/**
	 * instance variables, where to put it ?
	 * 
*/
	private String title;
	private String journalName;
	private int issueNumber;
	private int yearPub;
	private ArrayList<String> author;
	
	/**
	 * Initialize this new journal article with all data given in the following order
	 * 
	 *  1) title		the title of the article (String)
	 *  2) journalName	the name of the journal where the article appeared (String)
	 *  3) issueNumber	the issuenumber of the journal specified in journalName (int)
	 *  4) yearPub		the year of publication of article. 
	 *  				this must be an integervalue in the range [-9999,9999] 
	 *  5) author[]		The name of the author(s). multiple authors can be given as input.
	 *  				Every name is 1 parameter, and must be composed in this order
	 *  					1) first name (mandatory)
	 *  					2) middle name(s) (optional)
	 *  					3) last name (mandatory)
	 *  				the name should be written in full (no abbreviations).  
	 *  				there must be at least one blank between every part of the name
	 * 
	 */
	
	public JournalArticle(String title, String journalName, int issueNumber, int yearPub, String ... author) {
/*	setTitle(title);
	setJournalName(journalName);
	setIssueNumber(issueNumber);
	setYearPub(yearPub);  */
	
}
	/**
	 * constructor 2, without year; set to current year as default
	 * 
*/
	public JournalArticle(String title, String journalName, int issueNumber, String ... author) {
		
	}

	/**
	 * getter title
	 * 
*/	
	public String getTitle() {
		return " ";
	}
	/**
	 * setter title
	 * 
*/	
	public void setTitle(String title){
		
	}
	
	/**
	 * getter journalname
	 * 
*/	
	public String getJournalName() {
		return " ";
	}
	/**
	 * setter journalname
	 * 
*/	
	public void setJournalName(String journalName){
		
	}
	/**
	 * getter issuenumber
	 * 
*/	
	public int getIssueNumber() {
		return 0;
	}
	/**
	 * setter issuenumber
	 * 
*/	
	public void setIssueNumber(int issueNumber){
		
	}
	/**
	 * getter Year of publication
	 * 
*/	
	public int getYearOfPublication() {
		return 0;
	}
	/**
	 * setter year of publication
	 * 
*/	
	public void setYearOfPublication(int yearPub){
		
	}
	
	/**
	 * getter author (1 at a time) 
	 * 
*/	
	public String getAuthorNameSingle(int rankAuthorNum) {
		return " ";
	}
	/**
	 * setter author (1 at a time)
	 * 
*/	
	public void setAuthorNameSingle(String authorName, int rankAuthorNum){
		
	}
	
	
	/**
	 * getter all authors as array of strings
	 * 
*/	
	public String[] getAuthorNamesAsArray() {
		String[] Blabla = {"authorname1","authorname2"};
		return Blabla;
	}
	/**
	 * setter author (1 at a time)
	 * 
*/	
	public void setAuthorNamesAsArray(String[] authorName){
		
	}
/**
	 * 1.	an inspector that returns the number of authors
	 * 
*/		
	public int numberOfAuthors () {
		return 0;
	}
/**
	 * 2.	an inspector that returns an array of authors, but represented as strings consisting the author’s initial and the last name, e.g., “A. Einstein”;
	 * 
*/		
	public String[] getAuthorNamesAsArrayInitials () {
		String[] Blabla = {"authorname1","authorname2"};
		return Blabla;
	}
	
	/**
	 * 3.	a mutator that capitalizes the title, if the original title was “Brownian motion in fluids”, it should be changed to “Brownian Motion In Fluids”;
	 * 
*/		
	public void setTitleCamelCase () {
		
	}
	
	/**
	 * 4.	an inspector that returns true if the article was published more that 10 years ago.
	 * 
*/		
	public boolean olderThan10Years () {
		return true;
	}
	
}
