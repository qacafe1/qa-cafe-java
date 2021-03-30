package lesson3;

import java.sql.SQLOutput;

public class Calculater {

  private String color = "black";


  public int addition(int a, int b  ){
    System.out.println( "Value of a is :" + a );
    System.out.println( "Value of b is :" + b );
    int result = a + b;
    return result;
  }

  // This function doesn;t return anything
  public void substruction(int a, int b  ){
    System.out.println( "Value of a is :" + a );
    System.out.println( "Value of b is :" + b );
    int result = a - b;
    System.out.println( "Result is :" + result );
  }

  // This function doesn;t return anything
  public void isBroken(int a, int b, String str, boolean bool){
    System.out.println( "Value of a is :" + a );
    System.out.println( "Value of b is :" + b );
    System.out.println( "Value of str is :" + str);
    System.out.println( "Value of bool is :" + bool);
  }


  public void printColor(){
    System.out.println("Calculator color "  + color);
  }

  public static void printLenaName(){
    System.out.println(" Hi Lena ");
  }
}
