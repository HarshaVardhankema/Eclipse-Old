package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class DoctorLoginSteps {

    WebDriver driver;

    //@Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^user already in the login page$")
    public void user_already_in_the_login_page() throws InterruptedException {
        driver.get("https://midoc-provider-dev.azurewebsites.net/login");
        Thread.sleep(10000);  // You might want to replace this with an explicit wait
    }

    

    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String username, String password) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/div/div[2]/div/input")).sendKeys(username);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/input")).sendKeys(password);
        Thread.sleep(3000);
    }

    @Then("^user clicks on the login button$")
    public void user_clicks_on_the_login_button() throws InterruptedException {
        driver.findElement(By.xpath("//html/body/div[1]/div/div/div[1]/div[2]/div[1]/div/button[2]")).click();
        Thread.sleep(3000);
        }

    @Then("^the user is on the home page$")
    public void the_user_is_on_the_home_page() {
        String expectedUrl = "https://midoc-provider-dev.azurewebsites.net/login";
        String actualUrl = driver.getCurrentUrl();
        if (!actualUrl.equals(expectedUrl)) {
            System.out.println("URL mismatch! Expected: " + expectedUrl + ", but found: " + actualUrl);
        }
    }

   // @After
   // public void tearDown() {
     //   driver.quit();  // Ensures that the browser instance is closed after each test
  //  }
}
