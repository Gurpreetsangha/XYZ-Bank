package pages.pagesXYZBank;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.HomePage;

public class CustomersDataPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public CustomersDataPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    @FindBy(partialLinkText = "sortType = 'fName'; sortReverse = !sortReverse")
    WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement searchCustomer;

    @FindBy(css = "ng-binding")
    WebElement customerName;

    @FindBy(css = "button[ng-click='deleteCust(cust)']")
    WebElement deleteCustomer;


    public void sortByFirstName(){
        firstName.click();
        LOG.info("First Name sort reverse order successfully");
    }

    public void searchCustomer(){
        type(searchCustomer,"gurpreet");
        customerName.getText();
        String ExpectedCustomerName="gurpreet";
        Assert.assertEquals(customerName,ExpectedCustomerName);
        LOG.info("successfully select the customer name");

    }

    public void deleteCustomerAccount(){
        type(searchCustomer,"Albus");
        clickOn(deleteCustomer);
        LOG.info("customer deleted successfully");
    }

}
