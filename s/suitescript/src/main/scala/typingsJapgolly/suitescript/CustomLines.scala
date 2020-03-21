package typingsJapgolly.suitescript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLines extends js.Object {
  def addNewLine(): CustomLine
  def getCount(): Double
  def getLine(index: Double): CustomLine
}

object CustomLines {
  @scala.inline
  def apply(
    addNewLine: CallbackTo[CustomLine],
    getCount: CallbackTo[Double],
    getLine: Double => CallbackTo[CustomLine]
  ): CustomLines = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNewLine")(addNewLine.toJsFn)
    __obj.updateDynamic("getCount")(getCount.toJsFn)
    __obj.updateDynamic("getLine")(js.Any.fromFunction1((t0: scala.Double) => getLine(t0).runNow()))
    __obj.asInstanceOf[CustomLines]
  }
}

