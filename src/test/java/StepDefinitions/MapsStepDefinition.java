package StepDefinitions;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MapsStepDefinition {

    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("User is on the Login page of MiDoc Patient Web App")
    public void user_is_on_the_Login_page_of_midoc_Patient_Web_App() {
        driver.get("https://midoc-patientapp-dev.azurewebsites.net/login");
    }

    @Then("user enters the Email")
    public void user_enters_the_Email(DataTable credentials) throws InterruptedException {
        for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
            driver.findElement(By.id("field-:r0:")).sendKeys(data.get("username"));
            Thread.sleep(3000);
        }
    }

    @Then("Click on Continue on Email")
    public void click_on_Continue_on_Email() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[1]/div[2]/div/div/button[1]")).click();
        Thread.sleep(3000);
    }

    @Then("user enters the password")
    public void user_enters_the_password(DataTable credentials) throws InterruptedException {
        for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/div[4]/div/div/input"))
                    .sendKeys(data.get("password"));
            Thread.sleep(3000);
        }
    }

    @Then("Click on Continue to the home page")
    public void click_on_Continue_to_home_page() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/button[2]")).click();
        Thread.sleep(3000);
    }
}
