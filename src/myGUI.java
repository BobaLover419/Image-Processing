

import java.awt.event.*;
import javax.swing.*;

import java.awt.Component;
import java.awt.FlowLayout;

public class myGUI {
  public myGUI(){
    JFrame myFrame = new JFrame("Main Frame ");
    JFrame myFrame1 = new JFrame("Admin Frame");
    JFrame myFrame2 = new JFrame("Member Frame");
    JPanel myJPanel = new JPanel();
    myJPanel.setLayout(new FlowLayout());
    
    JButton crt_button1 = new JButton("Member");
    JButton crt_button2 = new JButton("Admin");
    crt_button1.setBounds(50,100,90,30);
    crt_button2.setBounds(150,100,90,30);
   
    myJPanel.add(crt_button1);
    myJPanel.add(crt_button2);
    myFrame.add(myJPanel);

    myFrame.setSize(400,200);
    myFrame.setLocationRelativeTo(null);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.setVisible(true);
         
    crt_button2.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent e){
            myFrame1.pack();
            myFrame1.setSize(400,400);
            myFrame1.setLocationRelativeTo(null);
            myFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            myFrame1.setVisible(true);
            
        }
    });
    
    crt_button1.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent e){
            myFrame2.pack();
            myFrame2.setSize(400,400);
            myFrame2.setLocationRelativeTo(null);
            myFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            myFrame2.setVisible(true);
            
        }
    });
  
  }  
}
