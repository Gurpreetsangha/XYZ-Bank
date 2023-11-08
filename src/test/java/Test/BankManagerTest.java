package Test;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.pagesXYZBank.BankManagerLoginPage;

public class BankManagerTest extends CommonAPI {
    BankManagerLoginPage bankManagerLoginPage=new BankManagerLoginPage(driver);


    @Test
    public void bankManagerAddCustomer(){
        bankManagerLoginPage.addCustomer();
    }
    @Test
    public void bankManagerOpenAccount(){
        bankManagerLoginPage.openAccount();
    }

}
