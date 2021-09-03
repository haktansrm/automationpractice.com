package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailPage extends BasePage {
    By plusLocator = By.cssSelector(".btn.btn-default.button-plus.product_quantity_up");
    By ındexLocator = By.id("group_1");
    By colarBlueLocator = By.id("color_14");
    By addToCartLocator = By.cssSelector("#add_to_cart");
    By proceedLocator = By.cssSelector("a[title='Proceed to checkout']");


    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void plusLoc() {
        int i;
        for (i = 1; i < 3; ) {
            click(plusLocator);
            i++;
        }
    }

    public void selectIndex() {
        Select s = new Select(find(ındexLocator));
        s.selectByIndex(1);

    }

    public void thereIsMore() {
        click(colarBlueLocator);
        click(addToCartLocator);
        click(proceedLocator);

    }
}
