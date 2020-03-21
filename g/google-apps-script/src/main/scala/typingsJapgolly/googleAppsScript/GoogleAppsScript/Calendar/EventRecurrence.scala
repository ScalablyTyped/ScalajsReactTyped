package typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the recurrence settings for an event series.
  */
trait EventRecurrence extends js.Object {
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
  def setTimeZone(timeZone: String): EventRecurrence
}

object EventRecurrence {
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
    setTimeZone: String => CallbackTo[EventRecurrence]
  ): EventRecurrence = {
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
    __obj.updateDynamic("setTimeZone")(js.Any.fromFunction1((t0: java.lang.String) => setTimeZone(t0).runNow()))
    __obj.asInstanceOf[EventRecurrence]
  }
}

