
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AdminGUI {
	 AdminGUI(Library bookShelf){
	        AppGUI fr_admin = new AppGUI();
	        fr_admin.parentFrame.setTitle("Admin panel");
	        JPanel pnl_admin = new JPanel();
	        pnl_admin.setLayout(new BoxLayout(pnl_admin, BoxLayout.Y_AXIS));
	        	        
	        JLabel isbn_lb = new JLabel("ISBN:");
	        TextField isbn_txt = new TextField(30);
	        
	        JLabel title_lb = new JLabel("Title:");
	        TextField title_txt = new TextField(30);
	        
	        JLabel author_lb = new JLabel("Author:");
	        TextField author_txt = new TextField(30);
	        
	        JLabel publisher_lb = new JLabel("Publisher:");
	        TextField publisher_txt = new TextField(30);
	        
	        JLabel price_lb = new JLabel("Price:");
	        TextField Price_txt = new TextField(30);
	        //--------------------------
	        
	        JButton add_btn = new JButton("Add New Book");
	        add_btn.setPreferredSize(new Dimension(90,30));
	        
	        JButton delete_btn = new JButton("Delete Book");
	        delete_btn.setPreferredSize(new Dimension(90,30));
	        delete_btn.setEnabled(false);
	        
	        JButton update_btn = new JButton("Update Book");
	        update_btn.setPreferredSize(new Dimension(90,30));
	        update_btn.setEnabled(false);
	        
	        JButton clear_btn = new JButton("Clear");
	        clear_btn.setPreferredSize(new Dimension(90,30));
	        
	        JButton search_btn = new JButton("Search");
	        search_btn.setPreferredSize(new Dimension(90,30));
	        
	        //-------------
	        JTextArea textArea = new JTextArea(10, 30);
	        JScrollPane scrollPane = new JScrollPane(textArea); 
	        textArea.setEditable(false);
	    	        
	        //-------------------------------
	        
	        pnl_admin.add(isbn_lb);
	        pnl_admin.add(isbn_txt);
	  
	        pnl_admin.add(title_lb);
	        pnl_admin.add(title_txt);
	        
	        pnl_admin.add(author_lb);
	        pnl_admin.add(author_txt);
	        
	        pnl_admin.add(publisher_lb);
	        pnl_admin.add(publisher_txt);
	        
	        pnl_admin.add(price_lb);
	        pnl_admin.add(Price_txt);
	        
	        pnl_admin.add(add_btn);
	        pnl_admin.add(update_btn);
	        pnl_admin.add(delete_btn);
	        pnl_admin.add(clear_btn);
	        pnl_admin.add(search_btn);
	        pnl_admin.add(scrollPane);
	        //------------------------------
	        fr_admin.parentFrame.add(pnl_admin);
	        
	        // clear textfield when click clear button 
	        clear_btn.addActionListener(new ActionListener() 
	        {
	            public void actionPerformed(ActionEvent e){
	            	textArea.setText("");
	            	isbn_txt.setText("");
	            	title_txt.setText("");
	            	author_txt.setText("");
	            	publisher_txt.setText("");
	            	Price_txt.setText("");	            	
	            	update_btn.setEnabled(true);
                	delete_btn.setEnabled(true);
                	add_btn.setEnabled(true);
	            }
	        });
	        
	        // search by ISBN
	        search_btn.addActionListener(new ActionListener() 
	        {
	            public void actionPerformed(ActionEvent e){
	            	int isbn = Integer.parseInt(isbn_txt.getText());
	                Book temp = bookShelf.find_Book(isbn);
	                textArea.setText("");  
	                if(temp != null ){
	                	title_txt.setText(temp.get_title());
	                	author_txt.setText(temp.get_author());
	                	publisher_txt.setText(temp.get_publisher());
	                	Price_txt.setText(temp.get_price()+"");
	                	update_btn.setEnabled(true);
	                	delete_btn.setEnabled(true);
	                	add_btn.setEnabled(false);
	                	
	                }
	                else{
	                    	textArea.setText("");
	                        textArea.append("Dont have a book with this ISBN");
	                    }     
	            }
	        });
	        
	       // when click add button, add a new book into library bookshelf
	        add_btn.addActionListener(new ActionListener() 
	        {
	            public void actionPerformed(ActionEvent e){	  
	            	
	            	// need to validate input information before add (book isbn_txt, title_txt, author_txt, publisher_txt, price_txt)
	            	textArea.setText(""); 
	            	bookShelf.addBook(Integer.parseInt(isbn_txt.getText()), title_txt.getText(), author_txt.getText(), publisher_txt.getText(), Integer.parseInt(Price_txt.getText()));
	            	textArea.append(bookShelf.DisplayBookshelf());
	            }
	        });
	        
	     // update a book when click update button 
	        update_btn.addActionListener(new ActionListener() 
	        {
	            public void actionPerformed(ActionEvent e){
	            	// need validate information 
	            		textArea.setText("");           
	            		bookShelf.updateBook(Integer.parseInt(isbn_txt.getText()), title_txt.getText(), author_txt.getText(), publisher_txt.getText(), Integer.parseInt(Price_txt.getText()));
		            	textArea.append(bookShelf.DisplayBookshelf());           
	            }
	        });
	        
	        // Delete a book when click delete button 
	        delete_btn.addActionListener(new ActionListener() 
	        {
	            public void actionPerformed(ActionEvent e){
	            	
	            	// need validate information, enable other button
	            	textArea.setText("");
	            	bookShelf.removeBook(Integer.parseInt(isbn_txt.getText()));
	            	textArea.append(bookShelf.DisplayBookshelf());
	            }
	        });
	        
	        
	    }
}
