
public class Book extends BinTree {

	String title;
	String author;
	int ISBN;
	boolean onLoan = false;
	Node root;
	
	public Book(String title, String author, int ISBN)
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		onLoan = false;
	}
	
	
	
	
}
