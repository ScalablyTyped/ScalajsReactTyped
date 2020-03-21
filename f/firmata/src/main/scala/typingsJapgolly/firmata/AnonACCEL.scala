package typingsJapgolly.firmata

import typingsJapgolly.firmata.mod.STEPPER_RUN_STATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonACCEL extends js.Object {
  var ACCEL: STEPPER_RUN_STATE
  var DECEL: STEPPER_RUN_STATE
  var RUN: STEPPER_RUN_STATE
  var STOP: STEPPER_RUN_STATE
}

object AnonACCEL {
  @scala.inline
  def apply(
    ACCEL: STEPPER_RUN_STATE,
    DECEL: STEPPER_RUN_STATE,
    RUN: STEPPER_RUN_STATE,
    STOP: STEPPER_RUN_STATE
  ): AnonACCEL = {
    val __obj = js.Dynamic.literal(ACCEL = ACCEL.asInstanceOf[js.Any], DECEL = DECEL.asInstanceOf[js.Any], RUN = RUN.asInstanceOf[js.Any], STOP = STOP.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonACCEL]
  }
}

