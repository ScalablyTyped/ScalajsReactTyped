package typingsJapgolly.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorData extends js.Object {
  var x: Double
  var y: Double
}

object CursorData {
  @scala.inline
  def apply(x: Double, y: Double): CursorData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CursorData]
  }
}

