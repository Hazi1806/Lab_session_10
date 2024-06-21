/**
 * Lab Session 3: Arithmetic Calculator
 *
 * Programmer: Haziq
 * Date: 21 June 2024
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Arithmetic_Calc extends JFrame implements ActionListener
{
    // Declare instance variables
    private JLabel lblNum11, lblNum21, lblOutput ; // Labels for input fields and output
    private JTextField txtNum11, txtNum21, txtOutput; // Text fields for input and output
    private JButton btnADD, btnSUB, btnMUL, btnDIV, btnMOD; // Buttons for arithmetic operations
    private Container cont; // Container for GUI components
    private FlowLayout layout; // Layout for GUI components

    public Arithmetic_Calc() 
    {
        // Set the title of the frame
        super (" ARITHMETIC CALC ");

        // Create a FlowLayout object
        layout = new FlowLayout();

        // Set the layout for the container
        cont = getContentPane();
        cont.setLayout(layout);

        // Create labels for input fields
        lblNum11 = new JLabel (" Enter first number :");
        lblNum21 = new JLabel (" Enter second number :");
        lblOutput = new JLabel (" Total :");

        // Create text fields for input
        txtNum11 = new JTextField(10);
        txtNum21 = new JTextField(10);
        txtOutput = new JTextField(20);

        // Create buttons for arithmetic operations
        btnADD = new JButton (" + ");
        btnSUB = new JButton (" - ");
        btnMUL = new JButton (" * ");
        btnDIV = new JButton (" / ");
        btnMOD = new JButton (" % ");

        // Add components to the container
        cont.add (lblNum11);
        cont.add (txtNum11);
        cont.add (lblNum21);
        cont.add (txtNum21);
        cont.add (lblOutput);
        cont.add (txtOutput);
        cont.add(btnADD);
        cont.add(btnSUB);
        cont.add(btnMUL);
        cont.add(btnDIV);
        cont.add(btnMOD);

        // Add action listeners to buttons
        btnADD.addActionListener (this);
        btnSUB.addActionListener (this);
        btnMUL.addActionListener (this);
        btnDIV.addActionListener (this);
        btnMOD.addActionListener (this);

        // Set the size of the frame
        setSize (295, 200);

        // Make the frame visible
        setVisible (true);

        // Set the frame as non-resizable
        setResizable (false);

        // Set the default close operation
        setDefaultCloseOperation (EXIT_ON_CLOSE);

    }

    // Method to handle button clicks
    public void actionPerformed (ActionEvent e)
    {
        // Get the values from the text fields
        int num11 = Integer.parseInt(txtNum11.getText());
        int num21 = Integer.parseInt (txtNum21.getText());

        // Check which button was clicked
        if ( e.getSource() == btnADD )
        {
            // Perform addition
            int total = num11 + num21;
            txtOutput.setText (" " + total);

        }else if ( e.getSource() == btnSUB )
        {
            // Perform subtraction
            int total = num11 - num21;
            txtOutput.setText (" " + total);

        }else if ( e.getSource() == btnMUL )
        {
            // Perform multiplication
            int total = num11 * num21;
            txtOutput.setText (" " + total);

        }else if ( e.getSource() == btnDIV )
        {
            // Perform division
            int total = num11 / num21;
            txtOutput.setText (" " + total);

        }else if ( e.getSource() == btnMOD )
        {
            // Perform modulus (remainder)
            int total = num11 % num21;
            txtOutput.setText (" " + total);

        }else
            System.exit(0);
    }

    // Main method to create the GUI
    public static void main (String args[])
    {
        // Create an instance of the Arithmetic_Calc class
        Arithmetic_Calc demo = new Arithmetic_Calc();
    }
}