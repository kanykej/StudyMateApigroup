package api.qa.endpoints;

import api.qa.pojo.PJ_Group;
import api.qa.utils.APIJsonData;
import api.qa.utils.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

public class EP_Groups {
    final String json = "application/json";

    public void provideAddGroupInfo(String expectedGroupName, String expectedDate, String expectedDescription, String expectedMessage){
        RestAssured.baseURI = ConfigReader.readProperty("base_url");
        RestAssured.basePath = ConfigReader.readProperty("add_group");

        Response response = RestAssured.given().header("Content-type", json)
                .header("Accept", json)
                .header("Authorization", ConfigReader.readProperty("token"))
                .header("Origin", ConfigReader.readProperty("origin"))
                .body(APIJsonData.addGroup(expectedGroupName, expectedDate, expectedDescription))
                .when().post().then().log().body().statusCode(200).extract().response();

        PJ_Group deserializedResponse = new PJ_Group();
        Assert.assertEquals(expectedMessage, deserializedResponse.getMessage());

    }
}