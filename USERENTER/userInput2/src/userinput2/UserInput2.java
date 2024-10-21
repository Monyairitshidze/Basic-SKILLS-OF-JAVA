
package userinput2;

import java.util.Scanner;

public class UserInput2 {

    //ask the user to enter thir age and check if they are allowed to vote or not
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        //get a user input
        System.out.println("Enter your age:");
         int age = sc.nextInt();
         
         //use if-else statements to check the condition
         if(age<18) {
             System.out.println("DO NOT VOTE");
         }
         else{
           System.out.println("VOTE");  
         }
    }
    
}
