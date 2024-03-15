/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
   public static void main(String[] args) {
      // Performs simple arithmetic operations on one commnand-line argument
      int coins = Integer.parseInt(args[0]);
      
   

    
            System.out.println(("Use" + " " + (coins / 25) + " " + "quarters" + " " + "and" + " " + (coins % 25) + " " + "cents"));
}
         }
      
