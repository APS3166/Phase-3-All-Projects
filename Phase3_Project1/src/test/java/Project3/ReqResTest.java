package Project3;

import java.util.HashMap;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import groovyjarjarantlr.collections.List;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class ReqResTest {
	
	
	@Test
	public void TestAllEmployee() {
		
			RestAssured.given()
					.baseUri("https://reqres.in/api/users")
					.when()
					.get()
					.then()
					.log()
					.all()
					.statusCode(200);
			       
}
	@Test
	public void TestSingleEmployee() {
		
			RestAssured.given()
					.baseUri("https://reqres.in/api/users")
					.when()
					.get("/3")
					.then()
					.log()
					.all()
					.statusCode(200);
			       
}

	@Test
	public void TestPostEmployee() {
		
		HashMap<String,String> obj = new HashMap<String,String>();
		obj.put("id", "248");
		obj.put("name", "morpheus");
		obj.put("salary", "10000");
		
		RestAssured.given()
					.baseUri("http://localhost:3000/employees")
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.body(obj)
					.when()
					.post()
					.then()
					.log()
					.all();
		
}
	
}

	

	        
	
			
			
			        
	