package lesson1;

public class MyProgram {

  public static void main(String[] args) {
   Car myFirstCar = new Car();
   myFirstCar.startEngine();

    System.out.println(myFirstCar.model);

    myFirstCar.engine = new Engine();
    System.out.println("");
    System.out.println(myFirstCar.engine.serialNumber);

  }

}
