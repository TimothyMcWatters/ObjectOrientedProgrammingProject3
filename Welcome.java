/*************************************
Timothy McWatters
COP4331 - OO Programming
Programming Project 3

3 of 6 .java files
NewMenu.java
OrderCalculator.java
***Welcome.java
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

/***************************************
class Welcome 
   Provides some welcome text to the menu.
****************************************/
public class Welcome extends JPanel {
   private JLabel welcome; 
   
   /***************************************
   method Welcome 
      Builds the label for welcome text on the menu.
   ****************************************/
   public Welcome() {
      
	  // creates the welcome label
      welcome = new JLabel("Welcome to McWatters' Deli");

      // puts actual message on the menu
      add(welcome);
   }
}

