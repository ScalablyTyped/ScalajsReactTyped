package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC SQLXML. For documentation of this class, see java.sql.SQLXML
  * .
  */
trait JdbcSQLXML extends js.Object {
  def free(): Unit
  def getString(): String
  def setString(value: String): Unit
}

object JdbcSQLXML {
  @scala.inline
  def apply(free: Callback, getString: CallbackTo[String], setString: String => Callback): JdbcSQLXML = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("free")(free.toJsFn)
    __obj.updateDynamic("getString")(getString.toJsFn)
    __obj.updateDynamic("setString")(js.Any.fromFunction1((t0: java.lang.String) => setString(t0).runNow()))
    __obj.asInstanceOf[JdbcSQLXML]
  }
}

