
package input6;

import java.util.*;

public class Input6 {

    // enter two numbers and display the highest
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //get a user input
         System.out.println("Enter a first number: ");
         int number1 = sc.nextInt();
         
         System.out.println("Enter a second number: ");
         int number2 = sc.nextInt();
         
         //use math class to compare two enterd numbers and display the largest
         System.out.println(Math.max(number1, number2));
         
         
         
    }
    
}
