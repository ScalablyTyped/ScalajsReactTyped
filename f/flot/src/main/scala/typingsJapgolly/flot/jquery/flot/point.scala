package typingsJapgolly.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait point extends js.Object {
  var x: Double
  var y: Double
}

object point {
  @scala.inline
  def apply(x: Double, y: Double): point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[point]
  }
}

