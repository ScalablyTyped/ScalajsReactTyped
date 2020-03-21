package typingsJapgolly.reactVirtualized

import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.auto
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.center
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.end
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlign extends js.Object {
  var align: auto | start | end | center
  var cellIndex: Double
  var height: Double
  var scrollLeft: Double
  var scrollTop: Double
  var width: Double
}

object AnonAlign {
  @scala.inline
  def apply(
    align: auto | start | end | center,
    cellIndex: Double,
    height: Double,
    scrollLeft: Double,
    scrollTop: Double,
    width: Double
  ): AnonAlign = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cellIndex = cellIndex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlign]
  }
}

