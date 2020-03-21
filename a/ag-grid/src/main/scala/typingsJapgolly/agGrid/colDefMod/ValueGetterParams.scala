package typingsJapgolly.agGrid.colDefMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.agGrid.columnApiMod.ColumnApi
import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.gridApiMod.GridApi
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueGetterParams extends BaseColDefParams {
  def getValue(field: String): js.Any
}

object ValueGetterParams {
  @scala.inline
  def apply(
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    getValue: String => CallbackTo[js.Any],
    node: RowNode
  ): ValueGetterParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: java.lang.String) => getValue(t0).runNow()))
    __obj.asInstanceOf[ValueGetterParams]
  }
}

