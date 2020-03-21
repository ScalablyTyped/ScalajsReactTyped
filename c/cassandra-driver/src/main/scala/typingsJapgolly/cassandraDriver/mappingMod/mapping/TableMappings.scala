package typingsJapgolly.cassandraDriver.mappingMod.mapping

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableMappings extends js.Object {
  def getColumnName(propName: String): String
  def getPropertyName(columnName: String): String
  def newObjectInstance(): js.Any
}

object TableMappings {
  @scala.inline
  def apply(
    getColumnName: String => CallbackTo[String],
    getPropertyName: String => CallbackTo[String],
    newObjectInstance: CallbackTo[js.Any]
  ): TableMappings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColumnName")(js.Any.fromFunction1((t0: java.lang.String) => getColumnName(t0).runNow()))
    __obj.updateDynamic("getPropertyName")(js.Any.fromFunction1((t0: java.lang.String) => getPropertyName(t0).runNow()))
    __obj.updateDynamic("newObjectInstance")(newObjectInstance.toJsFn)
    __obj.asInstanceOf[TableMappings]
  }
}

