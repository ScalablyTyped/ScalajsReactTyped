package typingsJapgolly.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMousePoint extends js.Object {
  var x: Double
  var y: Double
}

object IMousePoint {
  @scala.inline
  def apply(x: Double, y: Double): IMousePoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMousePoint]
  }
}

