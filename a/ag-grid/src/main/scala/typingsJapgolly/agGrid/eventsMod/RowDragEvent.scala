package typingsJapgolly.agGrid.eventsMod

import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.agGrid.columnApiMod.ColumnApi
import typingsJapgolly.agGrid.gridApiMod.GridApi
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDragEvent extends AgGridEvent {
  var event: MouseEvent
  var node: RowNode
  var overIndex: Double
  var overNode: RowNode
  var vDirection: String
  var y: Double
}

object RowDragEvent {
  @scala.inline
  def apply(
    api: GridApi,
    columnApi: ColumnApi,
    event: MouseEvent,
    node: RowNode,
    overIndex: Double,
    overNode: RowNode,
    `type`: String,
    vDirection: String,
    y: Double
  ): RowDragEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], overIndex = overIndex.asInstanceOf[js.Any], overNode = overNode.asInstanceOf[js.Any], vDirection = vDirection.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDragEvent]
  }
}

