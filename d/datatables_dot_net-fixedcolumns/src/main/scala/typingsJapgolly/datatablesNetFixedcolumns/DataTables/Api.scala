package typingsJapgolly.datatablesNetFixedcolumns.DataTables

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  /*
    * Get FixedColumns Api
    */
  def fixedColumns(): FixedColumnsMethods
}

object Api {
  @scala.inline
  def apply(fixedColumns: CallbackTo[FixedColumnsMethods]): Api = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fixedColumns")(fixedColumns.toJsFn)
    __obj.asInstanceOf[Api]
  }
}

