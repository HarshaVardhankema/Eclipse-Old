package javaclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class midocnewflow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.firefoxdriver().setup();  // This downloads and sets GeckoDriver path
	        WebDriver driver = new FirefoxDriver();   
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/login");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/input")).sendKeys("chivas@gmail.com");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/button[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[4]/div/div/input")).sendKeys("midoc123");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/button[2]")).click();
	   Thread.sleep(3000);
	  driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/myhealth");
	   Thread.sleep(3000);
	   driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/vitals");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/button/div[1]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div/div/button")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[3]/div/button[76]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
	   Thread.sleep(3000);
	   
	    
	    
	}

}
