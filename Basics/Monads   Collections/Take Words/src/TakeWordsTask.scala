import scala.annotation.tailrec

object TakeWordsTask {
  val lineSeparatorString = "\n"

  def takeWords(seq: Seq[String]): Seq[String] = {
    seq.flatMap(str => str.split("(?=" + lineSeparatorString + ")")).takeWhile(str => !str.contains(lineSeparatorString))
  }
}
