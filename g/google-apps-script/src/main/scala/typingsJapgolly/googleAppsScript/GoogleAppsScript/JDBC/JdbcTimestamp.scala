package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Timestamp. For documentation of this class, see java.sql.Timestamp
  * .
  */
trait JdbcTimestamp extends js.Object {
  def after(when: JdbcTimestamp): Boolean
  def before(when: JdbcTimestamp): Boolean
  def getDate(): Integer
  def getHours(): Integer
  def getMinutes(): Integer
  def getMonth(): Integer
  def getNanos(): Integer
  def getSeconds(): Integer
  def getTime(): Integer
  def getYear(): Integer
  def setDate(date: Integer): Unit
  def setHours(hours: Integer): Unit
  def setMinutes(minutes: Integer): Unit
  def setMonth(month: Integer): Unit
  def setNanos(nanoseconds: Integer): Unit
  def setSeconds(seconds: Integer): Unit
  def setTime(milliseconds: Integer): Unit
  def setYear(year: Integer): Unit
}

object JdbcTimestamp {
  @scala.inline
  def apply(
    after: JdbcTimestamp => CallbackTo[Boolean],
    before: JdbcTimestamp => CallbackTo[Boolean],
    getDate: CallbackTo[Integer],
    getHours: CallbackTo[Integer],
    getMinutes: CallbackTo[Integer],
    getMonth: CallbackTo[Integer],
    getNanos: CallbackTo[Integer],
    getSeconds: CallbackTo[Integer],
    getTime: CallbackTo[Integer],
    getYear: CallbackTo[Integer],
    setDate: Integer => Callback,
    setHours: Integer => Callback,
    setMinutes: Integer => Callback,
    setMonth: Integer => Callback,
    setNanos: Integer => Callback,
    setSeconds: Integer => Callback,
    setTime: Integer => Callback,
    setYear: Integer => Callback
  ): JdbcTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC.JdbcTimestamp) => after(t0).runNow()))
    __obj.updateDynamic("before")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC.JdbcTimestamp) => before(t0).runNow()))
    __obj.updateDynamic("getDate")(getDate.toJsFn)
    __obj.updateDynamic("getHours")(getHours.toJsFn)
    __obj.updateDynamic("getMinutes")(getMinutes.toJsFn)
    __obj.updateDynamic("getMonth")(getMonth.toJsFn)
    __obj.updateDynamic("getNanos")(getNanos.toJsFn)
    __obj.updateDynamic("getSeconds")(getSeconds.toJsFn)
    __obj.updateDynamic("getTime")(getTime.toJsFn)
    __obj.updateDynamic("getYear")(getYear.toJsFn)
    __obj.updateDynamic("setDate")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setDate(t0).runNow()))
    __obj.updateDynamic("setHours")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setHours(t0).runNow()))
    __obj.updateDynamic("setMinutes")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setMinutes(t0).runNow()))
    __obj.updateDynamic("setMonth")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setMonth(t0).runNow()))
    __obj.updateDynamic("setNanos")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setNanos(t0).runNow()))
    __obj.updateDynamic("setSeconds")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setSeconds(t0).runNow()))
    __obj.updateDynamic("setTime")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setTime(t0).runNow()))
    __obj.updateDynamic("setYear")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setYear(t0).runNow()))
    __obj.asInstanceOf[JdbcTimestamp]
  }
}

