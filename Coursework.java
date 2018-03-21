import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Coursework implements ActionListener {

  ImageIcon tempStore;
  JButton[] button = new JButton[12];                                    /** creates an array of JButtons **/
  ImageIcon[] imageArray = new ImageIcon[12];                          /** creates the array of imageIcons **/

  public Coursework() {

    JFrame a = new JFrame("Swingin' Simpsons");
    a.setSize(448, 363);                                                 /** creates the JFrame to hold all of the components **/
    a.setVisible(true);
    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setSize(448, 363);                                             /** creates the panel for the componenets to act inside of **/
    a.setContentPane(panel);
    panel.setVisible(true);

    GridLayout g = new GridLayout(3, 4);                                 /** creates a gridlayout for the buttons to be inside of **/
    panel.setLayout(g);




    for(int counter = 0; counter<12; counter++) {

      imageArray[counter] = new ImageIcon("bart"+counter+".jpg");        /** puts the images on the buttons and formats them to the correct size **/
      button[counter] = new JButton(imageArray[counter]);
      button[counter].setSize(112,119);
      panel.add(button[counter]);
      button[counter].setVisible(true);
      button[counter].addActionListener(this);                           /** adds the actionListener to each of the buttons in the array **/
    }

      

        
        panel.updateUI();                                                /** updates the panel to display all of the components **/ 

  }

      public void actionPerformed(ActionEvent moveImage) {

        for(int counter1 = 0; counter1<12; counter1++) {

           if(button[counter1] == moveImage.getSource()) {
           button[counter1].setIcon(imageArray[0]);
           button[0].setIcon(imageArray[counter1]);

           }
                   
        }

      }


       

      public static void main(String[] arguments) {
     
        Coursework C = new Coursework();                                 /** runs the gui **/

      
      }

}
