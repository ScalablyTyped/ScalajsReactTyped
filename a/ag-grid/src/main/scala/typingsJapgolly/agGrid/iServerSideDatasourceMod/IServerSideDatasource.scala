package typingsJapgolly.agGrid.iServerSideDatasourceMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerSideDatasource extends js.Object {
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  def getRows(params: IServerSideGetRowsParams): Unit
}

object IServerSideDatasource {
  @scala.inline
  def apply(getRows: IServerSideGetRowsParams => Callback, destroy: js.UndefOr[Callback] = js.undefined): IServerSideDatasource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRows")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.iServerSideDatasourceMod.IServerSideGetRowsParams) => getRows(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    __obj.asInstanceOf[IServerSideDatasource]
  }
}

