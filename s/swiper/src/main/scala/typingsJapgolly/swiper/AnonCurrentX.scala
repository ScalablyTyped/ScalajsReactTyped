package typingsJapgolly.swiper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentX extends js.Object {
  var currentX: Double
  var currentY: Double
  var diff: Double
  var startX: Double
  var startY: Double
}

object AnonCurrentX {
  @scala.inline
  def apply(currentX: Double, currentY: Double, diff: Double, startX: Double, startY: Double): AnonCurrentX = {
    val __obj = js.Dynamic.literal(currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrentX]
  }
}

