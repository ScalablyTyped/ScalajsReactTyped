package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Time. For documentation of this class, see java.sql.Time
  * .
  */
trait JdbcTime extends js.Object {
  def after(when: JdbcTime): Boolean
  def before(when: JdbcTime): Boolean
  def getHours(): Integer
  def getMinutes(): Integer
  def getSeconds(): Integer
  def getTime(): Integer
  def setHours(hours: Integer): Unit
  def setMinutes(minutes: Integer): Unit
  def setSeconds(seconds: Integer): Unit
  def setTime(milliseconds: Integer): Unit
}

object JdbcTime {
  @scala.inline
  def apply(
    after: JdbcTime => CallbackTo[Boolean],
    before: JdbcTime => CallbackTo[Boolean],
    getHours: CallbackTo[Integer],
    getMinutes: CallbackTo[Integer],
    getSeconds: CallbackTo[Integer],
    getTime: CallbackTo[Integer],
    setHours: Integer => Callback,
    setMinutes: Integer => Callback,
    setSeconds: Integer => Callback,
    setTime: Integer => Callback
  ): JdbcTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC.JdbcTime) => after(t0).runNow()))
    __obj.updateDynamic("before")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC.JdbcTime) => before(t0).runNow()))
    __obj.updateDynamic("getHours")(getHours.toJsFn)
    __obj.updateDynamic("getMinutes")(getMinutes.toJsFn)
    __obj.updateDynamic("getSeconds")(getSeconds.toJsFn)
    __obj.updateDynamic("getTime")(getTime.toJsFn)
    __obj.updateDynamic("setHours")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setHours(t0).runNow()))
    __obj.updateDynamic("setMinutes")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setMinutes(t0).runNow()))
    __obj.updateDynamic("setSeconds")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setSeconds(t0).runNow()))
    __obj.updateDynamic("setTime")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setTime(t0).runNow()))
    __obj.asInstanceOf[JdbcTime]
  }
}

