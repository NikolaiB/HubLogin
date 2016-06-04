package od.jbehave;

import net.thucydides.core.annotations.Steps;
import od.steps.HUBSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {

    public String timeBaseCode;

    @Steps
    HUBSteps hubSteps;

    @Given("the user is on the HUB login page")
    public void open_home_page_given(){ hubSteps.open_login_page(); }

    @Given("the user login in the HUB with email:'$email', password:'$password' and time base code")
    public void login_in_the_hub_given(String email, String password){
        hubSteps.login_in_the_hub(email, password);
    }

    @Given("the user observe label '$label'")
    public void should_see_label_given(String label){
        hubSteps.should_see_label(label);
    }

    @Given("the user observe header '$header'")
    public void should_see_header_given(String header){
        hubSteps.should_see_header(header);
    }

    @Given("the user observe link '$link'")
    public void should_see_link_given(String link) { hubSteps.should_see_link(link); }

    @When("the user input email '$email'")
    public void fill_field_email_when(String email){
        hubSteps.fill_email_field(email);
    }

    @When("the user input password '$password'")
    public void fill_password_field_when(String password){
        hubSteps.fill_password_field(password);
    }

    @When("the user input time base code '$timeBaseCode'")
    public void fill_time_base_code_field_when(String timeBaseCode){
        hubSteps.fill_time_base_code(timeBaseCode);
    }

    @When("the user input time base code (auto generate)")
    public void generate_time_base_code_when(){
        hubSteps.generate_time_base_code();
    }

    @When("the user login in the HUB with email:'$email', password:'$password' and time base code (details)")
    public void login_in_the_hub_when_details(String email, String password){
        hubSteps.fill_email_field(email);
        hubSteps.fill_password_field(password);
        hubSteps.generate_time_base_code();
        hubSteps.click_login();
    }

    @When("the user login in the HUB with email:'$email', password:'$password' and time base code")
    public void login_in_the_hub_when(String email, String password){
        hubSteps.login_in_the_hub(email, password);
    }

    @When("the user click on the login button")
    public void click_on_the_login_button_when(){
        hubSteps.click_login();
    }

    @When("the user check Remember Me")
    public void check_remember_me(){ hubSteps.check_remember_me(); }

    @Then("the user observe header '$header'")
    public void should_see_header_then(String header){
        hubSteps.should_see_header(header);
    }

    @Then("the user observe link '$link'")
    public void should_see_link_then(String link){ hubSteps.should_see_link(link);}

    @Then("the user observe element by xpath '$xpath'")
    public void should_see_element_then(String xpath) { hubSteps.should_see_element(xpath); }

    @Then("the user should observe war room")
    public void should_observe_war_room(){
        hubSteps.should_see_war_room();
    }

}
