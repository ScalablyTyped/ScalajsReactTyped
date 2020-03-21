package typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCells.headerfooterMod.ICellFooter
import typingsJapgolly.jupyterlabCells.headerfooterMod.ICellHeader
import typingsJapgolly.jupyterlabCells.inputareaMod.IInputPrompt
import typingsJapgolly.jupyterlabCells.mod.CodeCell
import typingsJapgolly.jupyterlabCells.mod.RawCell
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A content factory for console children.
  */
trait IContentFactory
  extends typingsJapgolly.jupyterlabCells.widgetMod.Cell.IContentFactory {
  /**
    * Create a new code cell widget.
    */
  def createCodeCell(options: typingsJapgolly.jupyterlabCells.widgetMod.CodeCell.IOptions): CodeCell
  /**
    * Create a new raw cell widget.
    */
  def createRawCell(options: typingsJapgolly.jupyterlabCells.widgetMod.RawCell.IOptions): RawCell
}

object IContentFactory {
  @scala.inline
  def apply(
    createCellFooter: CallbackTo[ICellFooter],
    createCellHeader: CallbackTo[ICellHeader],
    createCodeCell: typingsJapgolly.jupyterlabCells.widgetMod.CodeCell.IOptions => CallbackTo[CodeCell],
    createInputPrompt: CallbackTo[IInputPrompt],
    createOutputPrompt: CallbackTo[IOutputPrompt],
    createRawCell: typingsJapgolly.jupyterlabCells.widgetMod.RawCell.IOptions => CallbackTo[RawCell],
    createStdin: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions => CallbackTo[IStdin],
    editorFactory: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => CallbackTo[IEditor]
  ): IContentFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createCellFooter")(createCellFooter.toJsFn)
    __obj.updateDynamic("createCellHeader")(createCellHeader.toJsFn)
    __obj.updateDynamic("createCodeCell")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCells.widgetMod.CodeCell.IOptions) => createCodeCell(t0).runNow()))
    __obj.updateDynamic("createInputPrompt")(createInputPrompt.toJsFn)
    __obj.updateDynamic("createOutputPrompt")(createOutputPrompt.toJsFn)
    __obj.updateDynamic("createRawCell")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCells.widgetMod.RawCell.IOptions) => createRawCell(t0).runNow()))
    __obj.updateDynamic("createStdin")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions) => createStdin(t0).runNow()))
    __obj.updateDynamic("editorFactory")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions) => editorFactory(t0).runNow()))
    __obj.asInstanceOf[IContentFactory]
  }
}

