package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {


    private static final By CART_SUMMARY_PANEL = By.id("cart-summary");
    private static final By CART_ITEM_ROWS = By.cssSelector(".cart-item");
    private static final By CHECKOUT_BUTTON = By.cssSelector("[data-testid='checkout-button']")
    private static final By CHECKOUT_ERROR_MESSAGE = By.cssSelector(".checkout-error");


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void openCartPage(String baseUrl) {
        driver.get(baseUrl + "/cart");
    }

    public boolean isCartSummaryDisplayed() {
        return isDisplayed(CART_SUMMARY_PANEL);
    }

    public int getCartItemCount() {
        return countElements(CART_ITEM_ROWS);
    }

    public void clickCheckoutButton() {
        click(CHECKOUT_BUTTON);
    }

    public String getCheckoutErrorMessage() {
        return getText(CHECKOUT_ERROR_MESSAGE);
    }
}