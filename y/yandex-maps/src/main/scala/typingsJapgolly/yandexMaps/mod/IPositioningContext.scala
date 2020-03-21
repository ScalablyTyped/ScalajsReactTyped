package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositioningContext extends js.Object {
  def fromClientPixels(clientPixelPoint: js.Array[Double]): js.Array[Double]
  def getZoom(): Double
  def toClientPixels(globalPixelPoint: js.Array[Double]): js.Array[Double]
}

object IPositioningContext {
  @scala.inline
  def apply(
    fromClientPixels: js.Array[Double] => CallbackTo[js.Array[Double]],
    getZoom: CallbackTo[Double],
    toClientPixels: js.Array[Double] => CallbackTo[js.Array[Double]]
  ): IPositioningContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromClientPixels")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => fromClientPixels(t0).runNow()))
    __obj.updateDynamic("getZoom")(getZoom.toJsFn)
    __obj.updateDynamic("toClientPixels")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => toClientPixels(t0).runNow()))
    __obj.asInstanceOf[IPositioningContext]
  }
}

