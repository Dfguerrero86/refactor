public class Printer {
	public static void main(final String[] args) {
		final int TOTAL_PRIMES = 1000;
		IUtility utility = new Utility();
		utility.printPrimes(utility.generatePrimes(TOTAL_PRIMES));
	}
}
