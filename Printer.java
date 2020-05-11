public class Printer {
	public static void main(final String[] args) {
		int totalPrimes = 1000;
		IUtility utility = new Utility();
		utility.printPrimes(utility.generatePrimes(totalPrimes));
	}
}
