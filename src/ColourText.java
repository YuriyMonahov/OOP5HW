

public class ColourText {

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";

  public static void main(String[] args) {
      printIndicator();
  }
  static void printIndicator(){
      int value = 57;
      if (value>=0 || value<=30){
          System.out.println(ANSI_YELLOW +"value" + ANSI_RESET);
      }
      else if (value>=31 || value<=75){
          System.out.println(ANSI_RED + "value" + ANSI_RESET);
      }
      else if (value>=76 || value<=100){
          System.out.println(ANSI_GREEN + "value" + ANSI_RESET);
      }
      else if(value<0 && value >100){
          System.out.println("Некорректно");
      }

  }

  }