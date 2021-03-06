// Generated by Selenium IDE
package com.testtask.selenium.junit;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SendFormWithDataAndInvalidEmailTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void sendFormWithData() {
    driver.get("https://ffwagency.com/contact-us");
    driver.manage().window().setSize(new Dimension(1848, 1053));
    driver.findElement(By.id("FirstName")).sendKeys("Test");
    driver.findElement(By.id("LastName")).sendKeys("Test");
    driver.findElement(By.id("Company")).sendKeys("Test");
    driver.findElement(By.id("Phone")).sendKeys("1234");
    driver.findElement(By.id("Email")).sendKeys("Test");
    driver.findElement(By.cssSelector(".chosen-single > span")).click();
    driver.findElement(By.cssSelector(".chosen-search-input")).click();
    driver.findElement(By.cssSelector(".active-result:nth-child(10)")).click();
    driver.findElement(By.id("commentCapture")).click();
    driver.findElement(By.id("commentCapture")).sendKeys("Test please ignore");
    driver.findElement(By.cssSelector(".mktoLogicalField > #LblconsenttoProcessing")).click();
    driver.findElement(By.cssSelector(".mktoButton")).click();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    js.executeScript("window.scrollTo(0,300)");
    driver.findElement(By.xpath("//*[@id=\"ValidMsgEmail\"]"));
  }
}
