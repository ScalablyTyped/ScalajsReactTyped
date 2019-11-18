package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjection extends js.Object {
  def fromGlobalPixels(globalPixelPoint: js.Array[Double], zoom: Double): js.Array[Double]
  def getCoordSystem(): ICoordSystem
  def isCycled(): js.Array[Boolean]
  def toGlobalPixels(coordPoint: js.Array[Double], zoom: Double): js.Array[Double]
}

object IProjection {
  @scala.inline
  def apply(
    fromGlobalPixels: (js.Array[Double], Double) => CallbackTo[js.Array[Double]],
    getCoordSystem: CallbackTo[ICoordSystem],
    isCycled: CallbackTo[js.Array[Boolean]],
    toGlobalPixels: (js.Array[Double], Double) => CallbackTo[js.Array[Double]]
  ): IProjection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromGlobalPixels")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: scala.Double) => fromGlobalPixels(t0, t1).runNow()))
    __obj.updateDynamic("getCoordSystem")(getCoordSystem.toJsFn)
    __obj.updateDynamic("isCycled")(isCycled.toJsFn)
    __obj.updateDynamic("toGlobalPixels")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: scala.Double) => toGlobalPixels(t0, t1).runNow()))
    __obj.asInstanceOf[IProjection]
  }
}

