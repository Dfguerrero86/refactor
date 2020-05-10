public class Printer {
	public static void main(final String[] args) {
		final int totalPrimes = 1000;
		final Utility utility = new Utility();
		final int[] primes = utility.generatePrimes(totalPrimes);
		utility.printPrimes(primes);
	}
}
