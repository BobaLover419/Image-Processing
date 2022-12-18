
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	ArrayList<Book> bookshelf = new ArrayList<Book>();

    public Book getBookByIndex(int index){
        return bookshelf.get(index);
    }

    public void addBook(int isbn, String title, String author, String publisher, int price){ 
     Book tempBook = new Book(isbn,title,author,publisher,price);
     bookshelf.add(tempBook);  
    }
    
    public void loadData(String file_name){
    	try {
	        Scanner scan = new Scanner(new File(file_name));

	        while (scan.hasNextLine()) {
	            
	            String line = scan.nextLine();
	            String[] lineArray = line.split(",");
	            Book tempbook = new Book(Integer.parseInt(lineArray[0]),lineArray[1],lineArray[2],lineArray[3],Integer.parseInt(lineArray[4]));
	            bookshelf.add(tempbook);
	        	System.out.println(line);
	        }

	        scan.close();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
    }
// return a position of a book
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
    
// return a book
    public Book find_Book(int isbn){
        
        for(Book tempBook: bookshelf){
            if(tempBook.get_isbn() == isbn){
                
                return tempBook;
            }
        }
        return null;
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

    public String DisplayBookshelf(){
        String dataInfo = "";
        for(Book tempBook: bookshelf){           
            dataInfo = dataInfo + tempBook.toString()+"\n";           
        }
        return dataInfo;
    }

    public void printBookshelf(){
        for(Book tempBook: bookshelf){           
            System.out.println(tempBook.toString());           
        }  
    }
}
