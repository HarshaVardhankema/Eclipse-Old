package StepDefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.Before;


public class PatientStepDefinition {

	WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    
        @Given("^User is the Login page of midoc Patient Web App$")
    public void User_is_the_Login_page_of_midoc_Patient_Web_App() {
        driver.get("https://midoc-patientapp-dev.azurewebsites.net/login");
    }

    @Then("^user enters the Email \"([^\"]*)\"$")
    public void user_enters_the_Email(String username) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"field-:r0:\"]")).sendKeys(username);
        Thread.sleep(3000);
    }

    @Then("^User clicks on Continue Button$")
    public void User_clicks_on_Continue_Button() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div/div/button[1]")).click();
        Thread.sleep(3000);
    }

    @Then("^Enter the First and Last Name$")
    public void Enter_the_First_and_Last_Name() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[1]/div[1]/input")).sendKeys("Nike");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[1]/div[2]/input")).sendKeys("Jordan");
        Thread.sleep(3000);
    }

    @Then("^Select Gender$")
    public void Select_Gender() throws InterruptedException {
        driver.findElement(By.id("gender")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/button[2]")).click();
        Thread.sleep(3000);
    }

    @Then("^Enter the Weight and Height$")
    public void Enter_the_Weight_and_Height() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[4]/div[2]/div/input")).sendKeys("124");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[5]/div[2]/div[1]/div/input")).sendKeys("5");
        Thread.sleep(3000);
    }

    @Then("^Enter the Date of Birth$")
    public void Enter_the_Date_of_Birth() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[6]/div/div/input")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[6]/div/div[2]/div/div/div/div/div[1]/div[3]/select")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[6]/div/div[2]/div/div/div/div/div[1]/div[3]/select/option[100]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[6]/div/div[2]/div/div/div/div/div[1]/div[2]/select")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[6]/div/div[2]/div/div/div/div/div[1]/div[2]/select/option[8]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[6]/div/div[2]/div/div/div/table/tbody/tr[3]/td[7]/button")).click();
        Thread.sleep(3000);
    }

    @And("^Enter the \"([^\\\"]*)\"$")
    public void Enter_the_Mobile_Number(String MobileNo) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div/div/div/div[7]/div/div/div[1]/button")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[2]/div/div[18]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys(MobileNo);
        Thread.sleep(3000);
    }

    @Then("^Click on Continue button$")
    public void Click_on_Continue_button() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
        Thread.sleep(3000);
	}
    
    
    @Then("^Enters the OTP$")
    public void Enters_the_OTP() throws InterruptedException {
    	driver.findElement(By.id("pin1-0")).sendKeys("1");
    	Thread.sleep(2000);
    	driver.findElement(By.id("pin1-1")).sendKeys("2");
    	Thread.sleep(2000);
    	driver.findElement(By.id("pin1-2")).sendKeys("3");
    	Thread.sleep(2000);
    	driver.findElement(By.id("pin1-3")).sendKeys("4");
    	Thread.sleep(3000);
    	
    }
@Then("^Click on Continue Button$")
public void Click_on_Continue_Button() throws InterruptedException {
	driver.findElement(By.cssSelector("button.chakra-button.css-12kaf87")).click();
    Thread.sleep(3000);
}

@Then("^Click on Skip button$")
public void Click_on_Skip_button() throws InterruptedException {
	driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No'])[1]/following::button[1]")).click();
    Thread.sleep(3000);
}

@Then("^Enter Password and Confirm password$")
public void Enter_Password_and_Confirm_password() throws InterruptedException {
	// Password
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("midoc123");
    Thread.sleep(3000);

    // Confirm password
    driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("midoc123");
    Thread.sleep(3000);
}
@Then("^Click on Continue button of Password$")
public void Click_on_Continue_button_of_Password() throws InterruptedException {
	// Continue button
    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/div/div/div/div/div[3]/button")).click();
    Thread.sleep(3000);
	
}
@Then("^Click on Sucess continue button$")
public void Click_on_Sucess_continue_button() throws InterruptedException {
	// Success page
    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[3]/button")).click();
    Thread.sleep(10000);
}
	}

