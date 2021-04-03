package org.qacafe.testaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumFirstTesti {

  @Test
  public void seleniumRun() {

    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");

    By searchBoxLocator = By.name("q");
    WebElement searchBoxElement = driver.findElement(searchBoxLocator);
    searchBoxElement.click();
    searchBoxElement.sendKeys("Mike Tyson");


  }
}
