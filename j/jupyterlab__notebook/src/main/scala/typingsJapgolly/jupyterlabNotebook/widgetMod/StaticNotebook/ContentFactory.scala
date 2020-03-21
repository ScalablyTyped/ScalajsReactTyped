package typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook

import typingsJapgolly.jupyterlabCells.headerfooterMod.ICellFooter
import typingsJapgolly.jupyterlabCells.headerfooterMod.ICellHeader
import typingsJapgolly.jupyterlabCells.inputareaMod.IInputPrompt
import typingsJapgolly.jupyterlabCells.mod.CodeCell
import typingsJapgolly.jupyterlabCells.mod.MarkdownCell
import typingsJapgolly.jupyterlabCells.mod.RawCell
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IContentFactory`.
  */
@JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.ContentFactory")
@js.native
class ContentFactory ()
  extends typingsJapgolly.jupyterlabCells.mod.Cell.ContentFactory
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
  override def createCodeCell(
    options: typingsJapgolly.jupyterlabCells.widgetMod.CodeCell.IOptions,
    parent: typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook
  ): CodeCell = js.native
  /**
    * Create an input prompt.
    */
  /* InferMemberOverrides */
  override def createInputPrompt(): IInputPrompt = js.native
  /**
    * Create a new markdown cell widget.
    */
  /* CompleteClass */
  override def createMarkdownCell(
    options: typingsJapgolly.jupyterlabCells.widgetMod.MarkdownCell.IOptions,
    parent: typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook
  ): MarkdownCell = js.native
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
  override def createRawCell(
    options: typingsJapgolly.jupyterlabCells.widgetMod.RawCell.IOptions,
    parent: typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook
  ): RawCell = js.native
  /**
    * Create an stdin widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createStdin(options: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin = js.native
}

/**
  * A namespace for the staic notebook content factory.
  */
@JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.ContentFactory")
@js.native
object ContentFactory extends js.Object {
  /**
    * Options for the content factory.
    */
  type IOptions = typingsJapgolly.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions
}

