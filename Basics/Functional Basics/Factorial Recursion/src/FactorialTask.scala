import scala.annotation.tailrec

object FactorialTask {

  def factorialImpl(): Int => Long = {
    @tailrec def factorial(number: Int, current: Long): Long = {
      if (number < 2) current
      else factorial(number - 1, number * current)
    }

    factorial(_, 1)
  }
}