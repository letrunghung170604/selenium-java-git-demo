package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    private By cartSummaryPanel = By.id("cart-summary");
    private By cartItemRows = By.cssSelector(".cart-item");
    private By checkoutButton = By.cssSelector("[data-testid='checkout-button']");
    private By checkoutErrorMessage = By.cssSelector(".checkout-error");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void openCartPage(String baseUrl) {
        driver.get(baseUrl + "/cart");
    }

    public boolean isCartSummaryDisplayed() {
        return driver.findElement(cartSummaryPanel).isDisplayed();
    }

    public int getCartItemCount() {
        return driver.findElements(cartItemRows).size();
    }

    public void clickCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }

    public String getCheckoutErrorMessage() {
        return driver.findElement(checkoutErrorMessage).getText();
    }
}