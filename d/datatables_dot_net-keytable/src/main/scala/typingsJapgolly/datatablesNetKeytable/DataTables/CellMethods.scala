package typingsJapgolly.datatablesNetKeytable.DataTables

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMethods extends js.Object {
  /*
    * Focus on a cell
    */
  def focus(): Api
}

object CellMethods {
  @scala.inline
  def apply(focus: CallbackTo[Api]): CellMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[CellMethods]
  }
}

