package typingsJapgolly.zepto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeptoPosition extends js.Object {
  var left: Double
  var top: Double
}

object ZeptoPosition {
  @scala.inline
  def apply(left: Double, top: Double): ZeptoPosition = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZeptoPosition]
  }
}

