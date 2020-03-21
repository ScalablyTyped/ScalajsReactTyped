package typingsJapgolly.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Servo extends js.Object {
  /**
    * Calibrate the limits for the servolib
    *
    * @param   freq    The update freq in Hz
    * @param   min     The min. pulse in ms
    * @param   max     The max. pulse in ms
    */
  def calibrate(freq: Double, min: Double, max: Double): Unit
  /**
    * Move Servo to desired position.
    *
    * @param   pos     Relative position (0% to 100%).
    */
  def moveTo(pos: Double): Unit
}

object Servo {
  @scala.inline
  def apply(
    calibrate: (Double, Double, Double) => japgolly.scalajs.react.Callback,
    moveTo: Double => japgolly.scalajs.react.Callback
  ): Servo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calibrate")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => calibrate(t0, t1, t2).runNow()))
    __obj.updateDynamic("moveTo")(js.Any.fromFunction1((t0: scala.Double) => moveTo(t0).runNow()))
    __obj.asInstanceOf[Servo]
  }
}

