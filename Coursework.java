import javax.swing.*;
import java.awt.*;

public class Coursework {

 
  JButton[] button = new JButton[12]; 

  public Coursework() {

    JFrame a = new JFrame("Swingin' Simpsons");
    a.setSize(448, 363);
    a.setVisible(true);
    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setSize(448, 363);
    a.setContentPane(panel);
    panel.setVisible(true);

    GridLayout g = new GridLayout(3, 4);
    panel.setLayout(g);

    ImageIcon[] imageArray = new ImageIcon[12];


    for(int counter = 0; counter<12; counter++) {

      imageArray[counter] = new ImageIcon("bart"+counter+".jpg");
      button[counter] = new JButton(imageArray[counter]);
      button[counter].setSize(112,119);
      panel.add(button[counter]);
      button[counter].setVisible(true);
      
    }

        
        panel.updateUI();

  }

      public static void main(String[] arguments) {
     
        Coursework C = new Coursework();

      
      }

}
