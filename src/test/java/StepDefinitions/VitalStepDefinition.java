package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VitalStepDefinition {

    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @Given("^User is on the Login page for Vitals in MiDoc Patient Web App$")
    public void User_is_the_Login_page_of_midoc_Patient_Web_App() {
        driver.get("https://midoc-patientapp-dev.azurewebsites.net/login");
    }
    
    @Then("^user enters the Email$")
    public void user_enters_the_Email(DataTable creditendals) throws InterruptedException {
        List<List<String>> data = creditendals.asLists();
        driver.findElement(By.xpath("//*[@id=\"field-:r0:\"]")).sendKeys(data.get(0).get(0));
        Thread.sleep(3000);
    }
    
    @Then("^Click on Continue$")
    public void Click_on_Continue() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div/div/button[1]")).click();
        Thread.sleep(3000);
    }
    
    @Then("^user enters the password$")
    public void user_enters_the_password(DataTable creditendals) throws InterruptedException {
        List<List<String>> data = creditendals.asLists();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/div[4]/div/div/input")).sendKeys(data.get(0).get(0));
        Thread.sleep(3000);
    }
    
    @Then("^Click on Continue to home page$")
    public void Click_on_Continue_to_home_page() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/button[2]")).click();
        Thread.sleep(3000);
    }
    
    @Then("^user navigate to My Health Page$")
    public void user_navigate_to_My_Health_Page() throws InterruptedException {
    	driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/myhealth");
    	Thread.sleep(3000);
    	
    }
    
    @Then("^user navigate to vitals$")
    public void user_navigate_to_vitals() throws InterruptedException {
    	driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/vitals");
    	Thread.sleep(3000);
    }
    
    @And("the user adds weight data")
    public void the_user_adds_weight_data() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/button/div[1]")).click();
        Thread.sleep(3000);
     // enter value feild
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[3]/div/button[93]")).click();
        Thread.sleep(3000);
     // add weight button
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
        Thread.sleep(5000);
        // ai button 
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
        // skip button
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
        Thread.sleep(3000);
    }

    @And("the user adds height data")
    public void the_user_adds_height_data() throws InterruptedException {
    	// addd height 
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/button/div[1]")).click();
        Thread.sleep(5000);
      //feets 
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
      //feets dropdown
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[3]/div/button[5]")).click();
        Thread.sleep(5000);
     // inches
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[4]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[5]/div/button[8]")).click();
        Thread.sleep(3000);
     // add button 
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
        Thread.sleep(5000);
     // ai height button
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
        //ai skip button 
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
        Thread.sleep(5000);
    }

    @And("the user adds respiratory data")
    public void the_user_adds_respiratory_data() throws InterruptedException {
    	// add respiratory
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/button/div[1]")).click();
        Thread.sleep(3000);
      //enter value
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
        // dropdown 
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[5]")).click();
        Thread.sleep(3000);
     // add respiratory
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
        Thread.sleep(5000);
      //ai button
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
        // skip button 
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
        Thread.sleep(5000);
    }

    @And("the user adds body temperature data")
    public void the_user_adds_body_temperature_data() throws InterruptedException {
    	// add body tempeature 
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/button/div[1]")).click();
        Thread.sleep(3000);
      //enter value
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
     // dropdown 
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[91]")).click();
        Thread.sleep(3000);
     // add Body tempeature 
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
        Thread.sleep(5000);
      //ai button
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
        // skip button 
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
        Thread.sleep(5000);
    }

    @And("the user adds oxygen level data")
    public void the_user_adds_oxygen_level_data() throws InterruptedException {
    	// add oxygen 
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div/div[3]/button/div[1]")).click();
        Thread.sleep(3000);
      //enter value
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
     // dropdown 
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[55]")).click();
        Thread.sleep(3000);
     // add oxygen button
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
        Thread.sleep(5000);
      //ai button
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
        // skip button 
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
        Thread.sleep(5000);
    }

    @And("the user adds blood pressure data")
    public void the_user_adds_blood_pressure_data() throws InterruptedException {
    	// add blood pressure  
    	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div[3]/button/div[1]")).click();
         Thread.sleep(3000);
         //sysco enter value
         driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
         Thread.sleep(3000);
         //  syscodropdown 
         driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[76]")).click();
         Thread.sleep(3000);
         //diastollic enter value
         driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[3]/div[2]/div/input")).click();
         Thread.sleep(3000);
         //diatollic dropdown
         driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[3]/div[3]/div/button[111]")).click();
         Thread.sleep(3000);
                 // add Blood pressure 
         driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
         Thread.sleep(5000);
         //ai button
         driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
         Thread.sleep(5000);
         // skip button 
         driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
         Thread.sleep(5000);
        
    }

    @And("the user adds heart pressure data")
    public void the_user_adds_heart_pressure_data() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div/div[3]/button/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[50]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
        Thread.sleep(5000);
      //ai button
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
        // skip button 
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
        Thread.sleep(5000);
    }
}

