public class DataTypes {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Default data types
		int i = 1; //32 bit max value (2^31) -1 = 2147483647
		long l = 12345678; //64 bit (2^63) -1 = 9223372036854775807
		boolean b = true; // true or false
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(b);
		
		//String is not a Data Type but a default Java class which acts as a Data Type
		String str = "Hello World!";
		System.out.println(str);
	}

}
