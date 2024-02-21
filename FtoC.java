class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    //inputs
    double Farenheit = readDouble("Farenheit temp?: ");

    //celcius calculation
    double celcius = (5.0 / 9.0) * (Farenheit - 32.0);
    
    //prints celcius temp
    System.out.println(celcius);
  }
}