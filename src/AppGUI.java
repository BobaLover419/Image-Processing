
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class AppGUI extends JFrame {
	JFrame parentFrame = new JFrame();
    ImageIcon logoIcon = new ImageIcon("icons8-book-shelf-48.png");
   AppGUI(){
    parentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    parentFrame.setSize(400,400);
    parentFrame.setIconImage(logoIcon.getImage());
    parentFrame.getContentPane().setBackground(Color.lightGray);
    parentFrame.setVisible(true);
   } 
}
