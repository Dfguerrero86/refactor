public class Utility implements IUtility {
	@Override
	public int[] generatePrimes(int totalPrimes) {
		int P[] = new int[totalPrimes + 1];
		int ORDMAX = 30;
		int MULT[] = new int[ORDMAX + 1];

		int J;
		int K;
		boolean JPRIME;
		int ORD;
		int SQUARE;
		J = 1;
		K = 1;
		P[1] = 2;
		ORD = 2;
		SQUARE = 9;
		while (K < totalPrimes) {
			do {
				J += 2;
				if (J == SQUARE) {
					ORD++;
					SQUARE = P[ORD] * P[ORD];
					MULT[ORD - 1] = J;
				}
				JPRIME = true;
				for (int N = 2; N < ORD && JPRIME; N++) {
					while (MULT[N] < J) {
						MULT[N] += P[N] + P[N];
					}
					if (MULT[N] == J) {
						JPRIME = false;
						break;
					}
				}
			} while (!JPRIME);
			K++;
			P[K] = J;
		}
		return P;
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
