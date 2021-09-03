package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApprovalProcesesPage extends BasePage{

    By proceedLocatorr= By.cssSelector(".button.btn.btn-default.standard-checkout.button-medium");
    By proceedAdress = By.cssSelector("button[name='processAddress']");
    By checkBtnLocator = By.id("uniform-cgv");
    By proceedCarier= By.cssSelector("button[name='processCarrier']");
    By bankLocator = By.xpath("//a[@title='Pay by bank wire']");
    By myOrderLocator = By.cssSelector("button[class='button btn btn-default button-medium']");

    public ApprovalProcesesPage(WebDriver driver) {
        super(driver);
    }

    public void getProceed(){

        click(proceedLocatorr);
        click(proceedAdress);
        click(checkBtnLocator);
        click(proceedCarier);
        click(bankLocator);
        click(myOrderLocator);
    }
}
