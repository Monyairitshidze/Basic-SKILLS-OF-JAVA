
package userinput5;

import java.util.Scanner;

public class UserInput5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //get a user input
        System.out.println("Enter a number:");
         int number = sc.nextInt();
         
         //use for loop to compute and display my multiplication table
         for(int i=0; i<=12; i++) { 
             
             System.out.println(number+" * "+ i +" = " +number*i);
         }
    }
    
}
