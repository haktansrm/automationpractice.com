package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ValidateSummaryPage extends BasePage {
    WebElement totalPrice = driver.findElement(By.id("total_price"));
    String totalProducts = driver.findElement(By.id("total_product")).getText().replace("$", "");
    String totalShipping = driver.findElement(By.id("total_shipping")).getText().replace("$", "");


    public ValidateSummaryPage(WebDriver driver) {
        super(driver);
    }

    /*public String getPrice(){
        String price = totalPrice.getText().replace("$", "");
        return price;
    }*/

    public ValidateSummaryPage totalBalance() {
        double endDoubleTotalProduct = Double.parseDouble(totalProducts);
        double endDoubleTotalShipping = Double.parseDouble(totalShipping);
        double value = 51.53;

        //String finalPrice = getPrice();
        Double endTotalPrice = endDoubleTotalProduct + endDoubleTotalShipping;
        Assert.assertEquals(endTotalPrice, value, 51.53);
        return this;

    }


}
