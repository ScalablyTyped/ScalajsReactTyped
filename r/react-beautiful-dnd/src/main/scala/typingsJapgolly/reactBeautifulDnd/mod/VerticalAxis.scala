package typingsJapgolly.reactBeautifulDnd.mod

import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.bottom
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.height
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.left
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.right
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.top
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.vertical
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.width
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.x
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerticalAxis extends Axis {
  var crossAxisEnd: right
  var crossAxisLine: x
  var crossAxisSize: width
  var crossAxisStart: left
  var direction: vertical
  var end: bottom
  var line: y
  var size: height
  var start: top
}

object VerticalAxis {
  @scala.inline
  def apply(
    crossAxisEnd: right,
    crossAxisLine: x,
    crossAxisSize: width,
    crossAxisStart: left,
    direction: vertical,
    end: bottom,
    line: y,
    size: height,
    start: top
  ): VerticalAxis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = crossAxisEnd.asInstanceOf[js.Any], crossAxisLine = crossAxisLine.asInstanceOf[js.Any], crossAxisSize = crossAxisSize.asInstanceOf[js.Any], crossAxisStart = crossAxisStart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerticalAxis]
  }
}

