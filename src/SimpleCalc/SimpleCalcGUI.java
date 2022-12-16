package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;

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

}