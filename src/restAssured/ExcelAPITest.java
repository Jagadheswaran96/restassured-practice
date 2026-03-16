package restAssured;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ExcelAPITest {

	public static void main(String[] args) throws Exception {

		/*
		 * List<String[]> data = ExcelReader.readExcel("request.xlsx");
		 * 
		 * for(String[] row : data) {
		 * 
		 * String username = row[0]; String password = row[1];
		 * 
		 * String body =
		 * "{ \"username\":\""+username+"\", \"password\":\""+password+"\" }";
		 * 
		 * Response response = RestAssured.given()
		 * .header("Content-Type","application/json") .body(body)
		 * .post("https://reqres.in/api/login");
		 * 
		 * ExcelWriter.writeResponse(username, response.asPrettyString()); }
		 */
    }

}
