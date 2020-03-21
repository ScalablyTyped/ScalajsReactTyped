package typingsJapgolly.jupyterlabCells.widgetMod.Cell

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCells.headerfooterMod.ICellFooter
import typingsJapgolly.jupyterlabCells.headerfooterMod.ICellHeader
import typingsJapgolly.jupyterlabCells.inputareaMod.IInputPrompt
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The factory object for customizable cell children.
  *
  * This is used to allow users of cells to customize child content.
  *
  * This inherits from `OutputArea.IContentFactory` to avoid needless nesting and
  * provide a single factory object for all notebook/cell/outputarea related
  * widgets.
  */
trait IContentFactory
  extends typingsJapgolly.jupyterlabOutputarea.widgetMod.OutputArea.IContentFactory
     with typingsJapgolly.jupyterlabCells.inputareaMod.InputArea.IContentFactory {
  /**
    * Create a new cell header for the parent widget.
    */
  def createCellFooter(): ICellFooter
  /**
    * Create a new cell header for the parent widget.
    */
  def createCellHeader(): ICellHeader
}

object IContentFactory {
  @scala.inline
  def apply(
    createCellFooter: CallbackTo[ICellFooter],
    createCellHeader: CallbackTo[ICellHeader],
    createInputPrompt: CallbackTo[IInputPrompt],
    createOutputPrompt: CallbackTo[IOutputPrompt],
    createStdin: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions => CallbackTo[IStdin],
    editorFactory: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => CallbackTo[IEditor]
  ): IContentFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createCellFooter")(createCellFooter.toJsFn)
    __obj.updateDynamic("createCellHeader")(createCellHeader.toJsFn)
    __obj.updateDynamic("createInputPrompt")(createInputPrompt.toJsFn)
    __obj.updateDynamic("createOutputPrompt")(createOutputPrompt.toJsFn)
    __obj.updateDynamic("createStdin")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions) => createStdin(t0).runNow()))
    __obj.updateDynamic("editorFactory")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions) => editorFactory(t0).runNow()))
    __obj.asInstanceOf[IContentFactory]
  }
}

