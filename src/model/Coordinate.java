package model;
public class Coordinate {
  public int x,y;
  
  public Coordinate(int x, int y)
  /** @param x and y will be assigned to an object
  */
   //this function puts coordinates x and y to an object coordinate from the main
  {
    this.x=x;
    this.y=y;
    
  }
  public Coordinate(Coordinate c)
  /** @param c a reference to an object that has c.x and c.y coordinates
  */
  //the function assigns to x and y the values of c.x and c.y of the object c
  {
    x=c.x;
    y=c.y;
  }
  //public boolean 
  public boolean equals(Coordinate c)
  /**
  *@param c a reference to an object that has coordinates x and y assigned*/
  //this function returns true if two objects of class coordinate have the same values for x and y. If not it returns false 
  {
    return x==c.x && y==c.y;
    //@return true or false
  }

   
   public String to_string()
  { /**
  *@param c is an object that has coordinates x and y
  */
  // the function returns a string that contains the coordinates of an object
    String concatenation; //concatenation will contain the coordinates of an object
    concatenation = "["+this.x +","+this.y +"]";
    return concatenation;
    //@return a string of the coordinates of an object
  }

  public Coordinate Coordinate_add(Coordinate c)
  {
    /**
    *@param c an object that has coordinates x and y
    */
    // this function adds coordinates of the object c to another object 
    Coordinate new_c = new Coordinate(x+c.x,y+c.y);
    return new_c;
    /**
    *@return a reference of an object of class Coordinate "new_c"
    */
  }
  public Coordinate Coordinate_add(int x, int y)
  {
    /**
    *@param x and y are coordinates that we want to add to the coordinates of an object from the class Coordinate
    */
    //this function adds coordinates x and y to an object Coordinate
    Coordinate new_c=new Coordinate(this.x+x,this.y+y);
    return new_c;
    /**
    *@return a reference to a new object that has new coordinates
    */
  }
}
