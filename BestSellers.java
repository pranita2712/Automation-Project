package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BestSellers {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumwebdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://pizzaonline.dominos.co.in/menu?categoryId=1");
		Actions a =new Actions(driver);
		driver.manage().window().maximize();
		   
		//The Unthinkable Pizza
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[2]/div/div[1]/div/div/div[1]/div/div[1]/img")).click();
		 Thread.sleep(2000);
		//Pizza Size
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[3]/div[1]/div/div[1]/div/div[2]/div[2]")).click();
		 Thread.sleep(2000);
		//Select Crust
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[3]/div[1]/div/div[2]/div/div/div/div/div[3]/img")).click();
		 Thread.sleep(2000);
		 
		//SROLLBAR
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(0,5000)");
	        System.out.println("Scrolled Down");
	        
	        JavascriptExecutor js1=(JavascriptExecutor)driver;
	        js1.executeScript("window.scrollBy(0,-3000)");
	        System.out.println("Scrolled Up");
		 
		//Add To Cart
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[4]/div/div[2]/button/span")).click();
		 Thread.sleep(2000);
		 
		 
		 //If you want to increase the Quantity
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div[2]")).click();
		 Thread.sleep(2000);
		 
		 //Mini Cart Checkout
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/button")).click();
		 Thread.sleep(2000);
		
		//Add Tomato Ketchup
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[3]/div[1]/div/div/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div[2]/div")).click();
		 Thread.sleep(2000);
		
		 //Cheese Jalapeno
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[3]/div[1]/div/div/div[2]/div[2]/div/div/div[2]/ul/li[4]/div/div[2]/div")).click();
		 Thread.sleep(2000);
		
		 //Select Coupon
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[3]/div[2]/div/div[5]/div[2]/span[2]")).click();
		 Thread.sleep(2000);
		
		 //if not Applying any coupon then click on ESC
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[1]/div/div[2]/span")).click();
		 Thread.sleep(2000);
		 
		 //Place Order
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[3]/div[2]/div/div[6]/div/div/div[7]/button/span")).click();
		 Thread.sleep(2000);
		 
		 //close
		 //driver.close();
		 
		
		
	}

}
