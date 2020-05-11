
public class Prime {
	int ORDMAX = 30;
	int ORD = 2;
	int SQUARE = 9;
	int multiples[] = new int[ORDMAX + 1];;

	int totalPrimes;

	public int[] generate() {
		int primes[] = new int[totalPrimes + 1];
		primes[1] = 2;
		int nextPrime = 1;
		int countPrime = 1;
		boolean isPrime;
		while (countPrime < totalPrimes) {
			do {
				nextPrime += 2;
				if (nextPrime == SQUARE) {
					ORD++;
					SQUARE = primes[ORD] * primes[ORD];
					multiples[ORD - 1] = nextPrime;
				}
				isPrime = true;
				isPrime = validatePrime(primes, multiples, nextPrime, isPrime, ORD);
			} while (!isPrime);
			countPrime++;
			primes[countPrime] = nextPrime;
		}
		return primes;
	}

	private boolean validatePrime(int[] primes, int[] multiples, int nextPrime, boolean isPrime, int ORD) {
		for (int indexOrder = 2; indexOrder < ORD && isPrime; indexOrder++) {
			while (multiples[indexOrder] < nextPrime) {
				multiples[indexOrder] += primes[indexOrder] + primes[indexOrder];
			}
			if (multiples[indexOrder] == nextPrime) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public int getTotalPrimes() {
		return totalPrimes;
	}

	public void setTotalPrimes(int totalPrimes) {
		this.totalPrimes = totalPrimes;
	}
}
