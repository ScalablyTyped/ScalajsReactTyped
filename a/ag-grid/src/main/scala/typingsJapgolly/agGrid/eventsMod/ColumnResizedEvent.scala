package typingsJapgolly.agGrid.eventsMod

import typingsJapgolly.agGrid.columnApiMod.ColumnApi
import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizedEvent extends ColumnEvent {
  var finished: Boolean
}

object ColumnResizedEvent {
  @scala.inline
  def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    columns: js.Array[Column],
    finished: Boolean,
    source: ColumnEventType,
    `type`: String
  ): ColumnResizedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnResizedEvent]
  }
}

