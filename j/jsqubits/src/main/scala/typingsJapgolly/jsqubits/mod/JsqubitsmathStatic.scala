package typingsJapgolly.jsqubits.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsqubitsmathStatic extends js.Object {
  def continuedFraction(targetValue: Double, precision: Double): ContinuedFractionResult
  def findNullSpaceMod2(a: js.Array[js.Array[Double]], width: js.Array[Double]): js.Array[Double]
  def gcd(a: Double, b: Double): Double
  def lcm(a: Double, b: Double): Double
  def powerFactor(n: Double): Double
  def powerMod(x: Double, y: Double, m: Double): Double
}

object JsqubitsmathStatic {
  @scala.inline
  def apply(
    continuedFraction: (Double, Double) => CallbackTo[ContinuedFractionResult],
    findNullSpaceMod2: (js.Array[js.Array[Double]], js.Array[Double]) => CallbackTo[js.Array[Double]],
    gcd: (Double, Double) => CallbackTo[Double],
    lcm: (Double, Double) => CallbackTo[Double],
    powerFactor: Double => CallbackTo[Double],
    powerMod: (Double, Double, Double) => CallbackTo[Double]
  ): JsqubitsmathStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("continuedFraction")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => continuedFraction(t0, t1).runNow()))
    __obj.updateDynamic("findNullSpaceMod2")(js.Any.fromFunction2((t0: js.Array[js.Array[scala.Double]], t1: js.Array[scala.Double]) => findNullSpaceMod2(t0, t1).runNow()))
    __obj.updateDynamic("gcd")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => gcd(t0, t1).runNow()))
    __obj.updateDynamic("lcm")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => lcm(t0, t1).runNow()))
    __obj.updateDynamic("powerFactor")(js.Any.fromFunction1((t0: scala.Double) => powerFactor(t0).runNow()))
    __obj.updateDynamic("powerMod")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => powerMod(t0, t1, t2).runNow()))
    __obj.asInstanceOf[JsqubitsmathStatic]
  }
}

