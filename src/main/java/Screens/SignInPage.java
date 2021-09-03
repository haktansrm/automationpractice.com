package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
    WebDriver driver;

    By signInBtnLocator = By.cssSelector("a[title='Log in to your customer account']");
    By emailLocator = By.id("email");
    By passLocator = By.id("passwd");
    By signinButton = By.id("SubmitLogin");


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void signIn() {
        click(signInBtnLocator);
        send(emailLocator, "pgtjjohbcd@13dktempmail.tech");
        send(passLocator, "Avis3101");
        click(signinButton);
    }
}
