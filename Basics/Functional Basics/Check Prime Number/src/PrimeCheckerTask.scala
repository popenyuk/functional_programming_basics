import scala.annotation.tailrec

object PrimeCheckerTask {

	@tailrec def isPrimeHelper(n: Long, current: Long): Boolean = {
		if (current == n) true
		else if (n % current == 0) false
		else isPrimeHelper(n, current + 1)
	}

	def isPrime(n: Long): Boolean = {
		isPrimeHelper(n, 2)
	}
}