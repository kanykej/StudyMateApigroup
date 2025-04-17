package api.qa.step_definitions;

import api.qa.endpoints.EP_Groups;
import io.cucumber.java.en.Then;

public class SD_Groups {
    EP_Groups ep_groups = new EP_Groups();

    @Then("User provides {string}, {string},{string} and validates {string} from end-point Post")
    public void user_provides_and_validates_from_end_point_post(String expectedGroupName, String expectedDate, String expectedDescription, String expectedMessage) {
        ep_groups.provideAddGroupInfo(expectedGroupName, expectedDate, expectedDescription, expectedMessage);
    }

}
