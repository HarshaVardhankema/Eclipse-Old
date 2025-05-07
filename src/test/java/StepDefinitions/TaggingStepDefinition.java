	package StepDefinitions;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.AfterMethod;
	
	import io.cucumber.java.Before;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	
	public class TaggingStepDefinition {
	
	    WebDriver driver;
	
	    @Before
	    public void setUp() throws InterruptedException {
	        // Set the path to the EdgeDriver executable
	        System.setProperty("webdriver.edge.driver", "C:\\Users\\hneth\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	        
	        // Initialize EdgeDriver
	        driver = new EdgeDriver();
	        
	        // Maximize browser window
	        driver.manage().window().maximize();
	        
	        // Open the specified URL
	        driver.get("https://midoc-patientapp-dev.azurewebsites.net/login");
	        
	        // Wait for the page to load (not recommended for production code; better use explicit waits)
	        Thread.sleep(3000);
	    }

	
    

  //  @Given("^User on the Login page for Vitals in MiDoc Patient Web Apps$")
 // public void User_is_the_Login_page_of_midoc_Patient_Web_Apps() throws InterruptedException {
 //       driver.get("https://midoc-patientapp-dev.azurewebsites.net/login");
  //      Thread.sleep(3000);
 //   }

    @Then("^user entering the email$")
    public void user_entering_the_email() throws InterruptedException {
       
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/div[2]/div/input")).sendKeys("viggu@gmail.com");
        Thread.sleep(3000);
  }

    @Then("^Click on Continue buttonn$")
    public void Click_on_Continue_buttonn() throws InterruptedException {
        driver.findElement(By.xpath(" /html/body/div[1]/div/div/div/div[1]/div[2]/div/div/button[1]")).click();
       Thread.sleep(3000);
    }

   @Then("^user should enter password:$")
    public void user_should_enter_password() throws InterruptedException {
        
       driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/div[4]/div/div/input")).sendKeys("midoc123");
       Thread.sleep(3000);
   }

    @Then("^Click on Continue to the home page after Login$")
   public void Click_on_Continue_to_home_page_after_Login() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/button[2]")).click();
        Thread.sleep(3000);
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
   



   /* @Then("^user navigates to My Health Page$")
    public void user_navigate_to_My_Health_Page() throws InterruptedException {
        driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/myhealth");
        Thread.sleep(3000);
    }

    @Then("^user navigates to Vitals$")
    public void user_navigates_to_vitals() throws InterruptedException {
        driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/vitals");
        Thread.sleep(3000);
    }

    @And("the user add weight data")
    public void the_user_adds_weight_data() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/button/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[3]/div/button[93]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
        Thread.sleep(3000);
    }

    @And("the user add height data")
    public void the_user_adds_height_data() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/button/div[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[3]/div/button[5]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[4]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[5]/div/button[8]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
        Thread.sleep(5000);
    }

    @And("the user add respiratory data")
    public void the_user_adds_respiratory_data() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/button/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[5]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
        Thread.sleep(5000);
    }

    @And("the user add body temperature data")
    public void the_user_adds_body_temperature_data() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/button/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[91]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
        Thread.sleep(5000);
    }

    @And("the user add oxygen level data")
    public void the_user_adds_oxygen_level_data() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[3]/div[3]/button/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[5]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
        Thread.sleep(5000);
    }
    @And("the user add blood pressure data")
    public void the_user_adds_blood_pressure_data() throws InterruptedException {
        // Add blood pressure  
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div[3]/button/div[1]")).click();
        Thread.sleep(3000);
        
        // Systolic enter value
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
        
        // Systolic dropdown 
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[76]")).click();
        Thread.sleep(3000);
        
        // Diastolic enter value
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[3]/div[2]/div/input")).click();
        Thread.sleep(3000);
        
        // Diastolic dropdown
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[3]/div[3]/div/button[111]")).click();
        Thread.sleep(3000);
        
        // Add blood pressure 
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
        Thread.sleep(5000);
        
        // AI button
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
        
        // Skip button 
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
        Thread.sleep(5000);
    }

    @And("the user add heart pressure data")
    public void the_user_adds_heart_pressure_data() throws InterruptedException {
        // Add heart pressure
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div/div[3]/button/div[1]")).click();
        Thread.sleep(3000);
        
        // Enter value
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
        
        // Dropdown for heart pressure value
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[50]")).click();
        Thread.sleep(3000);
        
        // Add button for heart pressure data
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
        Thread.sleep(5000);
        
        // AI button
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
        
        // Skip button 
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
        Thread.sleep(5000);
   */
    

    


