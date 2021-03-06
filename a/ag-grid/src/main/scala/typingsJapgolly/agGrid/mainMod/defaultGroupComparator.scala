package typingsJapgolly.agGrid.mainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "defaultGroupComparator")
@js.native
object defaultGroupComparator extends js.Object {
  def apply(
    valueA: js.Any,
    valueB: js.Any,
    nodeA: typingsJapgolly.agGrid.rowNodeMod.RowNode,
    nodeB: typingsJapgolly.agGrid.rowNodeMod.RowNode
  ): Double = js.native
  def apply(
    valueA: js.Any,
    valueB: js.Any,
    nodeA: typingsJapgolly.agGrid.rowNodeMod.RowNode,
    nodeB: typingsJapgolly.agGrid.rowNodeMod.RowNode,
    accentedCompare: Boolean
  ): Double = js.native
}

