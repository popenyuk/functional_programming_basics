object FizzBuzzTask {
  def fizzBuzzIt(s: Seq[Int]): Seq[String] =
    {
      s.map(t => (t % 3, t % 5) match {
            case (0, 0) => "FizzBuzz"
            case (0, _) => "Fizz"
            case (_, 0) => "Buzz"
            case (_, _) => t.toString
          })
    }
}