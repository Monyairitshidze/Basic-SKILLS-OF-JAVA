
package sum;

import java.util.Scanner;


public class Sum {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //get a user input
        System.out.println("Enter the num1:");
         int first = sc.nextInt();
         System.out.println("Enter the num2:");
         int second = sc.nextInt();
         System.out.println("Enter the num3:");
         int third = sc.nextInt();
         
         //compute the sum
         int sum = first+second+third;
         
         //display sum
         System.out.println("The sum of 3 numbers is: "+sum);
         
         
    }
    
}
