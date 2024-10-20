
package swap8;


public class Swap8 {

    public static void main(String[] args) {
      
        //declare and initialize two variables
        int a= 1, b = 7;
        
         //print values before swapping
        System.out.println("THE VALUES ARE: " + a + " "+ b);
        
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        //print values after swapping
        System.out.println("THE VALUES ARE: " + a + " "+ b);
        
    }
    
}
