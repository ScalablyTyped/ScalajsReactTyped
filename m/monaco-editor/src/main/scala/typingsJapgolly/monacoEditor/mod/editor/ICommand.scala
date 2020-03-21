package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommand extends js.Object {
  /**
    * Compute the cursor state after the edit operations were applied.
    * @param model The model the command has executed on.
    * @param helper A helper to get inverse edit operations and to get previously tracked selections.
    * @return The cursor state after the command executed.
    */
  def computeCursorState(model: ITextModel, helper: ICursorStateComputerData): Selection
  /**
    * Get the edit operations needed to execute this command.
    * @param model The model the command will execute on.
    * @param builder A helper to collect the needed edit operations and to track selections.
    */
  def getEditOperations(model: ITextModel, builder: IEditOperationBuilder): Unit
}

object ICommand {
  @scala.inline
  def apply(
    computeCursorState: (ITextModel, ICursorStateComputerData) => CallbackTo[Selection],
    getEditOperations: (ITextModel, IEditOperationBuilder) => Callback
  ): ICommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("computeCursorState")(js.Any.fromFunction2((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.editor.ICursorStateComputerData) => computeCursorState(t0, t1).runNow()))
    __obj.updateDynamic("getEditOperations")(js.Any.fromFunction2((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.editor.IEditOperationBuilder) => getEditOperations(t0, t1).runNow()))
    __obj.asInstanceOf[ICommand]
  }
}

