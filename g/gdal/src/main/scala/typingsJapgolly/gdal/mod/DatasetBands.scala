package typingsJapgolly.gdal.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetBands extends js.Object {
  val ds: Dataset
  def count(): Double
  def create(dataType: Double): RasterBand
  def forEach(callback: js.Function2[/* band */ RasterBand, /* i */ Double, Unit]): Unit
  def get(id: Double): RasterBand
  def map[T](callback: js.Function2[/* band */ RasterBand, /* i */ Double, T]): js.Array[T]
}

object DatasetBands {
  @scala.inline
  def apply(
    count: CallbackTo[Double],
    create: Double => CallbackTo[RasterBand],
    ds: Dataset,
    forEach: js.Function2[/* band */ RasterBand, /* i */ Double, Unit] => Callback,
    get: Double => CallbackTo[RasterBand],
    map: js.Function2[/* band */ RasterBand, /* i */ Double, js.Any] => CallbackTo[js.Array[js.Any]]
  ): DatasetBands = {
    val __obj = js.Dynamic.literal(ds = ds.asInstanceOf[js.Any])
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: scala.Double) => create(t0).runNow()))
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function2[/* band */ typingsJapgolly.gdal.mod.RasterBand, /* i */ scala.Double, scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: js.Function2[/* band */ typingsJapgolly.gdal.mod.RasterBand, /* i */ scala.Double, js.Any]) => map(t0).runNow()))
    __obj.asInstanceOf[DatasetBands]
  }
}

