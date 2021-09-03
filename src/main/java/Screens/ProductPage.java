package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ProductPage extends BasePage {

    WebElement tapProductLocator = driver.findElement(By.cssSelector("img[title='Faded Short Sleeve T-shirts']"));
    By moreLocator = By.xpath("//span[normalize-space()='More']");


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addProduct() {
        Actions ac = new Actions(driver);
        ac.moveToElement(tapProductLocator).build().perform();
        click(moreLocator);
    }
}
