import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUser {

    @Test
    public void testCreateUser() {

        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "John Doe");
        requestBody.put("job", "Software Engineer");

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .when()
                .post("https://reqres.in/api/users");


        System.out.println(response.getBody().asPrettyString());

        Assert.assertEquals(response.getStatusCode(), 201, "Status code should be 201");

        String name = response.jsonPath().getString("name");
        String job = response.jsonPath().getString("job");
        String id = response.jsonPath().getString("id");

        Assert.assertEquals(name, "John Doe");
        Assert.assertEquals(job, "Software Engineer");
        Assert.assertNotNull(id);
    }
}
