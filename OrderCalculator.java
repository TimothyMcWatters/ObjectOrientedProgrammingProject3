/*************************************
Timothy McWatters
COP4331 - OO Programming
Programming Project 3

2 of 6 .java files
NewMenu.java
***OrderCalculator.java
Welcome.java
Bread.java
Meat.java
Coffee.java

The objective of this project is to design 
a program that provides the functionality shown in the 
"Project Requirements" picture for Project 3. 
Each item has a different cost, and the final calculation is 
correct. The images display a welcome panel with shop name
and three item panels with panel labels. At least one set
of Check boxes that allows multiple selection and one set of 
Radio buttons that are mutually exclusive. A Panel that holds
the calculate and exit buttons. Finally a popup box that 
displays the cost of the selections and the tax.Note the tax
must be calculated after the items are selected. 
*************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/*************************************
class OrderCalculator
   Extends the JFrame class
   Creates the menu for McWatters Deli, and the 
   cost popup window.
**************************************/
public class OrderCalculator extends JFrame {
   private final double TAX = 0.06; // tax rate
   
   private Welcome welcome;
   
   private Bread bread;     // Bread panel
   private Meat meat;       // Meat panel
   private Coffee coffee;   // Coffee panel
   
   private JPanel buttonPanel;   
   private JButton calculate;    // to add up the totals
   private JButton exit;         // exits 
   
   /*************************************
   method OrderCalculator
      Creates and arranges the the menu for McWatters Deli.
   **************************************/
   public OrderCalculator() {
      
      setTitle("Order Calculator"); // Title for the menu

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close button

      setLayout(new BorderLayout());

      // Creates the 5 panels
      welcome = new Welcome();
      bread = new Bread();
      meat = new Meat();
      coffee = new Coffee();
      operations();
      
      // Positions the 5 panels on the menu
      add(welcome, BorderLayout.NORTH);
      add(bread, BorderLayout.WEST);
      add(meat, BorderLayout.CENTER);
      add(coffee, BorderLayout.EAST);
      add(buttonPanel, BorderLayout.SOUTH);

      pack();
      setVisible(true);
   }

   /*************************************
   method operations
      Creates, arranges, and associates the actions for the 
      operation buttons on the McWatters Deli menu.
   **************************************/   
   private void operations() {
      buttonPanel = new JPanel(); // makes a panel to put the Calculate and Exit buttons

      // Create the Calculate and Exit buttons.
      calculate = new JButton("Calculate");
      exit = new JButton("Exit");

      // Associate the action to the button
      calculate.addActionListener(new CalculateListener());
      exit.addActionListener(new ExitListener());

      // Add the buttons to the button panel.
      buttonPanel.add(calculate);
      buttonPanel.add(exit);
   }

   /*************************************
   inner class calculateListener
      Provides the action associated with the Calculate button on the menu.
      Creates and arranges a message, but also calculates the actual totals.
   **************************************/  
   private class CalculateListener implements ActionListener {
      public void actionPerformed(ActionEvent calculate) {
         // Variables to hold the subtotal, tax, and total
         double subtotal;
         double tax;
         double total;

         // performs the subtotal calculation.
         subtotal = (bread.getBreadTotal() +  meat.getMeatTotal() + coffee.getCoffeeTotal());

         // performs tax calculation.
         tax = subtotal * TAX;

         // adds subtotal and tax to calculate the total.
         total = subtotal + tax;

         // formats the output to match the assignment specifications.
         DecimalFormat US = new DecimalFormat("0.00");

         // Generates a message with subtotal, tax, and total
         JOptionPane.showMessageDialog(null, "Subtotal: $" + US.format(subtotal) + "\n" + "Tax: $" + US.format(tax) + "\n" + "Total: $" + US.format(total));
      }
   }

   /*************************************
   inner class exitListener
       Provides the action associated with the Exit button on the menu.
       Closes the menu and program.
   **************************************/ 
   private class ExitListener implements ActionListener {
      public void actionPerformed(ActionEvent exit) {
          System.exit(0);
      }
   }
}

