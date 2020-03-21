package typingsJapgolly.jupyterlabCells.celldragutilsMod.CellDragUtils

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jupyterlabCells.widgetMod.Cell
import typingsJapgolly.phosphorAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/celldragutils", "CellDragUtils.findCell")
@js.native
object findCell extends js.Object {
  /**
    * Find the cell index containing the target html element.
    * This function traces up the DOM hierarchy to find the root cell
    * node. Then find the corresponding child and select it.
    *
    * @param node - the cell node or a child of the cell node.
    * @param cells - an iterable of Cells
    * @param isCellNode - a function that takes in a node and checks if
    * it is a cell node.
    *
    * @returns index of the cell we're looking for. Returns -1 if
    * the cell is not founds
    */
  def apply(
    node: HTMLElement,
    cells: IterableOrArrayLike[Cell],
    isCellNode: js.Function1[/* node */ HTMLElement, Boolean]
  ): Double = js.native
}

