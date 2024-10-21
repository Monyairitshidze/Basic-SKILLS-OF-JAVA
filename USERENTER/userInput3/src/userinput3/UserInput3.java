
package userinput3;

import java.util.Scanner;

public class UserInput3 {

    //read a users height in meters and wight in kg then calculate BM1
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        //get a user input
        System.out.println("Enter your height in meters:");
         double height = sc.nextDouble();
         
        System.out.println("Enter your weight in KG:");
         double weight = sc.nextDouble(); 
         
         //compute IBM
         double BMI = weight/(height*height);
         
         System.out.println(BMI);
    }
    
}
