package typingsJapgolly.jupyterlabNotebook.tokensMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsJapgolly.jupyterlabCells.mod.Cell
import typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel
import typingsJapgolly.phosphorCoreutils.mod.Token
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotebookTracker extends IWidgetTracker[NotebookPanel] {
  /**
    * The currently focused cell.
    *
    * #### Notes
    * If there is no cell with the focus, then this value is `null`.
    */
  val activeCell: Cell
  /**
    * A signal emitted when the current active cell changes.
    *
    * #### Notes
    * If there is no cell with the focus, then `null` will be emitted.
    */
  val activeCellChanged: ISignal[this.type, Cell]
  /**
    * A signal emitted when the selection state changes.
    */
  val selectionChanged: ISignal[this.type, Unit]
}

@JSImport("@jupyterlab/notebook/lib/tokens", "INotebookTracker")
@js.native
object INotebookTracker extends TopLevel[Token[INotebookTracker]]

