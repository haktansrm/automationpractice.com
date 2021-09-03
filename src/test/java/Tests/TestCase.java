package Tests;

import Screens.*;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {

    @Test
    public void testSignIn() {
        SignInPage sp = new SignInPage(driver);
        sp.signIn();

        HomePage hp = new HomePage(driver);
        hp.catagorySelect();

        ProductPage pp = new ProductPage(driver);
        pp.addProduct();

        BasePage basePage = new BasePage(driver);
        basePage.scrollPage();

        ProductDetailPage pdp = new ProductDetailPage(driver);
        pdp.plusLoc();
        pdp.selectIndex();
        pdp.thereIsMore();

        ValidateSummaryPage vsp = new ValidateSummaryPage(driver);
        vsp.totalBalance();

        ApprovalProcesesPage app = new ApprovalProcesesPage(driver);
        app.getProceed();


    }


}
