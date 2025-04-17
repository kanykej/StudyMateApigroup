package api.qa.endpoints;

import api.qa.pojo.PJ_Courses;
import api.qa.utils.APIJsonData;
import api.qa.utils.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class EP_Courses {

    final String json = "application/json";
    @Test
    public void validateCreateCourseData() {
        RestAssured.baseURI = ConfigReader.readProperty("base_url");

        RestAssured.basePath =ConfigReader.readProperty("create_course");

        Response response = RestAssured.given().header("Content-Type", json)
                .accept(ContentType.JSON)
                .header("Origin", ConfigReader.readProperty("origin"))
                .header("Authorization", ConfigReader.readProperty("token"))
                .body(APIJsonData.createCourse("JARI12@","2025-03-11","LALALA"))
                .when().post().then().log().body().statusCode(200).extract().response();

       PJ_Courses deserializedResponse= response.as(PJ_Courses.class);
        Assert.assertEquals(deserializedResponse.getCourseName(),"JARI12@");

    }
}
