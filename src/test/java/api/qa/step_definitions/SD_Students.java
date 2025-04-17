package api.qa.step_definitions;

import api.qa.endpoints.EP_Students;
import io.cucumber.java.en.Given;

public class SD_Students {

    EP_Students ep_students=new EP_Students();
    @Given("User creates a new student and validates {string}, {string}, {string}, {string},{string} ,{string}")
    public void user_creates_a_new_student_and_validates(String name, String lastName, String phoneNumber,String email, String groupId, String studyFormat) {
      ep_students.createNewStudent(name,lastName,phoneNumber,email,groupId,studyFormat);
    }
}
