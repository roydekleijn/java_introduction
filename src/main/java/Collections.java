public class Collections {

	public static void main(String[] args) {
		array();

	}

	public static void array() {
		// declares an array of integers
		int[] arrayOfNumbers;

		// allocates memory for 10 integers
		arrayOfNumbers = new int[5];

		arrayOfNumbers[0] = 100;
		arrayOfNumbers[1] = 200;
		arrayOfNumbers[2] = 300;
		arrayOfNumbers[3] = 400;
		arrayOfNumbers[4] = 500;

		System.out.println("Element at index 0: " + arrayOfNumbers[0]);
		System.out.println("Element at index 1: " + arrayOfNumbers[1]);
		System.out.println("Element at index 2: " + arrayOfNumbers[2]);
		System.out.println("Element at index 3: " + arrayOfNumbers[3]);
		System.out.println("Element at index 4: " + arrayOfNumbers[4]);
		int arrayLength = arrayOfNumbers.length;

		System.out.println("Display the size of an array: "
				+ arrayLength);
		
		//Loop through array
		for(int i = 0; i < arrayLength; i++) {
			System.out.println("Element at index 0: " + arrayOfNumbers[i]);
		}
	}
}
