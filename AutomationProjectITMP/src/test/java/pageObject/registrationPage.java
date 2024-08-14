package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registrationPage
{

public WebDriver driver;


    public registrationPage (WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver,this );
}
  @FindBy(xpath = "//input[@id=\'name\']")
    private WebElement nameField;

    @FindBy(xpath = "//*[@id=\"inputEmail4\"]")
    private  WebElement emailField;

    @FindBy(xpath = "//input[@id='inputPassword4']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='company']")
    private WebElement companyNameField;

    @FindBy(xpath = "//input[@id='websitename']")
    private WebElement websiteField;

    @FindBy(xpath = "//select[@name='country']")
    private WebElement countryDropdownlist;

    @FindBy(xpath = "//input[@id='inputCity']")
    private WebElement cityField;

    @FindBy(xpath = "//input[@id='inputAddress1']")
    private WebElement fistLineOfAddressField;

    @FindBy(xpath = "//input[@id='inputAddress2']")
    private WebElement secondLineOfAddressField;

    @FindBy(xpath = "//input[@id='inputState']")
    private WebElement stateField;

    @FindBy(xpath = "//input[@id='inputZip']")
    private WebElement zipcodeField;

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//p[@class='success-msg hidden']")
    private WebElement expectedMsg;

    public void enterFullName(){
       nameField.sendKeys("Kola O");
   }
  public void enterEmailAddress() {
      emailField.sendKeys("kolawole.olasanmi@gmail.com");
  }

  public void enterPassword(){
   passwordField.sendKeys("Omoluwabi1");
   }
   public void enterCompanyName(){
    companyNameField.sendKeys("RCSLTD");
   }

   public  void enterWebsite(){
    websiteField.sendKeys("www.rcs.co.uk");
   }

   public void selectCountry(){
   new Select(countryDropdownlist).selectByValue("GB");
}

   public void enterCity(){cityField.sendKeys("Bolton");}
   public void enterAddress1(){ fistLineOfAddressField.sendKeys("21 Berkeley Road");}

   public void enterAddress2(){ secondLineOfAddressField.sendKeys("64 Deansgate");}

   public  void  enterState() { stateField.sendKeys("Manchester");}

   public  void  enterZipcode(){ zipcodeField.sendKeys("BL1 6PS");}

   public  void  clickSubmitButton(){ submitButton.click();}

   public String verifyFormSubmission(){
     return expectedMsg.getText();
   }

   public void enterFullName(String name){
        nameField.sendKeys(name);
   }
   public void enterEmailAddress(String email){
        emailField.sendKeys(email);
   }
   public void enterPassword(String password){
        passwordField.sendKeys(password);
   }
   public void enterWebsiteUrl(String url){
        websiteField.sendKeys(url);
   }
   public void enterCity(String city){
        cityField.sendKeys(city);
   }
   public void enterZipcode(String zipcode){
        zipcodeField.sendKeys(zipcode);

   }
public void omitName(){
        nameField.sendKeys("");
}
}
