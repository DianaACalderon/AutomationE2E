package starter.checkout;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillsTheCheckoutPage {

    public static Performable withInfo() {
        return Task.where("{0} fills the checkout page",
                Enter.theValue("pepe")
                        .into(CheckoutPage.FIRST_NAME),
                Enter.theValue("perez")
                        .into(CheckoutPage.LAST_NAME),
                Enter.theValue("46225")
                        .into(CheckoutPage.POSTAL_CODE),
                Click.on(CheckoutPage.CONTINUE),
                Click.on(CheckoutPage.FINISH)
        );
    }
}
