package typingsJapgolly.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait offset extends js.Object {
  var left: Double
  var top: Double
}

object offset {
  @scala.inline
  def apply(left: Double, top: Double): offset = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[offset]
  }
}

