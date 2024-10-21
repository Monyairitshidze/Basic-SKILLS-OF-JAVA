
package userinput8;

import java.util.Scanner;

public class UserInput8 {

    // print the gcd of a number
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         
         //user wrapper class to access predefined methods
         Integer result1;
         Integer result2;
        
        //get a user input
         System.out.println("Enter a first number: ");
         int number1 = sc.nextInt();
         
         System.out.println("Enter a first number: ");
         int number2 = sc.nextInt();
         
         //print factors using for loop
         System.out.println("THE FACTORS ARE:");
         for(int i=1; i<number1; i++) {
             
             if(number1%i==0) {
                result1 = i;
                 System.out.print( result1 + " , ");
                 
             }
         }
         System.out.println();
         
         //print factors using for loop
          System.out.println("THE FACTORS ARE:");
          for(int i=1; i<number2; i++) {
             
             if(number2%i==0) {
                 result2 = i;
             System.out.print( result2 + " , ");
             }
         }
          System.out.println();
          
          //use this loop to print common factors of the numbers enterd by user
          System.out.println("COMMON FACTORS ARE:");
          for(int i= 1; i< Math.max(number1, number2); i++) {
              
              if(number1%i==0 && number2%i==0) {
                  System.out.print(i + " , ");
              }
          }
         
          
    }
    
}
