package typingsJapgolly.ecmaProposalMathExtensions

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  /** This is the number of how many degrees are one radian. */
  val DEG_PER_RAD: Double
  /** This is the number of how many radians are one degree. */
  val RAD_PER_DEG: Double
  /**
    * Clamps an incoming value `x` to a range between `lower` and `upper`.
    * @param x The value to clamp.
    * @param lower The lower bound of the range to clamp `x` to.
    * @param upper The upper bound of the range to clamp `x` to.
    * @return The input value clamped to the given range.
    */
  def clamp(x: Double, lower: Double, upper: Double): Double
  /**
    * Converts an angle given in radians to an angle given in degrees.
    * @param radians The input angle in radians.
    * @return The output angle in degrees.
    */
  def degrees(radians: Double): Double
  /**
    * Scales a floating point value between `inLow` and `inHigh` to the range of `outLow` to `outHigh`.
    * @param x The numeric value in the input range to scale.
    * @param inLow The lower bound of the input range.
    * @param inHigh The upper bound of the input range.
    * @param outLow The lower bound of the output range.
    * @param outHigh The upper bound of the output range.
    * @return The input value scaled to the output range.
    */
  def fscale(x: Double, inLow: Double, inHigh: Double, outLow: Double, outHigh: Double): Double
  /**
    * Converts an angle given in degrees to an angle given in radians.
    * @param degrees The input angle in degrees.
    * @return The output angle in radians.
    */
  def radians(degrees: Double): Double
  /**
    * Scales a value between `inLow` and `inHigh` to the range of `outLow` to `outHigh`.
    * @param x The numeric value in the input range to scale.
    * @param inLow The lower bound of the input range.
    * @param inHigh The upper bound of the input range.
    * @param outLow The lower bound of the output range.
    * @param outHigh The upper bound of the output range.
    * @return The input value scaled to the output range.
    */
  def scale(x: Double, inLow: Double, inHigh: Double, outLow: Double, outHigh: Double): Double
}

object Math {
  @scala.inline
  def apply(
    DEG_PER_RAD: Double,
    RAD_PER_DEG: Double,
    clamp: (Double, Double, Double) => CallbackTo[Double],
    degrees: Double => CallbackTo[Double],
    fscale: (Double, Double, Double, Double, Double) => CallbackTo[Double],
    radians: Double => CallbackTo[Double],
    scale: (Double, Double, Double, Double, Double) => CallbackTo[Double]
  ): Math = {
    val __obj = js.Dynamic.literal(DEG_PER_RAD = DEG_PER_RAD.asInstanceOf[js.Any], RAD_PER_DEG = RAD_PER_DEG.asInstanceOf[js.Any])
    __obj.updateDynamic("clamp")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => clamp(t0, t1, t2).runNow()))
    __obj.updateDynamic("degrees")(js.Any.fromFunction1((t0: scala.Double) => degrees(t0).runNow()))
    __obj.updateDynamic("fscale")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double) => fscale(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("radians")(js.Any.fromFunction1((t0: scala.Double) => radians(t0).runNow()))
    __obj.updateDynamic("scale")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double) => scale(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[Math]
  }
}

