import config.TestConfig;
import org.testng.annotations.Test;

import static constants.Constants.Actions.SWAPI_GET_PEOPLE;
import static constants.Constants.Path.SWAPI_PATH;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


public class FirstTest extends TestConfig {
    @Test
    public void myFirstTest() {
        given().log().uri().
                when().get(SWAPI_GET_PEOPLE + "1").
                then().log().body().statusCode(201);
    }
    @Test
    public void getSomeFieldInResponseAssertion() {
        given().spec(requestSpecificationForSwapiTests).log().uri().
                when().get(SWAPI_PATH).
                then().body("people", equalTo("https://swapi.dev/api/people/")).log().body();
    }
}