package restAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class RestfulTest {
	
		
	String baseUrl = "https://api.restful-api.dev/";
	
	public static Headers headers() {
		
		Headers headers = new Headers(
				//new Header("Authorization", "Bearer " + token), // JWT / OAuth2
				new Header("Accept", "application/json"),  // Accept JSON response
				new Header("Content-Type", "application/json"), // Request is JSON
				new Header("X-Api-Key", "4badfa81-52ba-4401-9cc7-0a5bca62fb55") // Custom header
				//new Header("User-Agent", "RestAssured-Test") // Client info
				);
		return headers;
	}
	
	@Test
	public void login() {

        Response response = given()
        		.baseUri(baseUrl)
        		.headers(RestfulTest.headers())
                .body("{\"email\":\"antonio@example.com\",\"password\":\"securePassword123\"}")
        .when()
                .post("/login");
        
        System.out.println(response.getHeader("Retry-After"));
        System.out.println(response.getHeaders());
        System.out.println(response.asPrettyString());
        System.out.println(response.asString());
        
    }

}

