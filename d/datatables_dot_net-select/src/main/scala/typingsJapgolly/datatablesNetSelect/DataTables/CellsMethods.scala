package typingsJapgolly.datatablesNetSelect.DataTables

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellsMethods extends js.Object {
  /**
    * Deselect cells
    */
  def deselect(): Api
  /**
    * Select multiple cells
    */
  def select(): Api
}

object CellsMethods {
  @scala.inline
  def apply(deselect: CallbackTo[Api], select: CallbackTo[Api]): CellsMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deselect")(deselect.toJsFn)
    __obj.updateDynamic("select")(select.toJsFn)
    __obj.asInstanceOf[CellsMethods]
  }
}

