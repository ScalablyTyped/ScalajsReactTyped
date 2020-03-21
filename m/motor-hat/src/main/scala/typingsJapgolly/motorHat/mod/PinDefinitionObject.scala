package typingsJapgolly.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinDefinitionObject extends js.Object {
  /**
    * Pin number of the first coil output
    */
  var IN1: Double
  /**
    * Pin number of the second coil output
    */
  var IN2: Double
  /**
    * Pin number of the PWM output
    */
  var PWM: Double
}

object PinDefinitionObject {
  @scala.inline
  def apply(IN1: Double, IN2: Double, PWM: Double): PinDefinitionObject = {
    val __obj = js.Dynamic.literal(IN1 = IN1.asInstanceOf[js.Any], IN2 = IN2.asInstanceOf[js.Any], PWM = PWM.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PinDefinitionObject]
  }
}

