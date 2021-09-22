/**
*@author Rafael ADIBA - Passport number (Erasmus student from France) : 17AD81774
*@version 17/09/2021 
*/
package mains;
import model.Coordinate;

public class MainP1 { //this class is used for the main

  public static void main(String[] args) {// this is the main function of class MainP1
    
    Coordinate c1 = new Coordinate(5,4); // we create a reference of an object c1 of class Coordinate that will store the address of the coordinates x=5 , y=4
    
  

    Coordinate c2 = new Coordinate(c1);//Here we create an object "coordinate" with the values 2 for x and y
    //print_c1=Coordinate.to_string(c1);
    Coordinate c3 = c2.Coordinate_add(3,1); //c3 will have the coordinates of c2 added to the coordinates 3,1
    Coordinate c4 = c1.Coordinate_add(c2);
    //c4 will have the coordinates of c1 added to the coordinates of c2
    System.out.println("c1="+c1.to_string());
    System.out.println("c2="+c2.to_string());
    System.out.println("c3="+c3.to_string());
    System.out.println("c4="+c4.to_string());

  }
}