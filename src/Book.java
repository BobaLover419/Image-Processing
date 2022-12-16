
import java.util.Scanner;
public class Book{

    private int isbn, price;
    private String title, author, publisher;
    Scanner scanner = new Scanner(System.in);

    public Book(){
        super();
    }

    public Book(int isbn, int price, String title, String author, String publisher){
        super();
        this.isbn = isbn;
        this.price = price;
        this.title  = title;
        this.author = author;  
        this.publisher = publisher;
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
        return "\nisbn: "+ this.get_isbn()+"\n title "+ this.get_title() +"\n price"+ this.get_price()+ "\n author "+ this.get_author()+"\n publisher "+ this.get_author()+"\n publisher "+ this.publisher;       
    }
}