package _default;

public class Assignment7 {
	
//	Write a class named Assignment7 that declares the string "http://example.com? access_token=EFEc8328h29jndjd02h12$3829&ds98d". 
//	Print only the token from the string (the part AFTER the �=�. (Hint: Use the substring() method)
	
	public static String url =  "http://example.com? access_token=EFEc8328h29jndjd02h12$3829&ds98d";
	
	public static void main(String[] args) {
		
		System.out.println(url.substring(url.indexOf("=")+ 1)+ " is the token.");
	}

}
