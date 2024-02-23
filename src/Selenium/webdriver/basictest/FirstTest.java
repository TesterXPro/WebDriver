package Selenium.webdriver.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver-win32\\chromedriver.exe");
		
		//ChromeDriver driver = new ChromeDriver();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.kingsresearch.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/button[1]")).click();
		
		Thread.sleep(4000);
		
		WebElement SignUp = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/div[2]/a[2]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(SignUp).click().build().perform();
		System.out.println("passed");
		
		

	}

}
