
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args)  throws IOException
{
		
		 Library bookShelf = new Library();
	     bookShelf.loadData("jenny.txt");
		 new dashBoardGUI(bookShelf);
		
	}

}
