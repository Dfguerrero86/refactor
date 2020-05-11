public class Utility implements IUtility {
	@Override
	public int[] generatePrimes(int totalPrimes) {
		Prime prime = new Prime();
		prime.setTotalPrimes(totalPrimes);
		return prime.generate();
	}

	@Override
	public void printPrimes(int[] primes) {
		final int RR = 50;
		final int CC = 4;
		int totalPrimes = primes.length - 1;

		int PAGENUMBER;
		int ROWOFFSET;
		int C;
		PAGENUMBER = 1;
		for (int PAGEOFFSET = 1; PAGEOFFSET <= totalPrimes; PAGEOFFSET += RR * CC) {
			System.out.print("The First ");
			System.out.print(Integer.toString(totalPrimes));
			System.out.print(" Prime Numbers === Page ");
			System.out.print(Integer.toString(PAGENUMBER));
			System.out.println("\n");
			for (ROWOFFSET = PAGEOFFSET; ROWOFFSET <= PAGEOFFSET + RR - 1; ROWOFFSET++) {
				for (C = 0; C <= CC - 1; C++) {
					if (ROWOFFSET + C * RR <= totalPrimes) {
						System.out.printf("%10d", primes[ROWOFFSET + C * RR]);
					}
				}
				System.out.println();
			}
			System.out.println("\f");
			PAGENUMBER++;
		}
	}
}
