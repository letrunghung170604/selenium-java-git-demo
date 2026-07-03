package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void shouldProceedToCheckoutWhenCartHasItems() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        checkoutPage.openCartPage(baseUrl);

        Assert.assertTrue(
                checkoutPage.isCartSummaryDisplayed(),
                "Cart summary should be displayed before checkout."
        );

        Assert.assertTrue(
                checkoutPage.getCartItemCount() > 0,
                "Cart should contain at least one item before checkout."
        );

        checkoutPage.clickCheckoutButton();
    }
}