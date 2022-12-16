package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;



        public static void main(String[] args){
            LeapYearGUI app = new LeapYearGUI();
            app.setContentPane(app.panel1);
            app.setSize(700, 700);
            app.setDefaultCloseOperation(EXIT_ON_CLOSE);
            app.setTitle("Leap Year Checker");
            app.setVisible(true);
        }

        LeapYearGUI(){
            btnCheckYear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  try {
                      String year = tfYear.getText();
                      int yr = Integer.parseInt(year);
                      if (((yr % 4 == 0) && (yr % 100 != 0)) || (yr % 400 == 0)) {
                          JOptionPane.showMessageDialog(null, "Leap Year");
                      } else JOptionPane.showMessageDialog(null, "Not a Leap Year");
                  } catch(NumberFormatException error){
                      JOptionPane.showMessageDialog(null, "INVALID INPUT","ERROR", JOptionPane.ERROR_MESSAGE);
                  }

                }
            });
        }

}