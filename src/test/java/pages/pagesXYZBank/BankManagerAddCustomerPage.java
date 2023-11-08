package pages.pagesXYZBank;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.HomePage;

public class BankManagerAddCustomerPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public BankManagerAddCustomerPage(WebDriver driver){
        PageFactory.initElements(driver, this);



    }
    @FindBy(xpath = "//*[contains(@ng-class,'btnClass1')]")
    WebElement AddCustomerButton;

    @FindBy(xpath = "//input[@ng-model='fName']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@ng-model='lName']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@ng-model='postCd']")
    WebElement postCodeField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerSubmit;

   @FindBy(xpath = "//*[contains(@ng-class,'btnClass3')]")
    WebElement customersButton;

   @FindBy(xpath = "//input[@placeholder='Search Customer']")
   WebElement searchCustomer;

   @FindBy(css = "ng-binding")
   WebElement customerName;

    //reusable steps

//        public void addCustomer() {
//        AddCustomerButton.click();
//        LOG.info("Successfully click on Add customer Button");
//    }

    public void addNewCustomerFirstName(){
            firstNameField.sendKeys("Gurpreet");
            LOG.info("customer first name add successfully ");

    }

    public void addNewCustomerLastName(){
            lastNameField.sendKeys("Kaur");
            LOG.info("customer last name add successfully");
    }

    public void addNewCustomerPostCode(){
            postCodeField.sendKeys("11436");
            LOG.info("post code add successfully");
    }

    public void addNewCustomerInfoSubmit(){
            clickOn(addCustomerSubmit);
            //switching to alert
        Alert alert=driver.switchTo().alert();
        //capturing alert message
        String alertMessage=driver.switchTo().alert().getText();
        //display alert message
        LOG.info(alertMessage);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Accepting alert
        alert.accept();

        LOG.info("new customer add successfully");
    }

    public void verifyAddCustomer(){
        customersButton.click();
        type(searchCustomer,"gurpreet");
        customerName.getText();
        String ExpectedCustomerName="gurpreet";
        Assert.assertEquals(customerName,ExpectedCustomerName);
        LOG.info("successfully verify the customer");

    }

}
