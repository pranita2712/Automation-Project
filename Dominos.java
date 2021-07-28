package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dominos {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumwebdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
		
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.dominos.co.in/menu/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"veg-pizzas\"]/div[2]/div/div[3]/div/a")).click(); //Pizza mania view all
        
        driver.findElement(By.className("img-responsive")).click(); //pizza mania logo
        
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
        
        //SROLLBAR
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,5000)");
        System.out.println("Scrolled Down");
        
        JavascriptExecutor js1=(JavascriptExecutor)driver;
        js1.executeScript("window.scrollBy(0,-3000)");
        System.out.println("Scrolled Up");
        
        
        
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
   	 
   	 //RADIO BUTTON
   	 WebElement radio=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/label/span[1] "));
   	 radio.click();
   	 radio.isSelected();
   	 
    //ADDRESS
   	WebElement address= driver.findElement(By.id("<input type=\"text\" placeholder=\"Enter Area / Locality\" class=\"\" value=\"\">"));
    address.sendKeys("Panvel,navi mumbai 410206");
   	 
  	//LOCATION 
    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[1]/div/div[3]/div/div[1]/div[2]/div[1]/div[2]/button/span")).click(); 
   	 
    //SELECTION FROM LIST
    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[1]/div/div[3]/div/div[1]/div[3]/div/div[2]/div[2]/button/span")).click();
  
    
        
        
        //WebElement view= driver.findElement(By.id"<h2 style=\"font-size: 15px;\">PIZZA MANIA VEG</h2>"));
        //view.click();
        
       // WebElement nonveg= driver.findElement(By.id("<h2 style=\"font-size: 15px;\">PIZZA MANIA NON VEG</h2>"));
       // nonveg.click();
	} 

}
