import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Coursework implements ActionListener {

  JFrame a = new JFrame("Swingin' Simpsons");                            /** creates the JFrame to hold all of the components */
  JPanel panel = new JPanel();                                           /** creates the panel for the componenets to act inside of */
  Icon tempStore = new ImageIcon();
  Icon tempStore1 = new ImageIcon();
  JButton[] button = new JButton[12];                                    /** creates an array of JButtons */
  ImageIcon[] imageArray = new ImageIcon[12];                            /** creates the array of imageIcons */
  private int xYValue;
  private int clickedXYValue;

  public Coursework() {

    a.setSize(448, 363);                                                 /** sets the parameters for the JFrame */
    a.setVisible(true);
    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    panel.setSize(448, 363);                                             /** sets the parameters for the JPanel */
    a.setContentPane(panel);
    panel.setVisible(true);

    GridLayout g = new GridLayout(3, 4);                                 /** creates a gridlayout for the buttons to be inside of */
    panel.setLayout(g);


    for(int counter = 0; counter<12; counter++) {

      imageArray[counter] = new ImageIcon("bart"+counter+".jpg");        /** puts the images on the buttons and formats them to the correct size */
      button[counter] = new JButton(imageArray[counter]);
      button[counter].setSize(112,119);
      panel.add(button[counter]);
      button[counter].setVisible(true);
      button[counter].addActionListener(this);                           /** adds the actionListener to each of the buttons in the array */
    }
        
        panel.updateUI();                                                /** updates the panel to display all of the components */ 

  }

      public void actionPerformed(ActionEvent moveImage) {               /** The action listener for the event that a button is clicked */

        for(int counter1 = 0; counter1<12; counter1++) {

           if(button[counter1] == moveImage.getSource()) {               /** returns the button that was clicked */

             for(int counter2 =0; counter2<12; counter2++) {

               if(button[counter2].getIcon() == imageArray[0]) {
                    
                 clickedXYValue = counter1;
                 xYValue = counter2;
                            
                   if(clickedXYValue == xYValue + 1 || clickedXYValue == xYValue - 1 || clickedXYValue == xYValue + 4 || clickedXYValue == xYValue - 4) {
                   
                     tempStore = button[counter2].getIcon();             /** stores the blank image */
                     tempStore1 = button[counter1].getIcon();            /** stores the clicked button's image */
                     button[counter2].setIcon(tempStore1);               /** sets the blank image to the clicked one */
                     button[counter1].setIcon(tempStore);                /** sets the clicked image to the blank one */

                   }

               }

             }



           }
                   
        }

      }


      public static void main(String[] arguments) {
     
        Coursework C = new Coursework();                                 /** runs the gui */

      
      }

}
