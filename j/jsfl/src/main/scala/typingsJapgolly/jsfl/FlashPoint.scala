package typingsJapgolly.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashPoint extends js.Object {
  var x: Double
  var y: Double
}

object FlashPoint {
  @scala.inline
  def apply(x: Double, y: Double): FlashPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlashPoint]
  }
}

