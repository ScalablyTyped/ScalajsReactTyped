package typingsJapgolly.nodeMysqlWrapper.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICriteriaParts extends js.Object {
  var noDatabaseProperties: js.Array[String]
  var rawCriteriaObject: js.Any
  var tables: js.Array[TableToSearchPart]
  var whereClause: String
  def selectFromClause[T](_table: Table[T]): String
}

object ICriteriaParts {
  @scala.inline
  def apply(
    noDatabaseProperties: js.Array[String],
    rawCriteriaObject: js.Any,
    selectFromClause: Table[js.Any] => CallbackTo[String],
    tables: js.Array[TableToSearchPart],
    whereClause: String
  ): ICriteriaParts = {
    val __obj = js.Dynamic.literal(noDatabaseProperties = noDatabaseProperties.asInstanceOf[js.Any], rawCriteriaObject = rawCriteriaObject.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any], whereClause = whereClause.asInstanceOf[js.Any])
    __obj.updateDynamic("selectFromClause")(js.Any.fromFunction1((t0: typingsJapgolly.nodeMysqlWrapper.mod.Table[js.Any]) => selectFromClause(t0).runNow()))
    __obj.asInstanceOf[ICriteriaParts]
  }
}

