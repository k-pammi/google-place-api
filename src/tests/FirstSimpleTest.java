package tests;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import resources.endpointResources;


public class FirstSimpleTest extends BaseTest{
	
	@Test
	public void validations()
	{
		
		RestAssured.given().
		param("location", "-33.8670522,151.1957362").
		param("radius", "1500").
		when().get(endpointResources.getNearbySearchPlace()).
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
		System.out.println("Status code 200, test passed");
	
	}
}
