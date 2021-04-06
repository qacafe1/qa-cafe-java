package org.qacafe.testaautomation;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGAnnotationDemo {


  @BeforeClass
  public void openBrowser() {
    System.out.println("The browser is opened");
  }

  @BeforeMethod
  public void createAnAccountInDataBase() {
    System.out.println("Making a SQL query");
  }

  @AfterMethod
  public void deleteAccountInDataBase() {
    System.out.println("Deleting the account by making a SQL query");
  }

  @AfterClass
  public void closeBrowser() {
    System.out.println("The browser is close");
  }


  @Test
  public void loginTest() {

    System.out.println("I'm login in to the application");

    if ( 1 == 1) {
      Assert.fail(" 1 is equal to 1 but it's not correct");
    }

  }

  @Test
  public void loginTest2() {

    //

    System.out.println("I'm login in to the application second test");


  }




}
