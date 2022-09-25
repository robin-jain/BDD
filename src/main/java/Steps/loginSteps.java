package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loginSteps {
    @Given("I navigate to login page")
    public void i_navigate_to_login_page() {
        System.out.println("I navigate to login page");

    }

    @Given("click on login button")
    public void click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on login button");

    }
    @Then("HomePage should be visible")
    public void home_page_should_be_visible() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("HomePage should be visible");

    }

    @And("I entered username as {string} and password as {string}")
    public void iEnteredUsernameAsAndPasswordAs(String username, String password) {
        System.out.println("This is user name "+ username);
        System.out.println("This is password name "+ password);
    }




    @And("entered username ([^`\"]*) and ([^`\"]*)$")
    public void enteredUsernameUsernameAndPassword(String username, String password) {
        System.out.println("this is for Scenario outline username "+ username);
        System.out.println("this is for Scenario outline password "+ password);
    }
}
