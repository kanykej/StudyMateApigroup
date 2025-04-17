package api.qa.endpoints;

import api.qa.pojo.Pj_Students;
import api.qa.utils.APIJsonData;
import api.qa.utils.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;


public class EP_Students {
    final String json = "application/json";
    final String contentType = "Content-Type";
    final String accept = "Accept";
    final String authorization = "Authorization";
   // final String origin = Elements.Origin"https://codewise.studymate.us";


    public void createNewStudent(String name, String lastName, String phoneNumber,String email, String groupId, String studyFormat) {

        RestAssured.baseURI = ConfigReader.readProperty("base_url");
        RestAssured.basePath = ConfigReader.readProperty("create_student");

        Response response;
        response = RestAssured.given().header(contentType, json)
                .accept(ContentType.JSON)
                .header("Origin",ConfigReader.readProperty("origin"))
                .header(authorization, ConfigReader.readProperty("token"))
                .body(APIJsonData.addStudent(name,lastName,phoneNumber,email,groupId,studyFormat))
                .when().post().then().log().body().statusCode(200).extract().response();


        Map<String, Object> deserializeResponse= response.as(new TypeRef<Map<String, Object>>() {});
      //  Assert.assertEquals(deserializeResponse.get("name"), name);
        Assert.assertEquals(deserializeResponse.get("lastName"), lastName);

//        //return deserializeResponse.getName().get(0).getId();
//        Assert.assertEquals( name,deserializeResponse.getName());
//        Assert.assertEquals(deserializeResponse.getLastName(), lastName);
//        Assert.assertEquals(deserializeResponse.getEmail(), email);
//        Assert.assertEquals(deserializeResponse.getPhoneNumber(), phoneNumber);
//        //Assert.assertEquals(deserializeResponse.getGroupId(),1);
//        Assert.assertEquals(deserializeResponse.getStudyFormat(), studyFormat);
    }

    public void validateDeleteStudent() {
    RestAssured.baseURI = ConfigReader.readProperty("base_url");
    RestAssured.basePath = ConfigReader.readProperty("delete_student");

    Response response = RestAssured.given().header(contentType, json)
                .accept(ContentType.JSON)
                .header("Origin",ConfigReader.readProperty("origin"))
                .header(authorization, ConfigReader.readProperty("token"))
                .when().delete().then().log().body().statusCode(200).extract().response();

        Pj_Students deserializeResponsedelete = response.as(Pj_Students.class);
Assert.assertEquals(deserializeResponsedelete.getStudyFormat(),"ONLINE");
    }
}