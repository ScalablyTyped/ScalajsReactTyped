package typingsJapgolly.agGrid.dragAndDropServiceMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragItem extends js.Object {
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  var rowNode: js.UndefOr[RowNode] = js.undefined
  var visibleState: js.UndefOr[StringDictionary[Boolean]] = js.undefined
}

object DragItem {
  @scala.inline
  def apply(
    columns: js.Array[Column] = null,
    rowNode: RowNode = null,
    visibleState: StringDictionary[Boolean] = null
  ): DragItem = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (rowNode != null) __obj.updateDynamic("rowNode")(rowNode.asInstanceOf[js.Any])
    if (visibleState != null) __obj.updateDynamic("visibleState")(visibleState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragItem]
  }
}

