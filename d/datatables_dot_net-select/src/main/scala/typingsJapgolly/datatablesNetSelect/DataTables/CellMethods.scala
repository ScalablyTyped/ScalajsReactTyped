package typingsJapgolly.datatablesNetSelect.DataTables

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMethods extends js.Object {
  /**
    * Deselect a cell
    */
  def deselect(): Api
  /**
    * Select cell
    */
  def select(): Api
}

object CellMethods {
  @scala.inline
  def apply(deselect: CallbackTo[Api], select: CallbackTo[Api]): CellMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deselect")(deselect.toJsFn)
    __obj.updateDynamic("select")(select.toJsFn)
    __obj.asInstanceOf[CellMethods]
  }
}

