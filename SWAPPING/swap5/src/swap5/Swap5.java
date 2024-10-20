
package swap5;


public class Swap5 {

/*this code swap three integer such that the first take value of the second 
    and the second take value of the third and third take value of the first*/
    
    public static void main(String[] args) {
       
        //declare 3 variable and assign values
        int value1 = 12;
        int value2 = 22;
        int value3 = 32;
        
        //print before swapping
        System.out.println("BEFORE SWAPPING: "+ value1 +","+ value2 + ","+ value3);
        
        //declare temp variable to help with swapping
        int temp;
        temp = value1;
        value1 = value2;
        value2 = value3;
        value3 = temp;
        
         //print after swapping
        System.out.println("AFTER SWAPPING: "+ value1 +","+ value2 + ","+ value3);
        
        
    }
    
}
