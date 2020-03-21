package typingsJapgolly.reactDateRange.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangeObject extends js.Object {
  def endDate(now: Moment): Moment
  def startDate(now: Moment): Moment
}

object DateRangeObject {
  @scala.inline
  def apply(endDate: Moment => CallbackTo[Moment], startDate: Moment => CallbackTo[Moment]): DateRangeObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endDate")(js.Any.fromFunction1((t0: typingsJapgolly.moment.mod.Moment) => endDate(t0).runNow()))
    __obj.updateDynamic("startDate")(js.Any.fromFunction1((t0: typingsJapgolly.moment.mod.Moment) => startDate(t0).runNow()))
    __obj.asInstanceOf[DateRangeObject]
  }
}

