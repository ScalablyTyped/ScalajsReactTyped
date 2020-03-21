package typingsJapgolly.datejs.sugarpak

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.datejs.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddOrientation extends js.Object {
  def day(): Date
  def days(): Date
  def hour(): Date
  def hours(): Date
  def millisecond(): Date
  def milliseconds(): Date
  def minute(): Date
  def minutes(): Date
  def month(): Date
  def months(): Date
  def second(): Date
  def seconds(): Date
  def week(): Date
  def weeks(): Date
  def year(): Date
  def years(): Date
}

object IAddOrientation {
  @scala.inline
  def apply(
    day: CallbackTo[Date],
    days: CallbackTo[Date],
    hour: CallbackTo[Date],
    hours: CallbackTo[Date],
    millisecond: CallbackTo[Date],
    milliseconds: CallbackTo[Date],
    minute: CallbackTo[Date],
    minutes: CallbackTo[Date],
    month: CallbackTo[Date],
    months: CallbackTo[Date],
    second: CallbackTo[Date],
    seconds: CallbackTo[Date],
    week: CallbackTo[Date],
    weeks: CallbackTo[Date],
    year: CallbackTo[Date],
    years: CallbackTo[Date]
  ): IAddOrientation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("day")(day.toJsFn)
    __obj.updateDynamic("days")(days.toJsFn)
    __obj.updateDynamic("hour")(hour.toJsFn)
    __obj.updateDynamic("hours")(hours.toJsFn)
    __obj.updateDynamic("millisecond")(millisecond.toJsFn)
    __obj.updateDynamic("milliseconds")(milliseconds.toJsFn)
    __obj.updateDynamic("minute")(minute.toJsFn)
    __obj.updateDynamic("minutes")(minutes.toJsFn)
    __obj.updateDynamic("month")(month.toJsFn)
    __obj.updateDynamic("months")(months.toJsFn)
    __obj.updateDynamic("second")(second.toJsFn)
    __obj.updateDynamic("seconds")(seconds.toJsFn)
    __obj.updateDynamic("week")(week.toJsFn)
    __obj.updateDynamic("weeks")(weeks.toJsFn)
    __obj.updateDynamic("year")(year.toJsFn)
    __obj.updateDynamic("years")(years.toJsFn)
    __obj.asInstanceOf[IAddOrientation]
  }
}

