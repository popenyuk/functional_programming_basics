object GroupWordsTask {
  def groupIt(wordsSeq: Seq[String]): Map[Char, Int] = {
    wordsSeq.groupBy(_.charAt(0)).mapValues(_)
  }
}