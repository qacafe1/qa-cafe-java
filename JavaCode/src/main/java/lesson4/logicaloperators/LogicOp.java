package lesson4.logicaloperators;

public class LogicOp {
  public static void main(String[] args) {

    if (2 > 1) {
      System.out.println(" The condition was true ");
    }

    if (1 >= 1) {
      System.out.println("Second condition was true ");
    }

    if (2 != 1) {
      System.out.println("Third condition was true ");
    }

    int x = 1;


    if (1 == 1) {
      System.out.println("Fourth condition was true ");
    }


    if (1 != 1) {
      System.out.println("Fourth condition was true ");
    } else {
      System.out.println("The condition was  false");
    }

    int time = 21;
    if (time < 14) {
      System.out.println("Good morning ");
    } else if (time < 18) {
      System.out.println("Good day");
    } else if (time < 24) {
      System.out.println("Good evening");
    } else {
      System.out.println("Good night");
    }


    time = 14;
    if (time < 14) {
      System.out.println("Good morning ");
    } else if (time < 18) {
      System.out.println("Good day");
    }

    String result = (time < 18) ? "Good evening" : "Good day";
    System.out.println("Ternary operator test : " + result );


    int day = 4 ;

    switch (day) {
      case 1 :
        System.out.println("Monday");
        break;
      case 2 :
        System.out.println("Tuesday");
        break;
      case 3 :
        System.out.println("Wednesday");
        break;
      case 4 :
        System.out.println("Thursday");
      case 5 :
        System.out.println("Friday");
        break;
      case 6 :
        System.out.println("Saturday");
        break;
      case 7 :
        System.out.println("Sunday");
        break;
    }


    String howIfeel = "bad " ;

    switch (howIfeel) {
      case "poor" :
        System.out.println("String Monday");
        break;
      case "bad" :
        System.out.println("String Tuesday");
        break;
      case "great" :
        System.out.println("String Friday");
        break;
    }



  }

  }



