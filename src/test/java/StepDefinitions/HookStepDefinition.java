package StepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HookStepDefinition {

    // private WebDriver driver; // Declare WebDriver as a class-level variable

    @Before
    public void setUp() throws InterruptedException {
        // Do not initialize the WebDriver or open the browser here
        System.out.println("Do not launch any browser or perform any WebDriver actions.");
        // Commented out the driver initialization code
        // System.setProperty("webdriver.edge.driver", "path/to/edgedriver.exe");
        // driver = new EdgeDriver(); 
        // driver.manage().window().maximize();
        // driver.get("https://midoc-patientapp-dev.azurewebsites.net/login");
    }

    @After
    public void tearDown() {
        // Make sure no WebDriver cleanup is performed if we are not opening any browser
        System.out.println("No browser to close.");
    }

    @Before("@First")
    public void beforeFirst() {
        System.out.println("Before the first scenario");
    }

    @After("@First")
    public void afterFirst() {
        System.out.println("After the first scenario");
    }

    @Before("@Second")
    public void beforeSecond() {
        System.out.println("Before the second scenario");
    }

    @After("@Second")
    public void afterSecond() {
        System.out.println("After the second scenario");
    }

    @Given("^Enter the register email$")
    public void enterTheRegisterEmail() {
        System.out.println("Enter the register email");
    }

    @Then("^Click on the continue$")
    public void clickOnTheContinue() {
        System.out.println("Click on the continue");
    }

    @And("^Enter the Existing password$")
    public void enterTheExistingPassword() {
        System.out.println("Enter the Existing password");
    }

    @Then("^Click on the Password continue button$")
    public void clickOnThePasswordContinueButton() {
        System.out.println("Click on the Password continue button");
    }

    @Given("^Enter the newly email$")
    public void enterTheNewlyEmail() {
        System.out.println("Enter the newly email");
    }

    @Then("^Click on the buttonss$")
    public void clickOnTheButtonss() {
        System.out.println("Click on the buttonss");
    }

    @Then("^Complete the process$")
    public void completeTheProcess() {
        System.out.println("Complete the process");
    }
}
