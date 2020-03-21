package typingsJapgolly.agGrid.iViewportDatasourceMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewportDatasource extends js.Object {
  /** Gets called once when viewPort is no longer used. If you need to do any cleanup, do it here. */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Gets called exactly once before viewPort is used. Passes methods to be used to tell viewPort of data loads / changes. */
  def init(params: IViewportDatasourceParams): Unit
  /** Tell the viewport what the scroll position of the grid is, so it knows what rows it has to get */
  def setViewportRange(firstRow: Double, lastRow: Double): Unit
}

object IViewportDatasource {
  @scala.inline
  def apply(
    init: IViewportDatasourceParams => Callback,
    setViewportRange: (Double, Double) => Callback,
    destroy: js.UndefOr[Callback] = js.undefined
  ): IViewportDatasource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.iViewportDatasourceMod.IViewportDatasourceParams) => init(t0).runNow()))
    __obj.updateDynamic("setViewportRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setViewportRange(t0, t1).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    __obj.asInstanceOf[IViewportDatasource]
  }
}

