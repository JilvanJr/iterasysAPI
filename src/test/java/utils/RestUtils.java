package utils;

import static io.restassured.RestAssured.given;
import java.util.Map;
import entities.Pet;
import entities.Store;
import entities.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestUtils {
	private static Response response;
	
	public static void urlBase() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
	}
	
	public static void realizarCadastro(Map<String, Object> json, String endpoint) {	
		Response response = 
				given()
				.contentType("application/json")
				.body(json)
				.when().post(endpoint);
				response.then().statusCode(200);	
	}

	public static void alterarStatus(Pet pet, String status, String endpoint) {
		response = 
				given()
				.contentType(ContentType.URLENC)
				.formParam("name", pet.getPet().get("name"))
				.formParam("status", status)
				.when().post(endpoint+"/"+pet.getPet().get("id"));
				response.then().statusCode(200);
				
		pet.set("status", status);				
	}
	
	public static void consultarOrdemUsuario(User user, String endpoint) {
		response = RestAssured
				.given()
				.contentType(ContentType.JSON)
				.when()
				.get(endpoint+"/"+user.getUser().get("username"))
				.then()
				.statusCode(200)
				.extract()  
				.response();
	}
	
	public static void consultarOrdemAnimal(Pet pet, String endpoint) {
		response = RestAssured
				.given()
				.contentType(ContentType.JSON)
				.when()
				.get(endpoint+"/"+pet.getPet().get("id")) 
				.then() 
				.statusCode(200)
				.extract() 
				.response(); 
	}
	
	public static Response consultarOrdemStatus(Store store, String endpoint) {
		response = RestAssured
				.given() 
				.contentType(ContentType.JSON)
				.when() 
				.get(endpoint+"/"+store.getStore().get("id"))
				.then()
				.statusCode(200)
				.extract() 
				.response(); 
		return response;
	}	
	public static Object get(String key) {
		return response.getBody().jsonPath().get(key);
	}
}
