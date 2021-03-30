package lesson3;

public class CalculatorRunner {

  public static void main(String[] args) {
    //variable declaration
    Calculater  calculator;

    //object initialization
    calculator = new Calculater();
    calculator.printColor();


//     int x =  calculator.addition(2 , 10 );
     calculator.substruction(2 , 33);
   // System.out.println("Value of x " + x);
    calculator.isBroken(15, 41, "Mike Tyson String", true);
  }
}
