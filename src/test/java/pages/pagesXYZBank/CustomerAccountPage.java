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

public class CustomerAccountPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public CustomerAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    @FindBy(css = "span[class='fontBig ng-binding']")
    WebElement displayCustomerName;

    public void customerNameDisplay(){
        displayCustomerName.getText();
        String ExceptedDisplayCustomerName="gurpreet Kaur";
        Assert.assertEquals(displayCustomerName,ExceptedDisplayCustomerName);
        LOG.info("Successfully verify the customer name on account");
    }

    public void selectAccountNumber(){

    }
}
