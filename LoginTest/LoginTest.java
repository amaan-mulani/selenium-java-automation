package LoginTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest
{
	public static void main(String [] args)
	{
		//Launching web browser
		WebDriver driver= new ChromeDriver();
		
		//Opening the site
		 driver.get("https://the-internet.herokuapp.com/login");
		
		//Maximizing the window
		driver.manage().window().maximize();
		
		
		
		//finding element and storing it in user name which is of type WebElement
		WebElement username = driver.findElement(By.id("username"));
		
		//entering user name
		username.sendKeys("tomsmith");
		
		//finding password
		WebElement password = driver.findElement(By.id("password"));
		
		//enter password
		password.sendKeys("SuperSecretPassword!");
		
		//finding login button
		WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
		
		//clicking login
		login.click();
		
		//getting the success message
		WebElement message = driver.findElement(By.id("flash"));
		
		//displaying the message
		System.out.println("Login message : "+ message.getText());
		
		// Implicit wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		//closing the browser
		driver.quit();
	}
	
	
}