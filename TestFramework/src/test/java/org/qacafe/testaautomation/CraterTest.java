package org.qacafe.testaautomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CraterTest {


  @Test
  public void loginTest() throws InterruptedException {

    ChromeDriver driver = new ChromeDriver();
    //open login page

    driver.get("http://application-qa.duckdns.org/login");

    //implicit wait
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //enter the login
    By emailLocator = By.name("email");
    WebElement elementEmail = driver.findElement(emailLocator);
    elementEmail.click();

    String login = "employee1@gmail.com";
    String password = "sTCzChkE";
    elementEmail.sendKeys(login);

    //enter the password
    By passwordLocator = By.name("password");
    WebElement elementPassword = driver.findElement(passwordLocator);
    elementPassword.click();
    elementPassword.sendKeys(password);

    //click on login button
    By loginButtonLocator = By.xpath("//button[@type='submit']");
    WebElement loginButton = driver.findElement(loginButtonLocator);
    loginButton.click();


    //Perform a check that user is logged in
    String actualURL = driver.getCurrentUrl();
    System.out.println("print actual" + actualURL);
    String expectedURL = "http://application-qa.duckdns.org/admin/dashboard";


    By successLoginMsgLocator = By.xpath("//div[@class='toast-message' " +
            "and text()='Login Successful']");

    WebElement successMessage = driver.findElement(successLoginMsgLocator);

    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.invisibilityOf(successMessage));

    By avatarLocator = By.xpath("//img[@alt='Avatar']");
    WebElement avatar = driver.findElement(avatarLocator);
    System.out.println();


    By logoutLocator = By.xpath("//div[contains(text(),'XLogout')]");
    avatar.click();

    WebElement logout =  driver.findElement(logoutLocator);
     wait.until(ExpectedConditions.visibilityOf(logout));



    //   Assert.assertEquals(actualURL,expectedURL, "Make sure the urls are match" );


  }
}
