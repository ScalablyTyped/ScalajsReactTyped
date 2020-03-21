package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for clock triggers.
  */
trait ClockTriggerBuilder extends js.Object {
  def after(durationMilliseconds: Integer): ClockTriggerBuilder
  def at(date: Date): ClockTriggerBuilder
  def atDate(year: Integer, month: Integer, day: Integer): ClockTriggerBuilder
  def atHour(hour: Integer): ClockTriggerBuilder
  def create(): Trigger
  def everyDays(n: Integer): ClockTriggerBuilder
  def everyHours(n: Integer): ClockTriggerBuilder
  def everyMinutes(n: Integer): ClockTriggerBuilder
  def everyWeeks(n: Integer): ClockTriggerBuilder
  def inTimezone(timezone: String): ClockTriggerBuilder
  def nearMinute(minute: Integer): ClockTriggerBuilder
  def onMonthDay(day: Integer): ClockTriggerBuilder
  def onWeekDay(day: Weekday): ClockTriggerBuilder
}

object ClockTriggerBuilder {
  @scala.inline
  def apply(
    after: Integer => CallbackTo[ClockTriggerBuilder],
    at: Date => CallbackTo[ClockTriggerBuilder],
    atDate: (Integer, Integer, Integer) => CallbackTo[ClockTriggerBuilder],
    atHour: Integer => CallbackTo[ClockTriggerBuilder],
    create: CallbackTo[Trigger],
    everyDays: Integer => CallbackTo[ClockTriggerBuilder],
    everyHours: Integer => CallbackTo[ClockTriggerBuilder],
    everyMinutes: Integer => CallbackTo[ClockTriggerBuilder],
    everyWeeks: Integer => CallbackTo[ClockTriggerBuilder],
    inTimezone: String => CallbackTo[ClockTriggerBuilder],
    nearMinute: Integer => CallbackTo[ClockTriggerBuilder],
    onMonthDay: Integer => CallbackTo[ClockTriggerBuilder],
    onWeekDay: Weekday => CallbackTo[ClockTriggerBuilder]
  ): ClockTriggerBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => after(t0).runNow()))
    __obj.updateDynamic("at")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date) => at(t0).runNow()))
    __obj.updateDynamic("atDate")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t2: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => atDate(t0, t1, t2).runNow()))
    __obj.updateDynamic("atHour")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => atHour(t0).runNow()))
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("everyDays")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => everyDays(t0).runNow()))
    __obj.updateDynamic("everyHours")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => everyHours(t0).runNow()))
    __obj.updateDynamic("everyMinutes")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => everyMinutes(t0).runNow()))
    __obj.updateDynamic("everyWeeks")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => everyWeeks(t0).runNow()))
    __obj.updateDynamic("inTimezone")(js.Any.fromFunction1((t0: java.lang.String) => inTimezone(t0).runNow()))
    __obj.updateDynamic("nearMinute")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => nearMinute(t0).runNow()))
    __obj.updateDynamic("onMonthDay")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => onMonthDay(t0).runNow()))
    __obj.updateDynamic("onWeekDay")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday) => onWeekDay(t0).runNow()))
    __obj.asInstanceOf[ClockTriggerBuilder]
  }
}

