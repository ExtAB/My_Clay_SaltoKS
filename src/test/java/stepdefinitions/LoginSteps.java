package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobjects.LoginPage;
import org.example.pageobjects.ProductPage;
import org.junit.Assert;

public class LoginSteps {

  @Given("I navigate to SaltoKS app")
  public void iNavigateToSaltoKSApp() {
    //empty for readability BDD
  }

  @When("I enter my credentials, {string} and {string}")
  public void iEnterMyCredentialsAnd(String username, String password) {
    new LoginPage().login(username,password);
  }

  @Then("I should verify error message {string}")
  public void iShouldVerifyErrorMessage(String errorMessage) {
    Assert.assertEquals(new LoginPage().getErrorText(), errorMessage);
  }

  @Then("I should see SaltoKS homepage")
  public void iShouldSeeSaltoKSHomepage() {
    Assert.assertTrue(new ProductPage().isProductPageTitleVisible());
  }
}