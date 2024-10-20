
package swap4;


public class Swap4 {

//this code is to create a method that swapp two ellements in an array
    public static void main(String[] args) {
        
        //declare an array that hold 5 ellements
        int array[] = { 1,2,3,4,5};
        
        //use for each loop to print all ellements before swapping
        for(int values : array) {
            
            System.out.print("[" +values+ "]" + ",");
        }
        
        //call swap function
        swap(array);
        
        System.out.println();
       
        //use for each loop to print all ellements after swapping
        for(int values : array) {
            
            System.out.print("[" +values+ "]" + ",");
        }
        
        
    }
    
    // create a mehtod that swapp first and second index ellements in the array
    public static void swap(int array[]) {
        
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
       
    }
    
}
