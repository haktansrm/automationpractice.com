package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    WebElement tapWomenLocator = driver.findElement(By.cssSelector("a[title='Women']"));
    By tshirtBtnLocator = By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[@title='T-shirts'][normalize-space()='T-shirts']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void catagorySelect() {
        Actions a = new Actions(driver);
        a.moveToElement(tapWomenLocator).build().perform();
        click(tshirtBtnLocator);
    }


}
