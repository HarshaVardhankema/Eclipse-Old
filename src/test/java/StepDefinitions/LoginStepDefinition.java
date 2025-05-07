package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

public class LoginStepDefinition {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // Login step definitions
    @Given("^the user is on the login page$")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        driver.get("https://midoc-provider-dev.azurewebsites.net/login");
        Thread.sleep(3000);  // Wait for the page to load
    }

    @When("^the user enters valid credentials$")
    public void the_user_enters_valid_credentials() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/div/div[2]/div/input")).sendKeys("Arron@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/input")).sendKeys("midoc123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/div/button[2]")).click();
        Thread.sleep(3000);
    }

    @Given("^the user is already logged in$")
    public void the_user_is_already_logged_in() throws InterruptedException {
        the_user_is_on_the_login_page();  // Reuse login steps
        the_user_enters_valid_credentials();
        Thread.sleep(3000); // Ensure login is complete
    }

    @Given("^the user navigates to the Patients module$")
    public void the_user_navigates_to_the_patients_module() throws InterruptedException {
        driver.navigate().to("https://midoc-provider-dev.azurewebsites.net/patients");
        Thread.sleep(3000);
    }

    @When("^the user searches for a patient by name$")
    public void the_user_searches_for_a_patient_by_name() throws InterruptedException {
    	 driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[1]/div[1]/input")).sendKeys("Viggu");
         Thread.sleep(6000);
    }

    @Then("^the user clicks on the Filter button to sort$")
    public void the_user_clicks_on_the_filter_button_to_sort() throws InterruptedException {
        WebElement filterBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[1]/div[4]/button[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", filterBtn); // Use the correct variable name
        Thread.sleep(3000); // Wait for the action to complete
    }

        
    

    @And("^the user clicks on the Three Dots option$")
   public void the_user_clicks_on_the_three_dots_option() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/table/tbody/tr/td[6]/button")).click();
   Thread.sleep(3000);
   
   driver.quit();
   
    }
    
}
