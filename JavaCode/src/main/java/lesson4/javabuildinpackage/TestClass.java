package lesson4.javabuildinpackage;

import java.util.Scanner;

public class TestClass {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter user name");

    String userName  = scanner.nextLine();
    System.out.println("The user name was entered : " + userName);

  }
}
