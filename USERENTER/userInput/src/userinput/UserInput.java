
package userinput;

import java.util.Scanner;
public class UserInput {


    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in) ;
      
      //get user input
      System.out.println("Enter the number:");
      int number = sc.nextInt();
      
      // print the input enterd by the user
      System.out.println(number);
    }
    
}
