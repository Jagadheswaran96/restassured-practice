package restAssured;

import static org.testng.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TokenValidation {
	
	@Test
	public void token() {
		String baseUrl = "https://gorest.co.in";
		String endpoint = "/public/v2/users";
		Response response = given()
				.baseUri(baseUrl)
				.header("Content-Type", "application/json")
				.get(endpoint);

		if (response.statusCode() == 200) {
			System.out.println("Response Body: " + response.asString());
			Object ids = response.jsonPath().get("id");
			System.out.println("IDs from response: " + ids);
		} else {
			System.out.println("Failed to fetch response: " + response.statusCode());
			System.out.println(response.asString());
		}
		
		//Retry-After refers after how many time interval next request should be sent
		String retryAfter = response.getHeader("Retry-After");
        System.out.println("received 429 with Retry-After: " + retryAfter);
	}
}
