/*This is a class for a program that displays two months with its corresponding
number, season, name, and compares if they are the same.
Written by Dikshya Shrestha
JDK ver 21.0.2
04.01.24
*/
public class Month {
    private int monthNumber;
    
    public Month (int m){ //constructor
        if (m < 1 || m > 12)
            monthNumber = 1;
        else
            monthNumber = m;
    }
    
    public void setMonthNumber (int m){ //method that sets value for monthNumber
        if (m < 1 || m > 12)
            monthNumber = 1;
        else
            monthNumber = m;
    }
    
    public int getMonthNumber (){
        return monthNumber;
    }
    
    public String getMonthName () {
        String [] monthName = { "January","February","March","April","May","June",
                "July","August","September","October","November","December"};
        return monthName[monthNumber - 1]; //returns month corresponding to the number from array
        }
    public String getSeason (){
        String seasonName = "";
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                seasonName = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                seasonName = "Spring";
                break;
            case 6:
            case 7: 
            case 8:
                seasonName =  "Summer";
                break;
            case 9:
            case 10:
            case 11:
                seasonName = "Fall";  
                break;
        }
        return seasonName;
    }
    
    @Override
    public String toString (){
        return "Month number: "+this.monthNumber+"\nMonth name: "+ this.getMonthName()
                + "\nSeason: "+ this.getSeason();
    }
    
    public boolean equals (Month month2){
        return this.monthNumber == month2.getMonthNumber();
    }
}
