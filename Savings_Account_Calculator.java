
/**
 * Write a description of class Savings_Account_Calculator here.
 *
 * Programmer: Haziq
 * Date: 21 june 2024
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Savings_Account_Calculator extends JFrame implements ActionListener
{
    private JLabel lblAmt, lblintrate, lblyear, lbltotal;
    private JTextField txtAmt, txtintrate, txtyear, txttotal;
    private JButton btnCalc;
    private Container cont;
    private GridLayout layout;
    

    public Savings_Account_Calculator() 
    {
        //the title of the frame 
        super("Savings_Account_Calculator");

        layout = new GridLayout(5,2);

        //get content pane and set its layout
        cont = getContentPane();
        cont.setLayout(layout); // Set the layout of the Container

        //set up labels 
        lblAmt = new JLabel ("Enter the initial amount of a savings account: ");
        lblintrate = new JLabel ("Enter the annual interest rate :");
        lblyear = new JLabel ("Enter the number of years :");
        lbltotal = new JLabel ("Your total savings is :");

        //set up the text fields
        txtAmt = new JTextField(10);
        txtintrate = new JTextField(10);
        txtyear = new JTextField(10);
        txttotal = new JTextField(10);

        //set up the buttons
        btnCalc = new JButton(" \nCalculate\n ");

        //add to Container
        cont.add(lblAmt);
        cont.add(txtAmt);
        cont.add(lblintrate);
        cont.add(txtintrate);
        cont.add(lblyear);
        cont.add(txtyear);
        cont.add(lbltotal);
        cont.add(txttotal);
        cont.add(btnCalc);

        //register listener
        btnCalc.addActionListener (this);

        //size of the frame
        setSize (600, 190);

        // Make the frame visible
        setVisible (true);

        // Set the frame as non-resizable
        setResizable (true);

        // Set the default close operation
        setDefaultCloseOperation (EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        double p = Double.parseDouble(txtAmt.getText());
        double r = Double.parseDouble(txtintrate.getText()) / 100.0;
        int n = Integer.parseInt(txtyear.getText());

        if(e.getSource()==btnCalc)
        {
            double balance = p * Math.pow(1 + r, n);

            txttotal.setText(" " + balance);

        }
        else
            System.exit(0);
    }

    public static void main (String args[])
    {
        Savings_Account_Calculator demo = new Savings_Account_Calculator(); 
    } 
}
