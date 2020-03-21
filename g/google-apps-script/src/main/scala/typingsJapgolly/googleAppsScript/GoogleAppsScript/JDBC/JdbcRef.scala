package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Ref. For documentation of this class, see java.sql.Ref.
  */
trait JdbcRef extends js.Object {
  def getBaseTypeName(): String
  def getObject(): js.Any
  def setObject(`object`: js.Any): Unit
}

object JdbcRef {
  @scala.inline
  def apply(getBaseTypeName: CallbackTo[String], getObject: CallbackTo[js.Any], setObject: js.Any => Callback): JdbcRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBaseTypeName")(getBaseTypeName.toJsFn)
    __obj.updateDynamic("getObject")(getObject.toJsFn)
    __obj.updateDynamic("setObject")(js.Any.fromFunction1((t0: js.Any) => setObject(t0).runNow()))
    __obj.asInstanceOf[JdbcRef]
  }
}

