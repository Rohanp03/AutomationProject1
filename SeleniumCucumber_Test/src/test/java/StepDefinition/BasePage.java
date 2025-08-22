package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.PendingException;

import static pages.HomePage.*;

public class BasePage {
    @Given("^User navigates to the log in page$")
    public void user_navigates_to_the_log_in_page() throws Throwable {

        click_hamburger_menu();
        click_signIn_Link();

    }
}