
import java.util.*; // for debuging my work ,used System.out.println(Arrays.toString); 
import java.io.*;

public class Flight // Flight class
{
private String airline_Name,flight_Origin,destination_City; //private variables 
private int flight_Number;
public Flight (String airline_Name,String flight_Origin,String destination_City, int flight_Number)//initilizing and constructing
{
this.airline_Name = airline_Name; // this.variable to call the priv variables and use them when they are called in other classes 
this.flight_Origin = flight_Origin;
this.destination_City = destination_City;
this.flight_Number = flight_Number;
}
public void setAirline_Name (String airline_Name) // setting variables will be used in sorting method 
{
this.airline_Name = airline_Name;
}
public void setFlight_Origin (String flight_Origin)// setting variables will be used in sorting method 
{
this.flight_Origin = flight_Origin;
}
public void setDestination_City (String destination_City)// setting variables will be used in sorting method
{
this.destination_City = destination_City;
}
public void setFlight_Number (int flight_Number)// setting variables will be used in sorting method
{
this.flight_Number = flight_Number;
}
public String getAirline_Name()// returning  variables values to be used by main method or other methods like toString
{
return airline_Name;
}
public String getFlight_Origin()// returning  variables values to be used by main method or other methods like toString
{
return flight_Origin;
}
public String getDestination_City()// returning  variables values to be used by main method or other methods like toString
{
return destination_City;
}
public int getFlight_Number()// returning  variables values to be used by main method or other methods like toString
{
return flight_Number;
}
public static Flight[] sortFlight(Flight []f)// sorting the array comparing the nth array with previous one 2nd > 1nd , 1nd > 0nd ,....
{
    for(int i =f.length-1;i>=0;i--)// for(int i =f.length-1;i>=0;i--) either one
    {
        for(int j=0;j<=i;j++) // second loop for comparison 
        {
            int myFlightNum1 = f[i].getFlight_Number(); //storing the flightnum column of i in new variable
            int myFlightNum2 = f[j].getFlight_Number();//storing the flightnum column of j in new variable
          String airLine_Name1 = f[i].getAirline_Name();//storing the airline_name column of i in new variable
          String airLine_Name2 = f[j].getAirline_Name();//storing the airline_name column of j in new variable
           String flight_Origin1 = f[i].getFlight_Origin();//storing the flight_origin column of i in new variable
           String flight_Origin2 = f[j].getFlight_Origin();//storing the flight_origin column of j in new variable
            String destination_City1 = f[i].getDestination_City();//storing the destination_city column of i in new variable
          String destination_City2 = f[j].getDestination_City();//storing the destination_city column of j in new variable
        if(myFlightNum1<myFlightNum2)// by changing > to < decending to acending . 
            {
            f[i].setFlight_Number(myFlightNum2);// assigning the value of bigger number to higher array position ,doesnt need 3rd variable becuase its allready sttored in myflightnum1
            f[j].setFlight_Number(myFlightNum1);// assigning the value of smaller number to lower array position
           f[i].setAirline_Name(airLine_Name2);// swapping other elements to move them with the smaller number 
          f[j].setAirline_Name(airLine_Name1);
           f[i].setFlight_Origin(flight_Origin2);
           f[j].setFlight_Origin(flight_Origin1);
            f[i].setDestination_City(destination_City2);
           f[j].setDestination_City(destination_City1);
            }
        }
    }
return (f);// return the array f
}
public String toString()// converting the hashcode to string 
{
return airline_Name+" "+flight_Number+" --"+"  From: "+flight_Origin + ", "+"To: "+destination_City;// as the assigment asked for
}
}
