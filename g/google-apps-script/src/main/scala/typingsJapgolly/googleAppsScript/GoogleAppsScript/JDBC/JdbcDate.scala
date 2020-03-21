package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Date. For documentation of this class, see java.sql.Date
  * .
  */
trait JdbcDate extends js.Object {
  def after(when: JdbcDate): Boolean
  def before(when: JdbcDate): Boolean
  def getDate(): Integer
  def getMonth(): Integer
  def getTime(): Integer
  def getYear(): Integer
  def setDate(date: Integer): Unit
  def setMonth(month: Integer): Unit
  def setTime(milliseconds: Integer): Unit
  def setYear(year: Integer): Unit
}

object JdbcDate {
  @scala.inline
  def apply(
    after: JdbcDate => CallbackTo[Boolean],
    before: JdbcDate => CallbackTo[Boolean],
    getDate: CallbackTo[Integer],
    getMonth: CallbackTo[Integer],
    getTime: CallbackTo[Integer],
    getYear: CallbackTo[Integer],
    setDate: Integer => Callback,
    setMonth: Integer => Callback,
    setTime: Integer => Callback,
    setYear: Integer => Callback
  ): JdbcDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC.JdbcDate) => after(t0).runNow()))
    __obj.updateDynamic("before")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC.JdbcDate) => before(t0).runNow()))
    __obj.updateDynamic("getDate")(getDate.toJsFn)
    __obj.updateDynamic("getMonth")(getMonth.toJsFn)
    __obj.updateDynamic("getTime")(getTime.toJsFn)
    __obj.updateDynamic("getYear")(getYear.toJsFn)
    __obj.updateDynamic("setDate")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setDate(t0).runNow()))
    __obj.updateDynamic("setMonth")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setMonth(t0).runNow()))
    __obj.updateDynamic("setTime")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setTime(t0).runNow()))
    __obj.updateDynamic("setYear")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setYear(t0).runNow()))
    __obj.asInstanceOf[JdbcDate]
  }
}

