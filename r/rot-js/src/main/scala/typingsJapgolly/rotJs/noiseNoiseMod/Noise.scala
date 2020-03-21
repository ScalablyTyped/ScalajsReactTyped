package typingsJapgolly.rotJs.noiseNoiseMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Noise extends js.Object {
  def get(x: Double, y: Double): Double
}

object Noise {
  @scala.inline
  def apply(get: (Double, Double) => CallbackTo[Double]): Noise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => get(t0, t1).runNow()))
    __obj.asInstanceOf[Noise]
  }
}

