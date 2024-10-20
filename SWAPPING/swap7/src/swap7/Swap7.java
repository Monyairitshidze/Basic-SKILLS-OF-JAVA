
package swap7;

//import scanner to enable use to enter
import java.util.Scanner;
public class Swap7 {

//this code swap two numbers enterd by the user
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      
      //use scanner to get user input
      System.out.println("Enter first number:");
      int first = sc.nextInt();
      System.out.println("Enter second number:");
      int second = sc.nextInt();
      
      //print values before swapping
        System.out.println("THE VALUES ARE: " + first + " "+ second);
        
      
      //declate temp variable for swapping
        int temp;
        
        //swapping process take place
        temp = first;
        first = second;
        second = temp;
        
        //print values after swapping
        System.out.println("THE VALUES ARE: " + first + " "+ second);
        
        
        
    }
    
}
