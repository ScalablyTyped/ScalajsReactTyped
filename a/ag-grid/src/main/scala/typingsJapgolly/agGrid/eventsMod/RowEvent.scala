package typingsJapgolly.agGrid.eventsMod

import typingsJapgolly.agGrid.columnApiMod.ColumnApi
import typingsJapgolly.agGrid.gridApiMod.GridApi
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowEvent extends AgGridEvent {
  var context: js.Any
  var data: js.Any
  var event: js.UndefOr[Event_] = js.undefined
  var node: RowNode
  var rowIndex: Double
  var rowPinned: String
}

object RowEvent {
  @scala.inline
  def apply(
    api: GridApi,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    node: RowNode,
    rowIndex: Double,
    rowPinned: String,
    `type`: String,
    event: Event_ = null
  ): RowEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowPinned = rowPinned.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowEvent]
  }
}

