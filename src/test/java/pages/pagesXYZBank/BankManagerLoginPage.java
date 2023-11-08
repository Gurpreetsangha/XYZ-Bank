package pages.pagesXYZBank;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

public class BankManagerLoginPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public BankManagerLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//*[contains(@ng-class,'btnClass1')]")
    WebElement AddCustomerButton;

    @FindBy(xpath = "//*[contains(@ng-class,'btnClass2')]")
    WebElement openAccountButton;

    @FindBy(xpath = "//*[contains(@ng-class,'btnClass3')]")
    WebElement customersButton;

    @FindBy(xpath = "//button[@class='btn home']")
    WebElement homeButton;


    public void addCustomer() {
      AddCustomerButton.click();
        LOG.info("Successfully navigate to Add Customer Page");
   }

   public void openAccount(){
        openAccountButton.click();
        LOG.info("Successfully navigate to Open Account Page");
   }

   public void customerSearch(){
        customersButton.click();
        LOG.info("Successfully navigate to Customers Search Page");
   }

   public void homePage(){
        homeButton.click();
        LOG.info("Successfully navigate to XYZBank Home Page");
   }

}
