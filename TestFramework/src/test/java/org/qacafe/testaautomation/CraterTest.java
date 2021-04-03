package org.qacafe.testaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CraterTest {


  @Test
  public void loginTest() throws InterruptedException {

    ChromeDriver driver = new ChromeDriver();
    //open login page
    driver.get("http://application-qa.duckdns.org/login");

    //enter the login
    By emailLocator = By.name("email");
    WebElement elementEmail =  driver.findElement(emailLocator);
    elementEmail.click();

    String login = "employee1@gmail.com";
    String password = "sTCzChkE";
    elementEmail.sendKeys(login);

    //enter the password
    By passwordLocator = By.name("password");
    WebElement elementPassword =  driver.findElement(passwordLocator);
    elementPassword.click();
    elementPassword.sendKeys(password);

    //click on login button
    By loginButtonLocator = By.xpath("//button[@type='submit']");
    WebElement loginButton =  driver.findElement(loginButtonLocator);
    loginButton.click();

    Thread.sleep(3000);


    //Perform a check that user is logged in
    String actualURL = driver.getCurrentUrl();
    System.out.println("print actual" + actualURL);
    String expectedURL = "http://application-qa.duckdns.org/admin/dashboard";

    Assert.assertEquals(actualURL,expectedURL, "Make sure the urls are match" );



  }
}
