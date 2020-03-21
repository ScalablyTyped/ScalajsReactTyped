package typingsJapgolly.threeTdsLoader

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofMath extends js.Object {
  val DEG2RAD: Double
  val RAD2DEG: Double
  def ceilPowerOfTwo(value: Double): Double
  def clamp(value: Double, min: Double, max: Double): Double
  def degToRad(degrees: Double): Double
  def euclideanModulo(n: Double, m: Double): Double
  def floorPowerOfTwo(value: Double): Double
  def generateUUID(): String
  def isPowerOfTwo(value: Double): Boolean
  def lerp(x: Double, y: Double, t: Double): Double
  def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double
  def nearestPowerOfTwo(value: Double): Double
  def nextPowerOfTwo(value: Double): Double
  def radToDeg(radians: Double): Double
  def randFloat(low: Double, high: Double): Double
  def randFloatSpread(range: Double): Double
  def randInt(low: Double, high: Double): Double
  def random16(): Double
  def smootherstep(x: Double, min: Double, max: Double): Double
  def smoothstep(x: Double, min: Double, max: Double): Double
}

object TypeofMath {
  @scala.inline
  def apply(
    DEG2RAD: Double,
    RAD2DEG: Double,
    ceilPowerOfTwo: Double => CallbackTo[Double],
    clamp: (Double, Double, Double) => CallbackTo[Double],
    degToRad: Double => CallbackTo[Double],
    euclideanModulo: (Double, Double) => CallbackTo[Double],
    floorPowerOfTwo: Double => CallbackTo[Double],
    generateUUID: CallbackTo[String],
    isPowerOfTwo: Double => CallbackTo[Boolean],
    lerp: (Double, Double, Double) => CallbackTo[Double],
    mapLinear: (Double, Double, Double, Double, Double) => CallbackTo[Double],
    nearestPowerOfTwo: Double => CallbackTo[Double],
    nextPowerOfTwo: Double => CallbackTo[Double],
    radToDeg: Double => CallbackTo[Double],
    randFloat: (Double, Double) => CallbackTo[Double],
    randFloatSpread: Double => CallbackTo[Double],
    randInt: (Double, Double) => CallbackTo[Double],
    random16: CallbackTo[Double],
    smootherstep: (Double, Double, Double) => CallbackTo[Double],
    smoothstep: (Double, Double, Double) => CallbackTo[Double]
  ): TypeofMath = {
    val __obj = js.Dynamic.literal(DEG2RAD = DEG2RAD.asInstanceOf[js.Any], RAD2DEG = RAD2DEG.asInstanceOf[js.Any])
    __obj.updateDynamic("ceilPowerOfTwo")(js.Any.fromFunction1((t0: scala.Double) => ceilPowerOfTwo(t0).runNow()))
    __obj.updateDynamic("clamp")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => clamp(t0, t1, t2).runNow()))
    __obj.updateDynamic("degToRad")(js.Any.fromFunction1((t0: scala.Double) => degToRad(t0).runNow()))
    __obj.updateDynamic("euclideanModulo")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => euclideanModulo(t0, t1).runNow()))
    __obj.updateDynamic("floorPowerOfTwo")(js.Any.fromFunction1((t0: scala.Double) => floorPowerOfTwo(t0).runNow()))
    __obj.updateDynamic("generateUUID")(generateUUID.toJsFn)
    __obj.updateDynamic("isPowerOfTwo")(js.Any.fromFunction1((t0: scala.Double) => isPowerOfTwo(t0).runNow()))
    __obj.updateDynamic("lerp")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => lerp(t0, t1, t2).runNow()))
    __obj.updateDynamic("mapLinear")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double) => mapLinear(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("nearestPowerOfTwo")(js.Any.fromFunction1((t0: scala.Double) => nearestPowerOfTwo(t0).runNow()))
    __obj.updateDynamic("nextPowerOfTwo")(js.Any.fromFunction1((t0: scala.Double) => nextPowerOfTwo(t0).runNow()))
    __obj.updateDynamic("radToDeg")(js.Any.fromFunction1((t0: scala.Double) => radToDeg(t0).runNow()))
    __obj.updateDynamic("randFloat")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => randFloat(t0, t1).runNow()))
    __obj.updateDynamic("randFloatSpread")(js.Any.fromFunction1((t0: scala.Double) => randFloatSpread(t0).runNow()))
    __obj.updateDynamic("randInt")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => randInt(t0, t1).runNow()))
    __obj.updateDynamic("random16")(random16.toJsFn)
    __obj.updateDynamic("smootherstep")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => smootherstep(t0, t1, t2).runNow()))
    __obj.updateDynamic("smoothstep")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => smoothstep(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TypeofMath]
  }
}

