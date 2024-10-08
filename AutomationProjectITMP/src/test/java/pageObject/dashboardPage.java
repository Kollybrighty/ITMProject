package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class dashboardPage {
    public WebDriver driver;


    public dashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement landingpageUsernameField;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement landingpagePasswordField;

    @FindBy(xpath = "//button[contains(text(), 'Submit')]")
    public WebElement submitButton;

    @FindBy(xpath = "//h2[contains(text(),'Are you a Student, Teacher, Professional, Property')]")
    private WebElement homepageWording;

    @FindBy(xpath = "//app-home//div//header[@class='landing-nav-header']//button[@type='submit'][normalize-space()='Login']")
    private WebElement homepageLoginBtn;

    @FindBy(xpath = "//input[@id='emailAddress']")
    private WebElement loginEmailAddressField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement loginPasswordField;

  @FindBy(xpath = "//select[@class='form-select form-select-lg mb-3 ng-untouched ng-pristine ng-invalid']")

    private WebElement acctTypeDropdown;


    @FindBy(xpath = "//input[@value='Login']")
    private WebElement LoginBtn;

    @FindBy(xpath = "//li[normalize-space()='Connections']")
    private WebElement connectionsTab;

    @FindBy(xpath = "//p[@class='lead']")
    private WebElement secondHomepageWording;

    @FindBy(xpath = "//div[contains(text(),'Invalid username or password')]")
    public WebElement warningMsgPrompt;
    @FindBy(xpath = "//div[contains(text(),'User does not exist')]")
    public WebElement loginPageWarningMsg;

    public void landingPageLoginDetails(String username, String password) {
        landingpageUsernameField.sendKeys(username);
        landingpagePasswordField.sendKeys(password);
        submitButton.click();
    }

    public void verifyHomepageWording() {
        Assert.assertTrue(homepageWording.isDisplayed(), "Wording is not displayed");
    }

    public void homePageIsDisplayed(){
        Assert.assertTrue(secondHomepageWording.isDisplayed());
    }
    public void clickLoginBtn() {
        homepageLoginBtn.click();
    }

    public void loginPageDetails(String acctType, String email, String password) {
        new Select(acctTypeDropdown).selectByVisibleText(acctType);
        loginEmailAddressField.sendKeys(email);
        loginPasswordField.sendKeys(password);
        LoginBtn.click();

    }

    public void verifyConnectionsTab(){
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //   Assert.assertTrue(connectionsTab.isDisplayed(),"Connections tab is not visible on dashboard page");
        WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(5));
       WebElement connectionTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='Connections']")));
       Assert.assertTrue(connectionTab.isDisplayed(),"Connections tab is not visible on dashboard page");

    }
}



