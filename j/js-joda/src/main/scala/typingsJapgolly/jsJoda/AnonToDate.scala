package typingsJapgolly.jsJoda

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToDate extends js.Object {
  def toDate(): js.Date
  def toEpochMilli(): Double
}

object AnonToDate {
  @scala.inline
  def apply(toDate: CallbackTo[js.Date], toEpochMilli: CallbackTo[Double]): AnonToDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toDate")(toDate.toJsFn)
    __obj.updateDynamic("toEpochMilli")(toEpochMilli.toJsFn)
    __obj.asInstanceOf[AnonToDate]
  }
}

