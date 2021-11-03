object MapTask {
  def mapping(input: Seq[String]): Seq[Int] =
    input.filter(_.replaceAll("\\d", "") == "").map(_.toInt)
}