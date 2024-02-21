class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    //input
    int minutes = readInt("minutes?: ");

    //calculations
    int minutesRemainder = minutes % 60;
    int hours = (minutes - minutesRemainder) / 60;
    int hoursRemainder = hours % 24;
    int days = (hours - hoursRemainder) / 24;

    //final print statement
    System.out.println(days + " days, " + hoursRemainder + " hours and " + minutesRemainder);
  }
}