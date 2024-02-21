class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    //gets inputs
    double sideA = readDouble("Side A?: ");
    double sideB = readDouble("Side B?: ");
    double angle = readDouble("Angle in degrees?: ");

    //area calculation
    double area = (sideA * sideB * Math.toDegrees(Math.sin(angle))) / 2;

    //print area
    System.out.println(area);
    
  }
}