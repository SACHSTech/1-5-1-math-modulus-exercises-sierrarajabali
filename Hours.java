class Hours extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    //input
    int hours = readInt("enter hours?: ");

    //calculations
    int hoursRemainder = hours % 24;
    int days = (hours - hoursRemainder) / 24;

    //print
    System.out.println(days + " days and " + hoursRemainder + " hours");
  }
}