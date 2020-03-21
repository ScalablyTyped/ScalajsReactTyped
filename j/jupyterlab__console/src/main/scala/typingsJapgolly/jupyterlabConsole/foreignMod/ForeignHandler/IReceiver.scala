package typingsJapgolly.jupyterlabConsole.foreignMod.ForeignHandler

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCells.mod.CodeCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A receiver of newly created foreign cells.
  */
trait IReceiver extends js.Object {
  /**
    * Add a newly created cell.
    */
  def addCell(cell: CodeCell, msgId: String): Unit
  /**
    * Create a cell.
    */
  def createCodeCell(): CodeCell
  /**
    * Get a cell associated with a message id.
    */
  def getCell(msgId: String): CodeCell
  /**
    * Trigger a rendering update on the receiver.
    */
  def update(): Unit
}

object IReceiver {
  @scala.inline
  def apply(
    addCell: (CodeCell, String) => Callback,
    createCodeCell: CallbackTo[CodeCell],
    getCell: String => CallbackTo[CodeCell],
    update: Callback
  ): IReceiver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addCell")(js.Any.fromFunction2((t0: typingsJapgolly.jupyterlabCells.mod.CodeCell, t1: java.lang.String) => addCell(t0, t1).runNow()))
    __obj.updateDynamic("createCodeCell")(createCodeCell.toJsFn)
    __obj.updateDynamic("getCell")(js.Any.fromFunction1((t0: java.lang.String) => getCell(t0).runNow()))
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[IReceiver]
  }
}

