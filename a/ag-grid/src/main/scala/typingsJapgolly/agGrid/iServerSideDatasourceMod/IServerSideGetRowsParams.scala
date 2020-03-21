package typingsJapgolly.agGrid.iServerSideDatasourceMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerSideGetRowsParams extends js.Object {
  var parentNode: RowNode
  var request: IServerSideGetRowsRequest
  def failCallback(): Unit
  def successCallback(rowsThisPage: js.Array[_], lastRow: Double): Unit
}

object IServerSideGetRowsParams {
  @scala.inline
  def apply(
    failCallback: Callback,
    parentNode: RowNode,
    request: IServerSideGetRowsRequest,
    successCallback: (js.Array[js.Any], Double) => Callback
  ): IServerSideGetRowsParams = {
    val __obj = js.Dynamic.literal(parentNode = parentNode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("failCallback")(failCallback.toJsFn)
    __obj.updateDynamic("successCallback")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: scala.Double) => successCallback(t0, t1).runNow()))
    __obj.asInstanceOf[IServerSideGetRowsParams]
  }
}

