package typingsJapgolly.datejs.sugarpak

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateElement extends js.Object {
  def day(): IDateElementEvaluator
  def days(): IDateElementEvaluator
  def hour(): IDateElementEvaluator
  def hours(): IDateElementEvaluator
  def millisecond(): IDateElementEvaluator
  def milliseconds(): IDateElementEvaluator
  def minute(): IDateElementEvaluator
  def minutes(): IDateElementEvaluator
  def month(): IDateElementEvaluator
  def months(): IDateElementEvaluator
  def second(): IDateElementEvaluator
  def seconds(): IDateElementEvaluator
  def week(): IDateElementEvaluator
  def weeks(): IDateElementEvaluator
  def year(): IDateElementEvaluator
  def years(): IDateElementEvaluator
}

object IDateElement {
  @scala.inline
  def apply(
    day: CallbackTo[IDateElementEvaluator],
    days: CallbackTo[IDateElementEvaluator],
    hour: CallbackTo[IDateElementEvaluator],
    hours: CallbackTo[IDateElementEvaluator],
    millisecond: CallbackTo[IDateElementEvaluator],
    milliseconds: CallbackTo[IDateElementEvaluator],
    minute: CallbackTo[IDateElementEvaluator],
    minutes: CallbackTo[IDateElementEvaluator],
    month: CallbackTo[IDateElementEvaluator],
    months: CallbackTo[IDateElementEvaluator],
    second: CallbackTo[IDateElementEvaluator],
    seconds: CallbackTo[IDateElementEvaluator],
    week: CallbackTo[IDateElementEvaluator],
    weeks: CallbackTo[IDateElementEvaluator],
    year: CallbackTo[IDateElementEvaluator],
    years: CallbackTo[IDateElementEvaluator]
  ): IDateElement = {
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
    __obj.asInstanceOf[IDateElement]
  }
}

