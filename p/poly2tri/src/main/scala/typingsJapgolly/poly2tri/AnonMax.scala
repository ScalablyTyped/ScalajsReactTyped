package typingsJapgolly.poly2tri

import typingsJapgolly.poly2tri.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var max: Point
  var min: Point
}

object AnonMax {
  @scala.inline
  def apply(max: Point, min: Point): AnonMax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMax]
  }
}

