package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Byte
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC RowId. For documentation of this class, see java.sql.RowId
  * .
  */
trait JdbcRowId extends js.Object {
  def getBytes(): js.Array[Byte]
}

object JdbcRowId {
  @scala.inline
  def apply(getBytes: CallbackTo[js.Array[Byte]]): JdbcRowId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBytes")(getBytes.toJsFn)
    __obj.asInstanceOf[JdbcRowId]
  }
}

