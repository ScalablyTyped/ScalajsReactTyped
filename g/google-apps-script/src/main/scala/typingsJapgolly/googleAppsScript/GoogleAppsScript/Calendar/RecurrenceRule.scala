package typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a recurrence rule for an event series.
  *
  * Note that this class also behaves like the EventRecurrence that it belongs to,
  * allowing you to chain rule creation together like so:
  *
  *     recurrence.addDailyRule().times(3).interval(2).addWeeklyExclusion().times(2);
  *
  * times(times)
  * interval(interval)
  */
trait RecurrenceRule extends js.Object {
  def addDailyExclusion(): RecurrenceRule
  def addDailyRule(): RecurrenceRule
  def addDate(date: Date): EventRecurrence
  def addDateExclusion(date: Date): EventRecurrence
  def addMonthlyExclusion(): RecurrenceRule
  def addMonthlyRule(): RecurrenceRule
  def addWeeklyExclusion(): RecurrenceRule
  def addWeeklyRule(): RecurrenceRule
  def addYearlyExclusion(): RecurrenceRule
  def addYearlyRule(): RecurrenceRule
  def interval(interval: Integer): RecurrenceRule
  def onlyInMonth(month: Month): RecurrenceRule
  def onlyInMonths(months: js.Array[Month]): RecurrenceRule
  def onlyOnMonthDay(day: Integer): RecurrenceRule
  def onlyOnMonthDays(days: js.Array[Integer]): RecurrenceRule
  def onlyOnWeek(week: Integer): RecurrenceRule
  def onlyOnWeekday(day: Weekday): RecurrenceRule
  def onlyOnWeekdays(days: js.Array[Weekday]): RecurrenceRule
  def onlyOnWeeks(weeks: js.Array[Integer]): RecurrenceRule
  def onlyOnYearDay(day: Integer): RecurrenceRule
  def onlyOnYearDays(days: js.Array[Integer]): RecurrenceRule
  def setTimeZone(timeZone: String): EventRecurrence
  def times(times: Integer): RecurrenceRule
  def until(endDate: Date): RecurrenceRule
  def weekStartsOn(day: Weekday): RecurrenceRule
}

object RecurrenceRule {
  @scala.inline
  def apply(
    addDailyExclusion: CallbackTo[RecurrenceRule],
    addDailyRule: CallbackTo[RecurrenceRule],
    addDate: Date => CallbackTo[EventRecurrence],
    addDateExclusion: Date => CallbackTo[EventRecurrence],
    addMonthlyExclusion: CallbackTo[RecurrenceRule],
    addMonthlyRule: CallbackTo[RecurrenceRule],
    addWeeklyExclusion: CallbackTo[RecurrenceRule],
    addWeeklyRule: CallbackTo[RecurrenceRule],
    addYearlyExclusion: CallbackTo[RecurrenceRule],
    addYearlyRule: CallbackTo[RecurrenceRule],
    interval: Integer => CallbackTo[RecurrenceRule],
    onlyInMonth: Month => CallbackTo[RecurrenceRule],
    onlyInMonths: js.Array[Month] => CallbackTo[RecurrenceRule],
    onlyOnMonthDay: Integer => CallbackTo[RecurrenceRule],
    onlyOnMonthDays: js.Array[Integer] => CallbackTo[RecurrenceRule],
    onlyOnWeek: Integer => CallbackTo[RecurrenceRule],
    onlyOnWeekday: Weekday => CallbackTo[RecurrenceRule],
    onlyOnWeekdays: js.Array[Weekday] => CallbackTo[RecurrenceRule],
    onlyOnWeeks: js.Array[Integer] => CallbackTo[RecurrenceRule],
    onlyOnYearDay: Integer => CallbackTo[RecurrenceRule],
    onlyOnYearDays: js.Array[Integer] => CallbackTo[RecurrenceRule],
    setTimeZone: String => CallbackTo[EventRecurrence],
    times: Integer => CallbackTo[RecurrenceRule],
    until: Date => CallbackTo[RecurrenceRule],
    weekStartsOn: Weekday => CallbackTo[RecurrenceRule]
  ): RecurrenceRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDailyExclusion")(addDailyExclusion.toJsFn)
    __obj.updateDynamic("addDailyRule")(addDailyRule.toJsFn)
    __obj.updateDynamic("addDate")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date) => addDate(t0).runNow()))
    __obj.updateDynamic("addDateExclusion")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date) => addDateExclusion(t0).runNow()))
    __obj.updateDynamic("addMonthlyExclusion")(addMonthlyExclusion.toJsFn)
    __obj.updateDynamic("addMonthlyRule")(addMonthlyRule.toJsFn)
    __obj.updateDynamic("addWeeklyExclusion")(addWeeklyExclusion.toJsFn)
    __obj.updateDynamic("addWeeklyRule")(addWeeklyRule.toJsFn)
    __obj.updateDynamic("addYearlyExclusion")(addYearlyExclusion.toJsFn)
    __obj.updateDynamic("addYearlyRule")(addYearlyRule.toJsFn)
    __obj.updateDynamic("interval")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => interval(t0).runNow()))
    __obj.updateDynamic("onlyInMonth")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month) => onlyInMonth(t0).runNow()))
    __obj.updateDynamic("onlyInMonths")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month]) => onlyInMonths(t0).runNow()))
    __obj.updateDynamic("onlyOnMonthDay")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => onlyOnMonthDay(t0).runNow()))
    __obj.updateDynamic("onlyOnMonthDays")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer]) => onlyOnMonthDays(t0).runNow()))
    __obj.updateDynamic("onlyOnWeek")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => onlyOnWeek(t0).runNow()))
    __obj.updateDynamic("onlyOnWeekday")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday) => onlyOnWeekday(t0).runNow()))
    __obj.updateDynamic("onlyOnWeekdays")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday]) => onlyOnWeekdays(t0).runNow()))
    __obj.updateDynamic("onlyOnWeeks")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer]) => onlyOnWeeks(t0).runNow()))
    __obj.updateDynamic("onlyOnYearDay")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => onlyOnYearDay(t0).runNow()))
    __obj.updateDynamic("onlyOnYearDays")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer]) => onlyOnYearDays(t0).runNow()))
    __obj.updateDynamic("setTimeZone")(js.Any.fromFunction1((t0: java.lang.String) => setTimeZone(t0).runNow()))
    __obj.updateDynamic("times")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => times(t0).runNow()))
    __obj.updateDynamic("until")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date) => until(t0).runNow()))
    __obj.updateDynamic("weekStartsOn")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday) => weekStartsOn(t0).runNow()))
    __obj.asInstanceOf[RecurrenceRule]
  }
}

