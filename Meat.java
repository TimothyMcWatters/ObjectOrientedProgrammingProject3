/*************************************
Timothy McWatters
COP4331 - OO Programming
Programming Project 3

5 of 6 .java files
NewMenu.java
OrderCalculator.java
Welcome.java
Bread.java
***Meat.java
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

/***************************************
class Meat 
   Allows the user to select meats and cheeses.
****************************************/
public class Meat extends JPanel {
   
   public final double CHEESE = 0.50;    // Constant cost of cheese
   public final double ROASTBEEF = 1.00; // Constant cost of Roast Beef
   public final double TURKEY = 0.75;    // Constant cost of Turkey
   public final double HAM = 0.50;       // Constant cost of Ham

   private JCheckBox cheese;     // selects cheese
   private JCheckBox roastBeef;  // selects roast beef
   private JCheckBox turkey;     // selects turkey
   private JCheckBox ham;        // selects ham

   /***************************************
   method Meat
      Builds the meat and cheese panel.
   ****************************************/
   public Meat() {
      setLayout(new GridLayout(4, 1)); // constructor - makes 4 options for meats and cheese

      // make check boxes
      cheese = new JCheckBox("Cheese");
      roastBeef = new JCheckBox("Roast Beef");
      turkey = new JCheckBox("Turkey");
      ham = new JCheckBox("Ham");

      // border and label for the meat and cheese panel
      setBorder(BorderFactory.createTitledBorder("Meat/Cheese"));

      // puts check boxes in the border
      add(cheese);
      add(roastBeef);
      add(turkey);
      add(ham);
   }

   /*******************************************
   method getMeatTotal 
      Gets the total cost of the meat and cheese selected and returns it.
   ********************************************/
   public double getMeatTotal() {
      double meatTotal = 0.0;

      if (cheese.isSelected()) {
    	  meatTotal += CHEESE;
      }
      if (roastBeef.isSelected()) {
    	  meatTotal += ROASTBEEF;
      }
      if (turkey.isSelected()) {
    	  meatTotal += TURKEY;
      }
      if (ham.isSelected()) {
    	  meatTotal += HAM;
      }

      return meatTotal;
   }
}

