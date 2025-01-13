package day6;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*
public class trialtest{
	public static void main(String[] args) {
		RestAssured.baseURI="https://fakestoreapi.com";
		RequestSpecification req = RestAssured.given();
		Response resp = req.get("/products/1");
		resp.prettyPrint();
		//print all Headers
		System.out.println("==========ALL HEADERS ARE========s");
		List<Header> allhdrs = resp.headers().asList();
		for(Header h:allhdrs) {
			System.out.println(h.getName()+":"+h.getValue());	
		}
	}


		public class trialtest{
		public static void main(String[] args) {
			RestAssured.baseURI="https://policies.google.com";
			RequestSpecification req = RestAssured.given();
			Response resp = req.get("/terms?hl=en-IN&fg=1");
			resp.prettyPrint();
			//print all Headers
			System.out.println("==========ALL HEADERS ARE========s");
			List<Header> allhdrs = resp.headers().asList();
			for(Header h:allhdrs) {
				System.out.println(h.getName()+":"+h.getValue());	
			}
		}	
		*/	
	
		public class trialtest{
			public static void main(String[] args) {
				RestAssured.baseURI="https://www.facebook.com";
				RequestSpecification req = RestAssured.given();
				Response resp = req.get("/home.php");
				resp.prettyPrint();
				//print all Headers
				System.out.println("==========ALL HEADERS ARE========s");
				List<Header> allhdrs = resp.headers().asList();
				for(Header h:allhdrs) {
					System.out.println(h.getName()+":"+h.getValue());	
				}
			}	
			
		
		
		
	

}
