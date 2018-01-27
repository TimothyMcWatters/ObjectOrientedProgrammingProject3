/*************************************
Timothy McWatters
COP4331 - OO Programming
Programming Project 3

6 of 6 .java files
NewMenu.java
OrderCalculator.java
Welcome.java
Bread.java
Meat.java
***Coffee.java

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

/***************************************
class Coffee 
   Allows the user to select none, reg, decaf, or capp coffee.
****************************************/
public class Coffee extends JPanel {
   public final double NONE = 0.0;           // Constant cost of no coffee
   public final double REGULARCOFFEE = .50;  // Constant cost of reg coffee
   public final double DECAFCOFFEE = .75;    // Constant cost of decaf coffee
   public final double CAPPUCCINO = 1.25;    // Constant cost of capp coffee

   private JRadioButton none;          // selects no coffee
   private JRadioButton regularCoffee; // selects regular coffee
   private JRadioButton decafCoffee;   // selects decaf
   private JRadioButton cappuccino;    // selects cappuccino
   private ButtonGroup buttonGroup;    // groups none, reg, decaf, and capp into a panel

   /***************************************
   method Coffee 
      Builds the coffee panel.
   ****************************************/
   public Coffee() {
      setLayout(new GridLayout(4, 1)); // constructor - makes 4 options for coffee

      // make buttons
      none = new JRadioButton("None");
      regularCoffee = new JRadioButton("Regular coffee", true);
      decafCoffee = new JRadioButton("Decaf coffee");
      cappuccino = new JRadioButton("Cappuccino");

      // groups the all the coffee buttons
      buttonGroup = new ButtonGroup();
      buttonGroup.add(none);
      buttonGroup.add(regularCoffee);
      buttonGroup.add(decafCoffee);
      buttonGroup.add(cappuccino);

      // border and label for the coffee panel
      setBorder(BorderFactory.createTitledBorder("Coffee"));

      // puts buttons in the border
      add(none);
      add(regularCoffee);
      add(decafCoffee);
      add(cappuccino);
   }

   /*******************************************
   method getCoffeeTotal 
      Gets the total cost of the coffee selected and returns it.
   ********************************************/
   public double getCoffeeTotal() {
      double coffeeTotal = 0.0;

      if (none.isSelected()) {
    	  coffeeTotal = NONE;
      }
      else if (regularCoffee.isSelected()) {
    	  coffeeTotal = REGULARCOFFEE;
      }
      else if (decafCoffee.isSelected()) {
    	  coffeeTotal = DECAFCOFFEE;
      }
      else if (cappuccino.isSelected()) {
    	  coffeeTotal = CAPPUCCINO;
      }

      return coffeeTotal;
   }
}

