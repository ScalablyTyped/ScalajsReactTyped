package typingsJapgolly.jupyterlabNotebook.tokensMod

import typingsJapgolly.jupyterlabCells.mod.Cell
import typingsJapgolly.jupyterlabNotebook.notebooktoolsMod.NotebookTools.IAddOptions
import typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotebookTools_ extends Widget {
  var activeCell: Cell | Null = js.native
  var activeNotebookPanel: NotebookPanel | Null = js.native
  var selectedCells: js.Array[Cell] = js.native
  def addItem(options: IAddOptions): Unit = js.native
}

