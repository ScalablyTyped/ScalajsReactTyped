package typingsJapgolly.gdal.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterBandOverviews extends js.Object {
  def count(): Double
  def forEach(callback: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit]): Unit
  def get(index: Double): RasterBand
  def getBySampleCount(samples: Double): RasterBand
  def map[T](callback: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, T]): js.Array[T]
}

object RasterBandOverviews {
  @scala.inline
  def apply(
    count: CallbackTo[Double],
    forEach: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit] => Callback,
    get: Double => CallbackTo[RasterBand],
    getBySampleCount: Double => CallbackTo[RasterBand],
    map: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, js.Any] => CallbackTo[js.Array[js.Any]]
  ): RasterBandOverviews = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function2[
  /* overviewBand */ typingsJapgolly.gdal.mod.RasterBand, 
  /* i */ scala.Double, 
  scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("getBySampleCount")(js.Any.fromFunction1((t0: scala.Double) => getBySampleCount(t0).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: js.Function2[/* overviewBand */ typingsJapgolly.gdal.mod.RasterBand, /* i */ scala.Double, js.Any]) => map(t0).runNow()))
    __obj.asInstanceOf[RasterBandOverviews]
  }
}

