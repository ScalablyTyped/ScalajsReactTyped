package typingsJapgolly.jupyterlabCells.widgetMod.Cell

import typingsJapgolly.jupyterlabCells.headerfooterMod.ICellFooter
import typingsJapgolly.jupyterlabCells.headerfooterMod.ICellHeader
import typingsJapgolly.jupyterlabCells.inputareaMod.IInputPrompt
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IContentFactory`.
  *
  * This includes a CodeMirror editor factory to make it easy to use out of the box.
  */
@JSImport("@jupyterlab/cells/lib/widget", "Cell.ContentFactory")
@js.native
/**
  * Create a content factory for a cell.
  */
class ContentFactory_ () extends IContentFactory {
  def this(options: typingsJapgolly.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
  var _editorFactory: js.Any = js.native
  /**
    * The editor factory we need to include in `CodeEditorWratter.IOptions`.
    *
    * This is a separate readonly attribute rather than a factory method as we need
    * to pass it around.
    */
  /* CompleteClass */
  override val editorFactory: Factory = js.native
  /**
    * Create a new cell header for the parent widget.
    */
  /* CompleteClass */
  override def createCellFooter(): ICellFooter = js.native
  /**
    * Create a new cell header for the parent widget.
    */
  /* CompleteClass */
  override def createCellHeader(): ICellHeader = js.native
  /**
    * Create an input prompt.
    */
  /* CompleteClass */
  override def createInputPrompt(): IInputPrompt = js.native
  /**
    * Create an output prompt.
    */
  /* CompleteClass */
  override def createOutputPrompt(): IOutputPrompt = js.native
  /**
    * Create an stdin widget.
    */
  /* CompleteClass */
  override def createStdin(options: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin = js.native
}

