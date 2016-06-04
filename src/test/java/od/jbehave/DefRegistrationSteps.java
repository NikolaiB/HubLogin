package od.jbehave;

import net.thucydides.core.annotations.Steps;
import od.steps.RegistrationSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefRegistrationSteps {


    public String timeBaseCode;

    @Steps
    RegistrationSteps registrationSteps;

    @Given("the user is on the HUB login page")
    public void open_home_page_given(){
        registrationSteps.open_login_page();
    }

    @When("the user login in the HUB with email:'$email', password:'$password' and time base code")
    public void login_in_the_hub_when(String email, String password) {
        registrationSteps.login_in_the_hub(email, password);
    }

}

