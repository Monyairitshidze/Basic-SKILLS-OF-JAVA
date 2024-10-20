
package swap6;


public class Swap6 {

 
    public static void main(String[] args) {
        
        //declare an array that hold 5 ellements
        int array[] = { 1,2,3,4,5};
        
        //use for each loop to print all ellements before swapping
        for(int values : array) {
            
            System.out.print("[" +values+ "]" + ",");
        }
        
       int temp = array[3];
        array[3] = array[4];
        array[4] = temp;
        
        System.out.println();
        
         //use for each loop to print all ellements after swapping
        for(int values : array) {
            
            System.out.print("[" +values+ "]" + ",");
        }
    }
    
}
