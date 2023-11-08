package Test;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.pagesXYZBank.HomePage;

public class XYZBanHomePagekTest extends CommonAPI {

@Test
     public void verifyHomePageTest(){
     HomePage homePage=new HomePage();
     homePage.getHeaderText();
     homePage.validateHeader();
     homePage.managerLogin();

}

}
