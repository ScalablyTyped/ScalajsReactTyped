package typingsJapgolly.heremaps.H.util.kinetics

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface defines kinetic move parameters used by map for kinetic drag.
  * @property power {number} - Power multiplier. Multiplier is used to increase the speed of the kinetic move. By default map uses 1.
  * @property duration {number} - Defines duration of the kinetic move.
  */
trait IKinetics extends js.Object {
  var duration: Double
  var power: Double
  /**
    * Easing function modifies animation progress. In example it can modify the animation in a way it starts rapidly and then slows down at the end.
    * @param p {number} - current progress
    * @returns {number} - modified progress
    */
  def ease(p: Double): Double
}

object IKinetics {
  @scala.inline
  def apply(duration: Double, ease: Double => CallbackTo[Double], power: Double): IKinetics = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any])
    __obj.updateDynamic("ease")(js.Any.fromFunction1((t0: scala.Double) => ease(t0).runNow()))
    __obj.asInstanceOf[IKinetics]
  }
}

