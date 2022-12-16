
import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookshelf = new ArrayList<Book>();
    public void addBook(int isbn, String title, String author, String publisher, int price){
     
     Book tempBook = new Book(isbn,price,title,author,publisher);
     bookshelf.add(tempBook);  
    }
   
    public int findBook(int isbn){
        int index = 0;
        for(Book tempBook: bookshelf){
            if(tempBook.get_isbn() == isbn){
                index = bookshelf.indexOf(tempBook);
                return index;
            }
        }
        return -1;
    }
    

    public void removeBook(int isbn){
        
        for(Book tempBook: bookshelf){
            if(tempBook.get_isbn() == isbn){
                bookshelf.remove(tempBook);
                return;
            }
        }

    }

    public void updateBook(int isbn, String title, String author, String publisher, int price){
        
        for(Book tempBook: bookshelf){
            if(tempBook.get_isbn() == isbn){
                tempBook.set_title(title);
                tempBook.set_author(author);
                tempBook.set_publisher(publisher);
                tempBook.set_price(price);
                return;
            }
        }
    }

    public void DisplayBookshelf(){
        for(Book tempBook: bookshelf){
           System.out.println(tempBook.toString());
        }
    }
}
