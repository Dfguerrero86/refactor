public class Printer {
	public static void main(final String[] args) {
		int totalPrimes = 1000;
		Utility utility = new Utility();
		int[] primes = utility.generatePrimes(totalPrimes);
		utility.printPrimes(primes);
	}
}
