
package input7;

import java.util.Scanner;

public class Input7 {

    // enter a number and check if its even or odd
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //get a user input
         System.out.println("Enter a first number: ");
         int number = sc.nextInt();
         
         if(number%2 ==0) {
             System.out.println("THE NUMBER IS EVEN");
         }
         else{
            System.out.println("THE NUMBER IS ODD"); 
         }
    }
    
}
