package od.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import od.pages.AuthorizationPage;

import java.io.FileNotFoundException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RegistrationSteps extends ScenarioSteps{

    AuthorizationPage authorizationPage;

    private String tbc = "JBSWY3DPEHPK3PXP";


    @Step
    public void open_login_page() {
        authorizationPage.open();
    }

    @Step
    public void login_in_the_hub(String email, String password) {
        authorizationPage.loginInTheHub(email, password);
    }

}

