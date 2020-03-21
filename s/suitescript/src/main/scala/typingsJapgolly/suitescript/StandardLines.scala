package typingsJapgolly.suitescript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardLines extends js.Object {
  def getCount(): Double
  def getLine(index: Double): StandardLine
}

object StandardLines {
  @scala.inline
  def apply(getCount: CallbackTo[Double], getLine: Double => CallbackTo[StandardLine]): StandardLines = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCount")(getCount.toJsFn)
    __obj.updateDynamic("getLine")(js.Any.fromFunction1((t0: scala.Double) => getLine(t0).runNow()))
    __obj.asInstanceOf[StandardLines]
  }
}

