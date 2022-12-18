
public class Book {
		private int isbn, price;
	    private String title, author, publisher;

	    public Book(){
	        super();
	    }

	    public Book(int isbn, String title, String author, String publisher, int price){
	        super();
	        this.isbn = isbn;        
	        this.title  = title;
	        this.author = author;  
	        this.publisher = publisher;
	        this.price = price;
	    }

	    public int get_isbn(){return this.isbn;}
	    public int get_price(){return this.price;}
	    public String get_title(){return this.title;}
	    public String get_author(){return this.author;}
	    public String get_publisher(){return this.publisher;}

	    public void set_isbn(int isbn){this.isbn = isbn;}
	    public void set_price(int price){this.price= price;}
	    public void set_title(String title){this.title = title;}
	    public void set_author(String author){this.author= author;}
	    public void set_publisher(String publisher){this.publisher = publisher;}

	    public String toString(){
	        return this.get_isbn()+","+ this.get_title() +","+ this.get_author()+","+ this.get_author()+","+ this.publisher+ ","+ this.get_price();       
	    }
}
