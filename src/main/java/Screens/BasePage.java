package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        find(locator).click();
    }

    public void send(By locator, String text) {
        find(locator).sendKeys(text);
    }

    public void scrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.cssSelector("button[name='Submit']")));
        js.executeScript("window.scrollBy(0,400)");
    }

}
