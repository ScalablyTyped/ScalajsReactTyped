package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalBodyInterface[TRow /* <: js.Object */] extends js.Object {
  /**
  	 * The required getFieldValue method that must be implemented on a customized insert modal body that returns the
  	 * new row data when the save button is clicked in the modal window.
  	 */
  def getFieldValue(): TRow
}

object ModalBodyInterface {
  @scala.inline
  def apply[TRow /* <: js.Object */](getFieldValue: CallbackTo[TRow]): ModalBodyInterface[TRow] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFieldValue")(getFieldValue.toJsFn)
    __obj.asInstanceOf[ModalBodyInterface[TRow]]
  }
}

