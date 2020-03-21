package typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCells.headerfooterMod.ICellFooter
import typingsJapgolly.jupyterlabCells.headerfooterMod.ICellHeader
import typingsJapgolly.jupyterlabCells.inputareaMod.IInputPrompt
import typingsJapgolly.jupyterlabCells.mod.CodeCell
import typingsJapgolly.jupyterlabCells.mod.MarkdownCell
import typingsJapgolly.jupyterlabCells.mod.RawCell
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating notebook content.
  *
  * #### Notes
  * This extends the content factory of the cell itself, which extends the content
  * factory of the output area and input area. The result is that there is a single
  * factory for creating all child content of a notebook.
  */
trait IContentFactory
  extends typingsJapgolly.jupyterlabCells.widgetMod.Cell.IContentFactory {
  /**
    * Create a new code cell widget.
    */
  def createCodeCell(
    options: typingsJapgolly.jupyterlabCells.widgetMod.CodeCell.IOptions,
    parent: typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook
  ): CodeCell
  /**
    * Create a new markdown cell widget.
    */
  def createMarkdownCell(
    options: typingsJapgolly.jupyterlabCells.widgetMod.MarkdownCell.IOptions,
    parent: typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook
  ): MarkdownCell
  /**
    * Create a new raw cell widget.
    */
  def createRawCell(
    options: typingsJapgolly.jupyterlabCells.widgetMod.RawCell.IOptions,
    parent: typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook
  ): RawCell
}

object IContentFactory {
  @scala.inline
  def apply(
    createCellFooter: CallbackTo[ICellFooter],
    createCellHeader: CallbackTo[ICellHeader],
    createCodeCell: (typingsJapgolly.jupyterlabCells.widgetMod.CodeCell.IOptions, typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook) => CallbackTo[CodeCell],
    createInputPrompt: CallbackTo[IInputPrompt],
    createMarkdownCell: (typingsJapgolly.jupyterlabCells.widgetMod.MarkdownCell.IOptions, typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook) => CallbackTo[MarkdownCell],
    createOutputPrompt: CallbackTo[IOutputPrompt],
    createRawCell: (typingsJapgolly.jupyterlabCells.widgetMod.RawCell.IOptions, typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook) => CallbackTo[RawCell],
    createStdin: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions => CallbackTo[IStdin],
    editorFactory: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => CallbackTo[IEditor]
  ): IContentFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createCellFooter")(createCellFooter.toJsFn)
    __obj.updateDynamic("createCellHeader")(createCellHeader.toJsFn)
    __obj.updateDynamic("createCodeCell")(js.Any.fromFunction2((t0: typingsJapgolly.jupyterlabCells.widgetMod.CodeCell.IOptions, t1: typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook) => createCodeCell(t0, t1).runNow()))
    __obj.updateDynamic("createInputPrompt")(createInputPrompt.toJsFn)
    __obj.updateDynamic("createMarkdownCell")(js.Any.fromFunction2((t0: typingsJapgolly.jupyterlabCells.widgetMod.MarkdownCell.IOptions, t1: typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook) => createMarkdownCell(t0, t1).runNow()))
    __obj.updateDynamic("createOutputPrompt")(createOutputPrompt.toJsFn)
    __obj.updateDynamic("createRawCell")(js.Any.fromFunction2((t0: typingsJapgolly.jupyterlabCells.widgetMod.RawCell.IOptions, t1: typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook) => createRawCell(t0, t1).runNow()))
    __obj.updateDynamic("createStdin")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions) => createStdin(t0).runNow()))
    __obj.updateDynamic("editorFactory")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions) => editorFactory(t0).runNow()))
    __obj.asInstanceOf[IContentFactory]
  }
}

