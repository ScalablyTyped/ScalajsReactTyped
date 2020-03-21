package typingsJapgolly.datatablesNetSelect.DataTables

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowMethods extends js.Object {
  /**
    * Deselect a row
    */
  def deselect(): Api
  /**
    * Select a row
    */
  def select(): Api
}

object RowMethods {
  @scala.inline
  def apply(deselect: CallbackTo[Api], select: CallbackTo[Api]): RowMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deselect")(deselect.toJsFn)
    __obj.updateDynamic("select")(select.toJsFn)
    __obj.asInstanceOf[RowMethods]
  }
}

