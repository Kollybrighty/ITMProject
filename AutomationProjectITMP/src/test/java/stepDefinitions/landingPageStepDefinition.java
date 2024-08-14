package stepDefinitions;

import CucumberManager.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObject.dashboardPage;


public class landingPageStepDefinition {

    public static WebDriver driver;
    public BasePage basePage;
    public dashboardPage dashboardPage;

    public landingPageStepDefinition(){
        driver = new ChromeDriver();
        basePage = new BasePage(driver);
        dashboardPage =new dashboardPage(driver);

    }


    @Given("I navigate to the collabtool url")
    public void iNavigateToTheCollabtoolUrl() {
        basePage.goToCollabToolsUrl();
    }

    @And("I enter a username {string}")
    public void iEnterAUsername(String username) {
        dashboardPage.landingpageUsernameField.sendKeys(username);
    }

    @And("I enter a valid password {string}")
    public void iEnterAValidPassword(String password) {
        dashboardPage.landingpagePasswordField.sendKeys(password);
    }

    @And("I click on the submit button")
    public void iClickOnTheSubmitButton() {
        dashboardPage.submitButton.click();
    }

    @Then("a warning message is displayed {string}")
    public void aWarningMessageIsDisplayed(String  warningMsg) {
        Assert.assertEquals(warningMsg, dashboardPage.warningMsgPrompt.getText());
    }
}
