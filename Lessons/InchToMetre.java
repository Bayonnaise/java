/*
	Lesson 1-2 adapted: inches to metres converter
*/

class InchToMetre {
	public static void main(String args[]) {
		double inches, metres;
		int counter;

		counter = 0;
		for(inches = 1; inches <= 144; inches++) {
			metres = inches / 39.37;
			System.out.println(inches + " inches is " + metres + " metres.");
			counter++;
			if (counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
	}
}