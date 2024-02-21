class Rads extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    //User input for degrees
    double degrees = readDouble("Degrees Measure?: ");

    //radians conversion
    double radians = Math.toRadians(degrees);
    
    //prints radian measure to screen
    System.out.println(radians);
    
  }
}