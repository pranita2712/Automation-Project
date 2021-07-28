package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PizzaManiaVeg
{

public static void main(String[] args) throws InterruptedException
 
{

	System.setProperty("webdriver.chrome.driver","C:\\seleniumwebdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	
   WebDriver driver=new ChromeDriver();
  driver.get("https://www.dominos.co.in/menu/");
   Actions a =new Actions(driver);
   driver.manage().window().maximize();
    
    driver.findElement(By.xpath("//*[@id=\"pizza\"]/div[1]/div[2]/ul/li[2]/a/h2")).click(); //Pizza Mania Veg
    //Thread.sleep(2000);
    
    //TOMATO Order Now
    
    driver.findElement(By.xpath("//*[@id=\"pizza-mania-veg\"]/div[2]/div/div[1]/div/a")).click();
    driver.findElement(By.className("img-responsive")).click();//logo
    //Thread.sleep(2000);
    
    
    //VEG LOADED Order Now
    driver.findElement(By.xpath("//*[@id=\"pizza-mania-veg\"]/div[2]/div/div[2]/div/a")).click();
    driver.findElement(By.className("img-responsive")).click();//logo
    //Thread.sleep(2000);
    
  //CHEESY Order Now
    driver.findElement(By.xpath("//*[@id=\"pizza-mania-veg\"]/div[2]/div/div[3]/div/a")).click();
    driver.findElement(By.className("img-responsive")).click();//logo
    //Thread.sleep(2000);
    
    //CAPSICUM Order Now
    driver.findElement(By.xpath("//*[@id=\"pizza-mania-veg\"]/div[2]/div/div[4]/div/a")).click();
    driver.findElement(By.className("img-responsive")).click();//logo
    Thread.sleep(2000);
    
  //ONION Order Now
    driver.findElement(By.xpath("//*[@id=\"pizza-mania-veg\"]/div[2]/div/div[5]/div/a")).click(); 
    driver.findElement(By.className("img-responsive")).click();//logo
    Thread.sleep(2000);

    //GOLDEN CORN Order Now
    driver.findElement(By.xpath("//*[@id=\"pizza-mania-veg\"]/div[2]/div/div[6]/div/a")).click();
    driver.findElement(By.className("img-responsive")).click();//logo
    Thread.sleep(2000);

  //PANEER & ONION Order Now
    driver.findElement(By.xpath("//*[@id=\"pizza-mania-veg\"]/div[2]/div/div[7]/div/a")).click(); 
    driver.findElement(By.className("img-responsive")).click();//logo
    Thread.sleep(2000);
    
    //CHEESE N TOMATO Order Now
    driver.findElement(By.xpath("//*[@id=\"pizza-mania-veg\"]/div[2]/div/div[8]/div/a")).click();
    driver.findElement(By.className("img-responsive")).click();//logo
    Thread.sleep(2000);
    
}    
}
