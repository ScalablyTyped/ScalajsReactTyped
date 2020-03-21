package typingsJapgolly.jupyterlabCells.inputareaMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jupyterlabCells.inputareaMod.InputArea.IContentFactory
import typingsJapgolly.jupyterlabCells.inputareaMod.InputArea.IOptions
import typingsJapgolly.jupyterlabCells.modelMod.ICellModel
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabCodeeditor.mod.CodeEditorWrapper
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/inputarea", "InputArea")
@js.native
class InputArea_ protected () extends Widget {
  /**
    * Construct an input area widget.
    */
  def this(options: IOptions) = this()
  var _editor: js.Any = js.native
  var _prompt: js.Any = js.native
  var _rendered: js.Any = js.native
  /**
    * The content factory used by the widget.
    */
  val contentFactory: IContentFactory = js.native
  /**
    * Get the CodeEditor used by the cell.
    */
  val editor: IEditor = js.native
  /**
    * Get the CodeEditorWrapper used by the cell.
    */
  val editorWidget: CodeEditorWrapper = js.native
  /**
    * The model used by the widget.
    */
  val model: ICellModel = js.native
  /**
    * Get the prompt node used by the cell.
    */
  val promptNode: HTMLElement = js.native
  /**
    * Render an input instead of the text editor.
    */
  def renderInput(widget: Widget): Unit = js.native
  /**
    * Set the prompt of the input area.
    */
  def setPrompt(value: String): Unit = js.native
  /**
    * Show the text editor.
    */
  def showEditor(): Unit = js.native
}

