package lesson1;

import lesson3.Calculater;

public class MyProgram {

  public static void main(String[] args) {
   Car myFirstCar = new Car();
   myFirstCar.startEngine();

    System.out.println(myFirstCar.model);

 //   myFirstCar.engine = new Engine();
    System.out.println("");
 //   System.out.println(myFirstCar.engine.serialNumber);


    Calculater calculater = new Calculater();

  }

}
