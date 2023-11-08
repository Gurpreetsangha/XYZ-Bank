package pages.pagesXYZBank;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;

public class CustomerLoginPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public void CustomerLogin(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Customer Login']")
    WebElement CustomerLoginButton;

    @FindBy(id = "userSelect")
    WebElement selectName;

    @FindBy(css = "button[type='submit']")
    WebElement loginButton;

    public void customerLogin(){
        CustomerLoginButton.click();
        LOG.info("Successfully click on Customer Login Button");
    }

    public void selectYourName(){
        Select select=new Select(selectName);
        select.selectByVisibleText("gurpreet Kaur");
        clickOn(loginButton);

    }


}

