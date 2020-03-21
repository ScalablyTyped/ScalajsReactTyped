package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaTileLevel extends js.Object {
  def getImageSize(): js.Array[Double]
  def getTileUrl(x: Double, y: Double): String
}

object IPanoramaTileLevel {
  @scala.inline
  def apply(getImageSize: CallbackTo[js.Array[Double]], getTileUrl: (Double, Double) => CallbackTo[String]): IPanoramaTileLevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getImageSize")(getImageSize.toJsFn)
    __obj.updateDynamic("getTileUrl")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getTileUrl(t0, t1).runNow()))
    __obj.asInstanceOf[IPanoramaTileLevel]
  }
}

