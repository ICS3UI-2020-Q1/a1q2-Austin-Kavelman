import java.util.Scanner;


/**
 *
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    // Create a scanner to use input
    Scanner input = new Scanner(System.in);
    
    //ask user for next command
    System.out.println("Please enter 2 interger, on seperate lines to divide");

    String xValue;

    
    // Allow the user to enter x value
    int x = 5; 
   
    // Allow the user to enter y value
    int y = x/2; 
		
    // Displays the value and variable
    System.out.println("The value of x is: " + x); 
		
    // Displays the results of the operation
    System.out.println("The result of the operation is: " + y);  

  }
}
