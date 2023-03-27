package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageobjects.PeoplePage;
import org.example.pageobjects.ProductPage;
import org.junit.Assert;

public class UserSteps {

    @And("I navigate to settings page to fill username {string}, lastname {string}")
    public void iNavigateToSettingsPageToFillUsernameLastname(String firstName, String lastName) {
        new ProductPage().navigateToUsers().createUserFlow(firstName,lastName);
    }

    @Then("I should verify successful message {string}")
    public void iShouldVerifySuccessfulMessage(String successfulMessage) {
        Assert.assertEquals(new PeoplePage().getCreatedMessageText(),successfulMessage);
    }
}
