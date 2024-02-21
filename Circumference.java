class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author: Sierra Rajabali 
  */
  
  public void ConsoleProgram() {
    //Gets radius
    double radius = readDouble("> ");

    // calculate circumference 
    double circumference = 2 * radius * Math.PI; 
    
    // print circumference 
    System.out.println(circumference); 
    
  }
}