package od.steps;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import od.pages.AuthorizationPage;
import od.pages.HubHomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HUBSteps extends ScenarioSteps {

    AuthorizationPage authorizationPage;
    HubHomePage hubHomePage;

    @Step
    public void check_remember_me() {
        authorizationPage.checkRememberMe();
    }

    @Step
    public void open_login_page() {
        authorizationPage.open();
    }

    @Step
    public void fill_email_field(String email) {
        authorizationPage.fillFieldEmail(email);
    }

    @Step
    public void fill_password_field(String password) {
        authorizationPage.fillFieldPassword(password);
    }

    @Step
    public void fill_time_base_code(String timeBaseCode) {
        authorizationPage.fillFieldTimeBaseCode(timeBaseCode);
    }

    @Step
    public void generate_time_base_code() {
        authorizationPage.generateFieldTimeBaseCode();
    }

    @Step
    public void click_login() {
        authorizationPage.clickLogin();
    }

    @Step
    public void login_in_the_hub(String email, String password) {
        authorizationPage.loginInTheHub(email, password);
    }

    @Step
    public void should_see_header(String header) {
        assertThat(authorizationPage.getHeaders(), hasItem(header));
    }

    @Step
    public void should_see_element(String xpath) {
        assertThat(authorizationPage.isElementVisible(By.xpath(xpath)), is(true));
    }

    @Step
    public void should_see_link(String link) {
        assertThat(authorizationPage.getLinks(), hasItem(link));
    }

    @Step
    public void should_see_label(String label) {
        assertThat(authorizationPage.getLabels(), hasItem(label));
    }

    @Step
    public void should_see_war_room() {
        assertThat(hubHomePage.iconWarRoom.isVisible(), is(true));
    }
}