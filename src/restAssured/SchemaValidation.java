package restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SchemaValidation {
	
	public static void main(String[] args) {
		
//		Verify structure of response using JSON schema.
		
		Response response = RestAssured
				.given()
				.when()
				.get("/users/1");

				response
				.then()
				.statusCode(200)
				.header("Content-Type","application/json");
//				.body("name", equalTo("John"))
//				.time(lessThan(2000L))
//				.body(matchesJsonSchemaInClasspath("user-schema.json"));
	}
}
