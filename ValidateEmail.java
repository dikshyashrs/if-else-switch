/*This program lets the user input their username and validates it.
Written by Dikshya Shrestha
04/08.2024
JDK ver 21.0.2
 */

import java.util.Scanner;


public class ValidateEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean hasNum = false;
   
        System.out.print("Please enter your email address: ");
        String emailAdd = input.nextLine();
        
        if (emailAdd.length() < 15 || emailAdd.length() > 25){
            System.out.println("Invalid email");
            return;
        }
        else if (!emailAdd.contains("@")){
            System.out.println("Invalid email");
            return;
        }
        else{
            char[] emailChar = emailAdd.toCharArray();
            for (int a = 0; a < emailChar.length; a++){
                char i = emailChar[a];
                if (Character.isDigit(i)){
                    hasNum = true;
                    break;
                }
            }           
        }   
   if (!hasNum){
       System.out.println("Invalid email");
   }
   else
            System.out.println("Valid email");
     
     }       
}
