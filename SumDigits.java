/*find the sum of digits of a number
entered by the user into the scanner
from 0 to 1000
*/

   //importing a scanner
   import java.util.Scanner;
   
//Name of the Class   
public class SumDigits {
   
   //Main Method
   public static void main(String[] args) {
      
      //creating a new scanner
      Scanner scanner = new Scanner(System.in);
      
      //prompting the user to enter
      //a number between 0 and 1000
      System.out.println("Enter a number between 0 and 1000: ");
      
      //taking input from user
      int input = scanner.nextInt();
      
      int lastDigit = input % 10;
      int firstDivide = input / 10;
      int middleDigit = firstDivide % 10;
      int firstDigit = firstDivide / 10; 
            
      int sum = lastDigit + middleDigit + firstDigit;
      
      System.out.println("The Sum of the digits is: " + sum);    
        
   }
}//end of class SumDigits         
