package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MealsandCombos {

	public static void main(String[] args) throws InterruptedException 
	{
		
System.setProperty("webdriver.chrome.driver","C:\\seleniumwebdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://pizzaonline.dominos.co.in/menu?categoryId=1");
		Actions a =new Actions(driver);
		driver.manage().window().maximize();
		
		//Capsicum Buddy Combo
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[10]/div/div[2]/div/div/div[2]/div[1]/span[1]")).click();
		 Thread.sleep(2000);
		 
		 //Add to Cart
		 driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[10]/div/div[2]/div/div/div[2]/div[2]/div/button/span")).click();
		 Thread.sleep(2000);
		 
		 //Increase Quantity
		 driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[10]/div/div[2]/div/div/div[2]/div[2]/div/div[2]")).click();
		 Thread.sleep(2000);
		 
		
		//Mini Cart Checkout
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/button")).click();
		 Thread.sleep(2000);
		 
		 //Place Order
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[3]/div[2]/div/div[6]/div/div/div[7]/button/span")).click();
		 Thread.sleep(2000);
		

	}

}
