package typingsJapgolly.parkMiller.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParkMiller extends js.Object {
  def boolean(): Boolean
  def float(): Double
  def floatInRange(min: Double, max: Double): Double
  def integer(): Double
  def integerInRange(min: Double, max: Double): Double
}

object ParkMiller {
  @scala.inline
  def apply(
    boolean: CallbackTo[Boolean],
    float: CallbackTo[Double],
    floatInRange: (Double, Double) => CallbackTo[Double],
    integer: CallbackTo[Double],
    integerInRange: (Double, Double) => CallbackTo[Double]
  ): ParkMiller = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boolean")(boolean.toJsFn)
    __obj.updateDynamic("float")(float.toJsFn)
    __obj.updateDynamic("floatInRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => floatInRange(t0, t1).runNow()))
    __obj.updateDynamic("integer")(integer.toJsFn)
    __obj.updateDynamic("integerInRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => integerInRange(t0, t1).runNow()))
    __obj.asInstanceOf[ParkMiller]
  }
}

