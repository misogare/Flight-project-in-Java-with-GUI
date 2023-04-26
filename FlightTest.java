import java.util.*; // for debuging my work ,used System.out.println(Arrays.toString);  
import java.io.*;

public class FlightTest  { //class name

private static Flight[] f; // to access it outside of class if its withing static main i cant access it out of this class in non static method 
public static Flight[] getf(){ // return the array F[] 
return (f);
}

public static void main(String[] args)
{
Flight f1 = new Flight("Delta","Philadephia","london",347); //3 objects with 4  variables each to pass to Flight class
Flight f2 = new Flight("US air","Boston","Los Angles",212);
Flight f3 = new Flight("Continental","Atlanta","Chicago",822);

f = new Flight[3]; // making an array of objects
f[0] = f1;
f[1] = f2;
f[2] = f3;
System.out.println("before sorting (acending order): ");
for (Flight bf : f) // get the result from flight class and print them line by line 
     {
     System.out.println(bf);
    }

Flight.sortFlight(f); // calling the sortFlight method in Flightclass its static so callable by using class.method
System.out.println("after sorting :");
for (Flight flights : f) // get the result from flight class and print them line by line 
     {
     System.out.println(flights);
    }
Form1 e = new Form1();
}
}