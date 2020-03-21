package typingsJapgolly.adhan.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdhanMath extends js.Object {
  def degreesToRadians(degrees: Double): Double
  def normalizeToScale(number: Double, max: Double): Double
  def quadrantShiftAngle(angle: Double): Double
  def radiansToDegrees(radians: Double): Double
  def timeComponents(number: Double): Double
  def unwindAngle(angle: Double): Double
}

object AdhanMath {
  @scala.inline
  def apply(
    degreesToRadians: Double => CallbackTo[Double],
    normalizeToScale: (Double, Double) => CallbackTo[Double],
    quadrantShiftAngle: Double => CallbackTo[Double],
    radiansToDegrees: Double => CallbackTo[Double],
    timeComponents: Double => CallbackTo[Double],
    unwindAngle: Double => CallbackTo[Double]
  ): AdhanMath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("degreesToRadians")(js.Any.fromFunction1((t0: scala.Double) => degreesToRadians(t0).runNow()))
    __obj.updateDynamic("normalizeToScale")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => normalizeToScale(t0, t1).runNow()))
    __obj.updateDynamic("quadrantShiftAngle")(js.Any.fromFunction1((t0: scala.Double) => quadrantShiftAngle(t0).runNow()))
    __obj.updateDynamic("radiansToDegrees")(js.Any.fromFunction1((t0: scala.Double) => radiansToDegrees(t0).runNow()))
    __obj.updateDynamic("timeComponents")(js.Any.fromFunction1((t0: scala.Double) => timeComponents(t0).runNow()))
    __obj.updateDynamic("unwindAngle")(js.Any.fromFunction1((t0: scala.Double) => unwindAngle(t0).runNow()))
    __obj.asInstanceOf[AdhanMath]
  }
}

