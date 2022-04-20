package calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser 
{

	public static void main(String[] args) throws InterruptedException
	{
		//Step 1: Select Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desai\\OneDrive\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
		//KEY-->Browser name--> webdriver.chrome.driver OR webdriver.gecko.driver
		//VALUE-->Browser'path
		
		//Step 2: Create object WebDriver class with ChromeDriver'Constructor
		WebDriver driver= new ChromeDriver();
		
		Thread.sleep(5000);
		
		//Step 3: URL
		driver.get("https://www.facebook.com");
	}

}
