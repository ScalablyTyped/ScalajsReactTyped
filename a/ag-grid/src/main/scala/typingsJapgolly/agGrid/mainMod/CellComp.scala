package typingsJapgolly.agGrid.mainMod

import typingsJapgolly.agGrid.beansMod.Beans
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "CellComp")
@js.native
class CellComp protected ()
  extends typingsJapgolly.agGrid.cellCompMod.CellComp {
  def this(
    scope: js.Any,
    beans: Beans,
    column: typingsJapgolly.agGrid.columnMod.Column,
    rowNode: typingsJapgolly.agGrid.rowNodeMod.RowNode,
    rowComp: typingsJapgolly.agGrid.rowCompMod.RowComp,
    autoHeightCell: Boolean
  ) = this()
}

/* static members */
@JSImport("ag-grid/dist/lib/main", "CellComp")
@js.native
object CellComp extends js.Object {
  var DOM_DATA_KEY_CELL_COMP: String = js.native
}

