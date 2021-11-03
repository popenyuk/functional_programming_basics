object FibonacciTask {

	def fibonacciImpl(): Int => Int = {
		def fibonacci: Int => Int = number => {
			if (number < 2) number
			else fibonacci(number - 1) + fibonacci(number - 2)
		}

		fibonacci
	}
}