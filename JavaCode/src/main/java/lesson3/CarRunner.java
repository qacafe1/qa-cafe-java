package lesson3;


import lesson1.Car;   // Import a single class
import lesson1.*;   // Import the whole package

public class CarRunner {

  public static void main(String[] args) {
    Car  car = new Car();
    Car  car2 = new Car();
    System.out.println(car);
    System.out.println(car2);
    Engine engine = new Engine();

    Car.getInfoManufacturer();

//    System.out.println(car.name);
//    System.out.println(car.id);
//
//
//
//    System.out.println(car.engine.serialNumber );
//    System.out.println(car.getEngine().serialNumber );


   // System.out.println(car.getEngine());
  }



}


