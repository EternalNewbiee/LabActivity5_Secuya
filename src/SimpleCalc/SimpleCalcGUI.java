package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JTextField tfResult;
    private JLabel lblResult;

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.panel1);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
    SimpleCalcGUI(){
        tfResult.setEditable(false);
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(tfNumber1.getText());
                    double n2 = Double.parseDouble(tfNumber2.getText());
                    String op = cbOperations.getSelectedItem().toString();
                    double result = 0;
                    switch (op) {
                        case "+":
                            result = n1 + n2;
                            break;
                        case "-":
                            result = n1 - n2;
                            break;
                        case "/":
                            result = n1 / n2;
                            break;
                        case "*":
                            result = n1 * n2;
                            break;
                    }
                    tfResult.setText(String.format("%.2f", result));
                } catch (NumberFormatException error) {
                    JOptionPane.showMessageDialog(null, "INVALID INPUT", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
     });

    }
}