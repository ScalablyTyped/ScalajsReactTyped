package typingsJapgolly.bounceJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point2D extends js.Object {
  var x: Double
  var y: Double
}

object Point2D {
  @scala.inline
  def apply(x: Double, y: Double): Point2D = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Point2D]
  }
}

