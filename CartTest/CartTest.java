package CartTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CartTest
{
	public static void main(String[] args)
	{
		//disabling alerts
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-save-password-bubble");
		
		
		WebDriver driver = new ChromeDriver();
		
		//opening browser/site
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//adding product to the cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		//opening cart
		driver.findElement(By.className("shopping_cart_link")).click();
		
		//checkout
		driver.findElement(By.id("checkout")).click();
		
		//entering user details
		driver.findElement(By.id("first-name")).sendKeys("Amaan");
		driver.findElement(By.id("last-name")).sendKeys("Mulani"); 	
		driver.findElement(By.id("postal-code")).sendKeys("400706");
		
		//continue checkout
		driver.findElement(By.id("continue")).click();
		
		//finish order
		driver.findElement(By.id("finish")).click();
		
		//verify order
		WebElement messageElement = driver.findElement(By.className("complete-header"));
		System.out.println("Order Status: "+ messageElement.getText());
		
		//close 
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}
}