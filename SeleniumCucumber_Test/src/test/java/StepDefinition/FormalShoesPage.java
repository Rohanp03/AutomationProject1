package StepDefinition;

import io.cucumber.java.en.Then;
import net.bytebuddy.implementation.bytecode.Throw;

import static pages.FormalShoesPage.*;

public class FormalShoesPage {

    @Then("^User clicks on shoe name radio button$")

    public void user_clicks_on_shoe_name_radio_button() {

        click_classiccheltenham_btn();

    }

    @Then("^User clicks on brown option from shoe color dropdown$")

    public void user_clicks_on_brown_option_from_shoe_color_dropdown() throws Throwable{

        click_dropdown_button();

        click_brownshoes_option();

    }

    @Then("^User clicks on preferred size from shoe size dropdown$")

    public void user_clicks_on_preferred_size_from_shoe_size_dropdown() throws Throwable{

        click_sizedropdown_btn();

        click_preferred_option();


    }

    @Then("^User clicks on add to cart button$")

    public void user_clicks_on_add_to_cart_button() throws Throwable{

        click_addtocart_btn();
    }
}
