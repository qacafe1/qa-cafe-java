package lesson1;

public class Car {

  public String name = "audi";
  public String model = "100";
  public int id = 1021;
  public Engine engine = new Engine();

  public void startEngine() {
    System.out.println("Engine is started");
  }

  public Engine getEngine(){
    return engine;
  }

  public static void getInfoManufacturer(){
    System.out.println(" We are the  Audi");
  }


}


