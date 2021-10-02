package lauchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\June2021_Selenium\\1st_Selenium_Project\\driver\\chromedriver.exe");// location of the specific file
		WebDriver driver = new ChromeDriver();// polymorphisom concept //line 12 and 13 is launching the browser
		//maximize the window
		driver.manage().window().maximize();
		// get  to the web site
		driver.get("https://www.google.com/");
//		//identify web element and perform action
		driver.findElement(By.name("q")).sendKeys("selenium");
//		driver.findElement(By.name("btnk")).click();// we identify and operating them
	
//		//wait
		Thread.sleep(5000);// its  to stop execution for sometime
		driver.close(); // to close the window
		
		
		
		
		
	}

}
