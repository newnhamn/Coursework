import javax.swing.*;

public class Coursework {

  public Coursework() {

    JFrame a = new JFrame("Swingin' Simpsons");
    a.setSize(1200, 900);
    a.setVisible(true);
    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setSize(1200, 900);
    a.setContentPane(panel);
    panel.setVisible(true);

    ImageIcon img0 = new ImageIcon("bart0.jpg");
    JButton i1 = new JButton(img0);
    panel.add(i0);
    i0.setSize(112,119);
    i0.setVisible(true);

  }

      public static void main(String[] arguments) {
     
        Coursework C = new Coursework();

      
      }

}
