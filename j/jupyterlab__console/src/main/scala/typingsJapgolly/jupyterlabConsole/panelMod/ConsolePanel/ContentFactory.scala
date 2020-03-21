package typingsJapgolly.jupyterlabConsole.panelMod.ConsolePanel

import typingsJapgolly.jupyterlabCells.headerfooterMod.ICellFooter
import typingsJapgolly.jupyterlabCells.headerfooterMod.ICellHeader
import typingsJapgolly.jupyterlabCells.inputareaMod.IInputPrompt
import typingsJapgolly.jupyterlabCells.mod.CodeCell
import typingsJapgolly.jupyterlabCells.mod.RawCell
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default implementation of `IContentFactory`.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.ContentFactory")
@js.native
class ContentFactory ()
  extends typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole.ContentFactory
     with IContentFactory {
  /**
    * The editor factory we need to include in `CodeEditorWratter.IOptions`.
    *
    * This is a separate readonly attribute rather than a factory method as we need
    * to pass it around.
    */
  /* InferMemberOverrides */
  override val editorFactory: Factory = js.native
  /**
    * Create a new cell header for the parent widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createCellFooter(): ICellFooter = js.native
  /**
    * Create a new cell header for the parent widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createCellHeader(): ICellHeader = js.native
  /**
    * Create a new code cell widget.
    */
  /* CompleteClass */
  override def createCodeCell(options: typingsJapgolly.jupyterlabCells.widgetMod.CodeCell.IOptions): CodeCell = js.native
  /**
    * Create a new console panel.
    */
  /* CompleteClass */
  override def createConsole(options: typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole.IOptions): CodeConsole = js.native
  /**
    * Create an input prompt.
    */
  /* InferMemberOverrides */
  override def createInputPrompt(): IInputPrompt = js.native
  /**
    * Create an output prompt.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createOutputPrompt(): IOutputPrompt = js.native
  /**
    * Create a new raw cell widget.
    */
  /* CompleteClass */
  override def createRawCell(options: typingsJapgolly.jupyterlabCells.widgetMod.RawCell.IOptions): RawCell = js.native
  /**
    * Create an stdin widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createStdin(options: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin = js.native
}

/**
  * A namespace for the console panel content factory.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.ContentFactory")
@js.native
object ContentFactory extends js.Object {
  /**
    * Options for the code console content factory.
    */
  type IOptions = typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole.ContentFactory.IOptions
}

