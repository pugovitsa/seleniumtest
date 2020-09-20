// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.rules.Timeout;
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

public class SendemptyformTest {
  private WebDriver driver;
  private String expectedErrorText = "This field is required.";
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
  public void sendemptyform() {
    driver.get("https://ffwagency.com/contact-us/");
    driver.manage().window().setSize(new Dimension(1848, 1053));
    js.executeScript("window.scrollTo(0,600)");
    driver.findElement(By.xpath("//*[@id=\"mktoForm_1008\"]/div[20]/span/button")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.xpath("//*[@id=\"ValidMsgFirstName\"]"));
  }
}