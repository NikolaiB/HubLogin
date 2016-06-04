package od.jbehave;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTestSuite extends SerenityStories {
    public AcceptanceTestSuite(){
        findStoriesCalled("stories/*/SmokeTest.story");
    }
}
