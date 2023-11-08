package Test;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.pagesXYZBank.BankManagerOpenAccountPage;

public class BankManagerOpenAccountPageTest extends CommonAPI {

    BankManagerOpenAccountPage bankManagerOpenAccountPage=new BankManagerOpenAccountPage(driver);

    @Test
    public void verifyOpenAccount(){
        bankManagerOpenAccountPage.openCustomerAccount();
    }
    @Test
    public void validateOpenAccount(){
        bankManagerOpenAccountPage.verifyOpenAccount();
    }
}
