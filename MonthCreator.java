/*This program displays two months with its corresponding number, season, name, 
and compares if they are the same.
Written by Dikshya Shrestha
JDK ver 21.0.2
04.01.24
*/

public class MonthCreator {

    public static void main(String[] args) {
        Month month1 = new Month(4);
        Month month2 = new Month (8);
        
        System.out.println( month1.toString());
        System.out.println( month2.toString());
        
        System.out.println("The two months are equal, True or False? " + month1.equals(month2));
    }
}
