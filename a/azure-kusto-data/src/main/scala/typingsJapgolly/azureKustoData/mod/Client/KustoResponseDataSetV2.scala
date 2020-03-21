package typingsJapgolly.azureKustoData.mod.Client

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KustoResponseDataSetV2[T] extends KustoResponseDataSet[T] {
  var version: String
  def getCridColumn(): String
  def getErrorColumn(): String
  def getStatusColumn(): String
}

object KustoResponseDataSetV2 {
  @scala.inline
  def apply[T](
    getCridColumn: CallbackTo[String],
    getErrorColumn: CallbackTo[String],
    getStatusColumn: CallbackTo[String],
    primaryResults: js.Array[KustoResultTable[T]],
    statusTable: KustoResultTable[T],
    tableNames: js.Array[String],
    tables: js.Array[KustoResultTable[T]],
    version: String
  ): KustoResponseDataSetV2[T] = {
    val __obj = js.Dynamic.literal(primaryResults = primaryResults.asInstanceOf[js.Any], statusTable = statusTable.asInstanceOf[js.Any], tableNames = tableNames.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("getCridColumn")(getCridColumn.toJsFn)
    __obj.updateDynamic("getErrorColumn")(getErrorColumn.toJsFn)
    __obj.updateDynamic("getStatusColumn")(getStatusColumn.toJsFn)
    __obj.asInstanceOf[KustoResponseDataSetV2[T]]
  }
}

