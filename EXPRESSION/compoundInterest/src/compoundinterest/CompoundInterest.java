
package compoundinterest;

public class CompoundInterest {

    //create expression that calculates the compund interest
    public static void main(String[] args) {
        
        double finalAmount,principalAmount = 50,interest = 1.4,years = 6,time = 6;
        
        finalAmount = principalAmount*(Math.pow((1+interest/years),time));
        
        System.out.println("THE FINAL AMOUNT IS: "+ finalAmount);
    }
    
}
