package pages.pagesXYZBank;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;

public class BankManagerOpenAccountPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public BankManagerOpenAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[contains(@ng-class,'btnClass2')]")
    WebElement openAccountButton;

    @FindBy(id = "userSelect")
    WebElement selectCustomerName;

    @FindBy(id = "currency")
    WebElement selectCurrency;

    @FindBy(css = "button[type='submit']")
    WebElement processButton;

    public void openAccount(){
        openAccountButton.click();
        LOG.info("Successfully navigate to Open Account Page");
    }

    public void openCustomerAccount(){
        openAccountButton.click();
        Select select= new Select(selectCustomerName);
        select.selectByVisibleText("gurpreet Kaur");

        Select select1 = new Select(selectCurrency);
        select1.selectByVisibleText("Dollar");

        processButton.click();

    }

    public void verifyOpenAccount(){
        //clickOn(processButton);
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

        LOG.info("successfully create account");

    }

}
