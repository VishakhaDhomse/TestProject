package propertyFile;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JQuery_DragAndDrop 
{
  @Test
  public void jQuery() throws Exception
  {
	  Properties p= new Properties();
	  FileInputStream file= new FileInputStream("./Application.properties");
	  p.load(file);
	  
	  System.setProperty(p.getProperty("BrowserName"), p.getProperty("BrowserPath"));
	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(2000);
	  
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  driver.get(p.getProperty("url"));
	  Thread.sleep(2000);
	  
	  driver.switchTo().frame(driver.findElement(By.xpath(p.getProperty("frame"))));
	  
	  WebElement drag=driver.findElement(By.xpath(p.getProperty("src")));
	  WebElement drop=driver.findElement(By.xpath(p.getProperty("des")));
	  Thread.sleep(2000);
	  
	  Actions a= new Actions(driver);
	  a.dragAndDrop(drag, drop).perform();
	  
	  Thread.sleep(2000);
	  driver.close();
	  
  }
}
