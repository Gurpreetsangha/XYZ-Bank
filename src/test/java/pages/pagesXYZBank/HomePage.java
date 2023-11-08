package pages.pagesXYZBank;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends CommonAPI {
    Logger LOG = LogManager.getLogger(pages.HomePage.class.getName());

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".mainHeading")
    WebElement CurrentHeader;

    @FindBy(xpath = "//button[text()='Customer Login']")
    WebElement CustomerLoginButton;

    @FindBy(xpath = "//button[text()='Bank Manager Login']")
    WebElement ManagerLoginButton;

    public String getHeaderText(){
        String headerText = getElementText(CurrentHeader);
        LOG.info("header text: "+headerText);
        return headerText;
    }


    public void validateHeader(){

        // validate Header
       // String CurrentHeader = driver.findElement(By.xpath("//strong[@class='mainHeading']")).getText();
        CurrentHeader.getText();
        String ExpectedHeader = "XYZ Bank";
        Assert.assertEquals(ExpectedHeader,CurrentHeader);
        LOG.info("Validate : "+ ExpectedHeader);



    }

      public void customerLogin(){
        CustomerLoginButton.click();
        LOG.info("Successfully click on Customer Login Button");
      }

    public void managerLogin(){
        ManagerLoginButton.click();
        LOG.info("successfully click on bank Manager Login button");

    }



}
