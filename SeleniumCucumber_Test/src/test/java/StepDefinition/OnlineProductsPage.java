package StepDefinition;

import io.cucumber.java.en.Given;


import static pages.OnlineProductsPage.*;


public class OnlineProductsPage {


    @Given("^User navigates to the online products page$")
    public void user_navigates_to_the_online_products_page() throws Throwable {

        click_hamburger_menu();
        click_onlineProducts_Link();

    }

}
