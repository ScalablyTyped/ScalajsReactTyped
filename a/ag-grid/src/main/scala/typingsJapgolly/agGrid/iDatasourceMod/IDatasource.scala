package typingsJapgolly.agGrid.iDatasourceMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatasource extends js.Object {
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** If you know up front how many rows are in the dataset, set it here. Otherwise leave blank.*/
  var rowCount: js.UndefOr[Double] = js.undefined
  /** Callback the grid calls that you implement to fetch rows from the server. See below for params.*/
  def getRows(params: IGetRowsParams): Unit
}

object IDatasource {
  @scala.inline
  def apply(
    getRows: IGetRowsParams => Callback,
    destroy: js.UndefOr[Callback] = js.undefined,
    rowCount: Int | Double = null
  ): IDatasource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRows")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.iDatasourceMod.IGetRowsParams) => getRows(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatasource]
  }
}

