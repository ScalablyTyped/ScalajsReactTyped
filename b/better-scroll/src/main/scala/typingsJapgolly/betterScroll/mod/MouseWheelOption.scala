package typingsJapgolly.betterScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseWheelOption extends js.Object {
  var easeTime: Double
  var invert: Boolean
  var speed: Double
}

object MouseWheelOption {
  @scala.inline
  def apply(easeTime: Double, invert: Boolean, speed: Double): MouseWheelOption = {
    val __obj = js.Dynamic.literal(easeTime = easeTime.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MouseWheelOption]
  }
}

