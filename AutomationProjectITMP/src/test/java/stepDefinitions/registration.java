package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageObject.registrationPage;

public class registration {

    public static WebDriver driver;

    public registrationPage registrationPage;

    public registration() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        registrationPage = new registrationPage(driver);

    }

    @Given("I navigate to the form demo website")
    public void iNavigateToTheFormDemoWebsite() {
        driver.get(
                "https://www.lambdatest.com/selenium-playground/input-form-demo"
        );
        driver.manage().window().maximize();
    }

    @When("I enter my name")
    public void iEnterMyName() {
        //driver.findElement(By.xpath("//input[@id=\'name\']")).sendKeys("Kola O");
        registrationPage.enterFullName();
    }

    @And("I enter a valid email address")
    public void iEnterAValidEmailAddress() {
        //driver.findElement(By.xpath("//*[@id=\"inputEmail4\"]")).sendKeys("kolawole.olasanmi@gmail.com");
        registrationPage.enterEmailAddress();
    }

    @And("I enter a valid password")
    public void iEnterAValidPassword() {
        //driver.findElement(By.xpath("//input[@id='inputPassword4']")).sendKeys("Omoluwabi1");
        registrationPage.enterPassword();
    }

    @And("I enter my company name")
    public void iEnterMyCompanyName() {
        //driver.findElement(By.xpath("//input[@id='company']")).sendKeys("RCSLTD");
        registrationPage.enterCompanyName();
    }

    @And("I enter my website URL")
    public void iEnterMyWebsiteURL() {
        //driver.findElement(By.xpath("//input[@id='websitename']")).sendKeys("www.rcs.co.uk");
        registrationPage.enterWebsite();
    }

    @And("I select country from the dropdown list")
    public void iSelectCountryFromTheDropdownList() {
        //new Select(driver.findElement(By.xpath("//select[@name='country']"))).selectByValue("GB");
        registrationPage.selectCountry();
    }

    @And("I enter my city")
    public void iEnterMyCity() {
        //driver.findElement(By.xpath("//input[@id='inputCity']")).sendKeys("Bolton");
        registrationPage.enterCity();
    }

    @And("I enter my address")
    public void iEnterMyAddress() {
        //driver.findElement(By.xpath("//input[@id='inputAddress1']")).sendKeys("21 Berkeley Road");
        registrationPage.enterAddress1();
    }

    @And("I enter my second line of address")
    public void iEnterMySecondLineOfAddress() {
        //driver.findElement(By.xpath("//input[@id='inputAddress2']")).sendKeys("64 Deansgate");
        registrationPage.enterAddress2();
    }

    @And("I enter my state")
    public void iEnterMyState() {
        //driver.findElement(By.xpath("//input[@id='inputState']")).sendKeys("Manchester");
       registrationPage.enterState();
    }

    @And("I enter my zip code")
    public void iEnterMyZipCode() {
        //driver.findElement(By.xpath("//input[@id='inputZip']")).sendKeys("BL1 6PS");
        registrationPage.enterZipcode();
    }

    @And("I click the submit button")
    public void iClickTheSubmitButton() {
        //driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
      registrationPage.clickSubmitButton();
    }

    @Then("the form is submitted successfully")
    public void theFormIsSubmittedSuccessfully() {
   //     Assert.assertTrue(driver.findElement(By.xpath("//p[@class='success-msg hidden']")).isDisplayed());

        String actualMsg = "Thanks for contacting us, we will get back to you shortly.";
        //String expectedMsg = driver.findElement(By.xpath("//p[@class='success-msg hidden']")).getText();
   Assert.assertEquals(actualMsg, registrationPage.verifyFormSubmission());

        driver.quit();
    }

    @When("I enter my name {string}")
    public void iEnterMyName(String name) {
        registrationPage.enterFullName(name);
    }

    @And("I enter a valid email address {string}")
    public void iEnterAValidEmailAddress(String email) {
        registrationPage.enterEmailAddress(email);
    }

    @And("I enter a valid password  {string}")
    public void iEnterAValidPassword(String password) {
        registrationPage.enterPassword(password);
    }

    @And("I enter my website URL {string}")
    public void iEnterMyWebsiteURL(String url) {
        registrationPage.enterWebsiteUrl(url);
    }

    @And("I enter my city {string}")
    public void iEnterMyCity(String city) {
        registrationPage.enterCity(city);
    }

    @And("I enter my zip code {string}")
    public void iEnterMyZipCode(String zipCode) {
        registrationPage.enterZipcode(zipCode);
    }

    @When("I omit my name")
    public void iOmitMyName() {
    registrationPage.omitName();
    }

    @Then("an error message is displayed")
    public void anErrorMessageIsDisplayed() {
    }
}
