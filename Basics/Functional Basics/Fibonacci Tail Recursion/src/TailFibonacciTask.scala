import scala.annotation.tailrec

object TailFibonacciTask {
  def fibonacciImpl2(): Int => Int = {
        @tailrec def fun(current: Int, previous: Int, depth: Int): Int = {
            if (depth == 0) previous
            else fun(current + previous, current, depth - 1)
        }

        fun(1, 0, _)
    }
}