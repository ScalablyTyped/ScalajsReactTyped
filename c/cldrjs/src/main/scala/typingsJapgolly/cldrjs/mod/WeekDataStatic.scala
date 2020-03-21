package typingsJapgolly.cldrjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekDataStatic extends js.Object {
  def firstDay(): String
  def minDays(): Double
}

object WeekDataStatic {
  @scala.inline
  def apply(firstDay: CallbackTo[String], minDays: CallbackTo[Double]): WeekDataStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("firstDay")(firstDay.toJsFn)
    __obj.updateDynamic("minDays")(minDays.toJsFn)
    __obj.asInstanceOf[WeekDataStatic]
  }
}

