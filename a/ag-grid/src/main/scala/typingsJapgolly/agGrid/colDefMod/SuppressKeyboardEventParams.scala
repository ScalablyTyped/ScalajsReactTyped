package typingsJapgolly.agGrid.colDefMod

import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.agGrid.columnApiMod.ColumnApi
import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.gridApiMod.GridApi
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuppressKeyboardEventParams extends IsColumnFuncParams {
  var editing: Boolean
  var event: KeyboardEvent
}

object SuppressKeyboardEventParams {
  @scala.inline
  def apply(
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    editing: Boolean,
    event: KeyboardEvent,
    node: RowNode
  ): SuppressKeyboardEventParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuppressKeyboardEventParams]
  }
}

