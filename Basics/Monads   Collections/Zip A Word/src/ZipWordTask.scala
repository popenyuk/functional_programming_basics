object ZipWordTask {
  def zipIt(prefixSeq: Seq[String], wordSeq: Seq[String], suffixSeq: Seq[String]): Seq[String] = {
    prefixSeq.zip(wordSeq).zip(suffixSeq).map({
      case ((prefix, word), suffix) => prefix + word + suffix
    })
  }
}