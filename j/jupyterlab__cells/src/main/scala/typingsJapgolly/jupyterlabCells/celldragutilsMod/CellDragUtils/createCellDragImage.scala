package typingsJapgolly.jupyterlabCells.celldragutilsMod.CellDragUtils

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jupyterlabCells.widgetMod.Cell
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.ICell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/celldragutils", "CellDragUtils.createCellDragImage")
@js.native
object createCellDragImage extends js.Object {
  /**
    * Create an image for the cell(s) to be dragged
    *
    * @param activeCell - The cell from where the drag event is triggered
    * @param selectedCells - The cells to be dragged
    */
  def apply(activeCell: Cell, selectedCells: js.Array[ICell]): HTMLElement = js.native
}

