
class Km_to_Miles extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    //inputs
    double kilometers = readDouble("Kilometers?: ");

    //calculation for miles
    double miles = kilometers * 0.621371;
    
    //prints miles
    System.out.println(miles);
  }
}
