package typingsJapgolly.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollOffset extends js.Object {
  var scrollLeft: Double
  var scrollTop: Double
}

object ScrollOffset {
  @scala.inline
  def apply(scrollLeft: Double, scrollTop: Double): ScrollOffset = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScrollOffset]
  }
}

