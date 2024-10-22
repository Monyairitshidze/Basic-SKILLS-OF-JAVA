
package quadraticequation;

import java.util.Scanner;

public class QuadraticEquation {

    //evaluate and print result of a quadratic equation
    public static void main(String[] args) {
        
        //declare variables
        int a,b,c;
        double x1,x2,real,imaginary;
        
        Scanner sc = new Scanner(System.in);
        
        //get user input
        System.out.println("ENTER VALUE OF A: ");
        a = sc.nextInt();
        System.out.println("ENTER VALUE OF B: ");
        b = sc.nextInt();
        System.out.println("ENTER VALUE OF C: ");
        c = sc.nextInt();
        
        //compute discriminant
        int discriminant = b*b-4*a*c;
        
        
        //use conditionsl statements to make decision
        if(discriminant >=0) {
            x1 = -b + Math.sqrt(discriminant)/2*a;
            x2 = -b - Math.sqrt(discriminant)/2*a;
        }
        else {
          
        }
        
    }
    
}
