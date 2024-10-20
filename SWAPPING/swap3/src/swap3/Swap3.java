
package swap3;


public class Swap3 {

 //this code swapp first and last ellement of the string
    public static void main(String[] args) {
       
        //declare and assign value
        String name = "Ritshidze";
       
        //get character at fiest and last index
      char first =  name.charAt(0);
      char last = name.charAt(8);
      
      //swap two character
      char temp;
      temp = first;
      first = last;
      last = temp;
      
      //join them with the full name
      name = first+"itshidz"+ last;
      
      //print the values
      System.out.println(name);
      
     
        
    }
    
}
