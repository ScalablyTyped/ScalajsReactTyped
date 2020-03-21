package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICursorStateComputerData extends js.Object {
  /**
    * Get the inverse edit operations of the added edit operations.
    */
  def getInverseEditOperations(): js.Array[IIdentifiedSingleEditOperation]
  /**
    * Get a previously tracked selection.
    * @param id The unique identifier returned by `trackSelection`.
    * @return The selection.
    */
  def getTrackedSelection(id: String): Selection
}

object ICursorStateComputerData {
  @scala.inline
  def apply(
    getInverseEditOperations: CallbackTo[js.Array[IIdentifiedSingleEditOperation]],
    getTrackedSelection: String => CallbackTo[Selection]
  ): ICursorStateComputerData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInverseEditOperations")(getInverseEditOperations.toJsFn)
    __obj.updateDynamic("getTrackedSelection")(js.Any.fromFunction1((t0: java.lang.String) => getTrackedSelection(t0).runNow()))
    __obj.asInstanceOf[ICursorStateComputerData]
  }
}

