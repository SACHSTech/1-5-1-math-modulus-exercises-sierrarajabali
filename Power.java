class Power extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    //inputs
    double base = readDouble("Base?: ");
    double exponent = readDouble("Exponent: ");

    //calculation
    double result = Math.pow(base, exponent);

    //prints result
    System.out.println(result);
  }
}