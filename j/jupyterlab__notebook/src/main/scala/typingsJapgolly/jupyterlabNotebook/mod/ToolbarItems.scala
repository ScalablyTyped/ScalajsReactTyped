package typingsJapgolly.jupyterlabNotebook.mod

import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IToolbarItem
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "ToolbarItems")
@js.native
object ToolbarItems extends js.Object {
  /**
    * Create a cell type switcher item.
    *
    * #### Notes
    * It will display the type of the current active cell.
    * If more than one cell is selected but are of different types,
    * it will display `'-'`.
    * When the user changes the cell type, it will change the
    * cell types of the selected cells.
    * It can handle a change to the context.
    */
  def createCellTypeItem(panel: typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Create a copy toolbar item.
    */
  def createCopyButton(panel: typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Create a cut toolbar item.
    */
  def createCutButton(panel: typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Create an insert toolbar item.
    */
  def createInsertButton(panel: typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Create a paste toolbar item.
    */
  def createPasteButton(panel: typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Create a run toolbar item.
    */
  def createRunButton(panel: typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Create save button toolbar item.
    */
  def createSaveButton(panel: typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Get the default toolbar items for panel
    */
  def getDefaultItems(panel: typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel): js.Array[IToolbarItem] = js.native
}

