
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class dashBoardGUI {
	dashBoardGUI(Library bookShelf){
        // create a new dashboard GUI have some characters from parent Frame
        AppGUI fr_dash = new AppGUI();       
        fr_dash.parentFrame.setTitle("Dashboard");
        
        // add a panel to contain button, text field add other components
        JPanel pl_dash = new JPanel();
        pl_dash.setLayout(new BoxLayout(pl_dash, BoxLayout.Y_AXIS));
        
        // add a new button to this frame
        JButton admin_bt = new JButton("Admin");
        admin_bt.setPreferredSize(new Dimension(90,30));

        // add a text field to search ISBN
        JLabel search_lb = new JLabel("Search by ISBN:");
        TextField search_txt = new TextField(30);
        JButton search_btn = new JButton("Search");
        search_btn.setPreferredSize(new Dimension(90,30));

        // add a textarea to contain list of book in library
        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea); 
        textArea.setEditable(false);

        pl_dash.add(admin_bt);
        pl_dash.add(search_lb);
        pl_dash.add(search_txt);
        pl_dash.add(search_btn);
        pl_dash.add(scrollPane);
        fr_dash.parentFrame.add(pl_dash);

        /// when click to admin button, new window will be created, current window will be closed
        admin_bt.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e){
                new AdminGUI(bookShelf);       
                fr_dash.parentFrame.dispose();
            }
        });

        // add action for search button
        search_btn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e){
            int isbn = Integer.parseInt(search_txt.getText());
            int bookNo = bookShelf.findBook(isbn);
            
            
            if(bookNo != -1 ){
            	   textArea.setText("");
                   textArea.append(bookShelf.getBookByIndex(bookNo).toString());
                }
                else{
                	textArea.setText("");
                    textArea.append("Dont have a book with this ISBN");
                }          
            }
        });
    }
}
