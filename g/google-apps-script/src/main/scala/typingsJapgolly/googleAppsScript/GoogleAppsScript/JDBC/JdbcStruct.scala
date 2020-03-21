package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Struct. For documentation of this class, see java.sql.Struct
  * .
  */
trait JdbcStruct extends js.Object {
  def getAttributes(): js.Array[_]
  def getSQLTypeName(): String
}

object JdbcStruct {
  @scala.inline
  def apply(getAttributes: CallbackTo[js.Array[js.Any]], getSQLTypeName: CallbackTo[String]): JdbcStruct = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAttributes")(getAttributes.toJsFn)
    __obj.updateDynamic("getSQLTypeName")(getSQLTypeName.toJsFn)
    __obj.asInstanceOf[JdbcStruct]
  }
}

