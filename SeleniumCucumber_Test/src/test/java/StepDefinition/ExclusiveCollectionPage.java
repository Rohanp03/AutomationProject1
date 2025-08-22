package StepDefinition;

import io.cucumber.java.en.Then;


import static pages.ExclusiveCollectionPage.*;


public class ExclusiveCollectionPage {

    @Then("^User navigates to the exclusive collection page$")

    public void user_navigates_to_the_exclusive_collection_page() {

        click_exclusivecollection_btn();

    }
}
