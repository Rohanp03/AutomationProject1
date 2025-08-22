package StepDefinition;

import io.cucumber.java.en.Then;

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
}
