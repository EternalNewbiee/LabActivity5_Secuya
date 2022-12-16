package FoodOrdering;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args){
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.panel1);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
    FoodOrderGUI(){
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double total = 0;
                    if (cPizza.isSelected()) total += 100;
                    if (cBurger.isSelected()) total += 80;
                    if (cFries.isSelected()) total += 65;
                    if (cSoftDrinks.isSelected()) total += 55;
                    if (cTea.isSelected()) total += 50;
                    if (cSundae.isSelected()) total += 40;

                    if (rb5.isSelected()) total -= total * .05;
                    if (rb10.isSelected()) total -= total * .10;
                    if (rb15.isSelected()) total -= total * .15;

                    if(total==0) throw(new NoOrderException());
                    JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", total),"ORDER CONFIRMATION", JOptionPane.INFORMATION_MESSAGE);
                }catch (NoOrderException ex) {
                    JOptionPane.showMessageDialog(null,"Please Select a Food Item","INVALID ORDER", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }
}

