
package swap;


public class Swap {

// this code swapp two int value with the help of third varibale
    public static void main(String[] args) {
     
        //declare two variables to store variables
        int value1 = 23;
        int value2 = 45;
        
        //pritn values before swapping
        System.out.println("THE VALUES ARE: " + value1 + " "+ value2);
        
        //declate temp variable for swapping
        int temp;
        
        //swapping process take place
        temp = value1;
        value1 = value2;
        value2 = temp;
        
        //print values after swapping
        System.out.println("THE VALUES ARE: " + value1 + " "+ value2);
        
    }
    
}
