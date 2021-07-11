import config.TestConfig;
import org.testng.annotations.Test;


import static constants.Constants.Actions.*;
import static io.restassured.RestAssured.*;

public class JsonPlaceHolderTest extends TestConfig {
    @Test
    public void GET() {
        given().queryParam("postId", 1).log().uri().
                when().get(JSONPLACEHOLDER_GET).
                then().log().body().statusCode(200);
    }

    @Test
    public void PutWithJson() {
        String putJsonBody = "{\n" +
                "\"title\":\"foo\",\n" +
                "\"body\":\"bar\",\n" +
                "\"userId\":1,\n" +
                "}";
        given().body(putJsonBody).log().uri().
                when().put(JSONPLACEHOLDER_PUT).
                then().log().body().statusCode(200);
    }

    @Test
    public void Delete() {
        given().log().uri().
                when().delete(JSONPLACEHOLDER_DELETE).
                then().log().body().statusCode(200);
    }

    @Test
    public void PostWithJson() {
        String postJsonBody = "{\n" +
                "\"title\":\"foo\",\n" +
                "\"body\":\"bar\",\n" +
                "\"userId\":1,\n" +
                "}";
        given().body(postJsonBody).log().all().
                when().post(JSONPLACEHOLDER_POST).
                then().spec(responseSpecificationForPost).log().body();
    }

    @Test
    public void PostWithXml() {
        String postXmlBody = "{<Company>\n" +
                "  <Employee>\n" +
                "      <FirstName>Tanmay</FirstName>\n" +
                "      <LastName>Patil</LastName>\n" +
                "      <ContactNo>1234567890</ContactNo>\n" +
                "      <Email>tanmaypatil@xyz.com</Email>\n" +
                "      <Address>\n" +
                "           <City>Bangalore</City>\n" +
                "           <State>Karnataka</State>\n" +
                "           <Zip>560212</Zip>\n" +
                "      </Address>\n" +
                "  </Employee>\n" +
                "</Company>}";
        given().spec(requestSpecificationXml).body(postXmlBody).log().all().
                when().post(JSONPLACEHOLDER_POST).
                then().spec(responseSpecificationForGet).log().body();
    }
}
