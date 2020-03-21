package typingsJapgolly.datatablesNetFixedcolumns.DataTables

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowsMethods extends js.Object {
  /*
    * Recalculate the height of one or more rows after a data change
    */
  def recalcHeight(): Api
}

object RowsMethods {
  @scala.inline
  def apply(recalcHeight: CallbackTo[Api]): RowsMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("recalcHeight")(recalcHeight.toJsFn)
    __obj.asInstanceOf[RowsMethods]
  }
}

