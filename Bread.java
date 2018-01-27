/*************************************
Timothy McWatters
COP4331 - OO Programming
Programming Project 3

4 of 6 .java files
NewMenu.java
OrderCalculator.java
Welcome.java
***Bread.java
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

/***************************************
class Bread 
   Allows the user to select white or wheat bread.
****************************************/
public class Bread extends JPanel {
   public final double WHITEBREAD = .5;  // Constant cost of white bread
   public final double WHEATBREAD = .75; // Constant cost of wheat bread

   private JRadioButton white;       // selects white bread
   private JRadioButton wheat;       // selects wheat bread
   private ButtonGroup buttonGroup;  // groups the white and wheat into a panel

   /***************************************
   method Bread 
      Builds and arranges the bread panel.
   ****************************************/
   public Bread() {
      setLayout(new GridLayout(2, 1)); // constructor - makes 2 options for bread

      // make buttons
      white = new JRadioButton("White", true);
      wheat = new JRadioButton("Wheat");

      // groups the white and wheat buttons
      buttonGroup = new ButtonGroup();
      buttonGroup.add(white);
      buttonGroup.add(wheat);

      // border and label for the bread panel
      setBorder(BorderFactory.createTitledBorder("Bread"));

      // puts buttons in the border
      add(white);
      add(wheat);
   }

   /*******************************************
   method getBreadTotal 
      Gets the total cost of the bread selected and returns it.
   ********************************************/
   public double getBreadTotal() {
      double breadTotal = 0.0;

      if (white.isSelected()) {
         breadTotal = WHITEBREAD;
      }
      else {
         breadTotal = WHEATBREAD;
      }

      return breadTotal;
   }
}

