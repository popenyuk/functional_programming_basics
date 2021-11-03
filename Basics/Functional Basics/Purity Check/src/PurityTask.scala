object PurityTask {

  case class Integer(var value: Int) { }

  def isPure(incrementFn: Integer => Integer): Boolean = {
    def isStateChanging(incrementFn: Integer => Integer, number: Integer): Boolean = {
      incrementFn(number).value == incrementFn(number).value
    }

    def isIncrement(incrementFn: Integer => Integer, number: Integer, required: Integer): Boolean = {
      incrementFn(number).value == required.value
    }

    def isPureHelper(incrementFn: Integer => Integer): Boolean = {
        isStateChanging(incrementFn, Integer(1)) &&
        isIncrement(incrementFn, Integer(1), Integer(2)) &&
        isIncrement(incrementFn, Integer(2), Integer(3))
    }

    isPureHelper(incrementFn)
  }
}