package typingsJapgolly.datatablesNetRowgroup.DataTables

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  def rowGroup(): RowGroupApi
}

object Api {
  @scala.inline
  def apply(rowGroup: CallbackTo[RowGroupApi]): Api = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rowGroup")(rowGroup.toJsFn)
    __obj.asInstanceOf[Api]
  }
}

