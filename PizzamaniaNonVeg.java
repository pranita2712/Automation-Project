package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PizzamaniaNonVeg
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumwebdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.dominos.co.in/menu/");
	 Actions a =new Actions(driver);
	 
	 driver.manage().window().maximize();
	 
	 //Non Veg pizza Mania
	 driver.findElement(By.xpath("//*[@id=\"pizza\"]/div[1]/div[2]/ul/li[2]/a/h2")).click();
	 Thread.sleep(2000);
     
	 //NON VEG LOADED Order Now
	 driver.findElement(By.xpath("//*[@id=\"pizza-mania-non-veg\"]/div[2]/div/div[1]/div/a")).click();
	 Thread.sleep(2000);
     
	 //CHICKEN SAUSAGE Order Now
	 driver.findElement(By.xpath("//*[@id=\"pizza-mania-non-veg\"]/div[2]/div/div[2]/div/a")).click();
	 Thread.sleep(2000);
     
	//PEPPER BARBECUE CHICKEN Order Now
	 driver.findElement(By.xpath("//*[@id=\"pizza-mania-non-veg\"]/div[2]/div/div[3]/div/a")).click(); 
	 Thread.sleep(2000);
     
     
}  
     
}
