package typingsJapgolly.rheostat.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithm extends js.Object {
  def getPosition(value: Double, min: Double, max: Double): Double
  def getValue(pos: Double, min: Double, max: Double): Double
}

object Algorithm {
  @scala.inline
  def apply(
    getPosition: (Double, Double, Double) => CallbackTo[Double],
    getValue: (Double, Double, Double) => CallbackTo[Double]
  ): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPosition")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => getPosition(t0, t1, t2).runNow()))
    __obj.updateDynamic("getValue")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => getValue(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Algorithm]
  }
}

