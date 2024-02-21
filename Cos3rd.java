class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    //gets inputs
    double sideA = readDouble("Side A?: ");
    double sideB = readDouble("Side B?: ");
    double angle = readDouble("Angle in degrees?: ");
    
    //math calc for side c
    double sideC = Math.sqrt( (sideA * sideA) + (sideB * sideB) - 2 * sideA * sideB * Math.toDegrees(Math.cos(angle)));

    //Prints side c
    System.out.println(sideC);
  }
}