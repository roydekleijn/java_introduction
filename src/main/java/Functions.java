
public class Functions {

	
	public static void main(String[] args) {
		callFunction();
		callFunctionWithParameters("testuser", "somePassword");
		String returnedString = callFunctionAndReturnAString();
		System.out.println("The returned string is: " + returnedString);
	}
	
	public static void callFunction() {
		System.out.println("Just a function call");
	}
	
	public static void callFunctionWithParameters(String username, String password) {
		System.out.println("A function call with the following parameters: " + username + " | " + password);
	}
	
	public static String callFunctionAndReturnAString() {
		return "something";
	}
}
