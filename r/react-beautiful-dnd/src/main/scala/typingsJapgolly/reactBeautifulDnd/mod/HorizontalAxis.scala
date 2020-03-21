package typingsJapgolly.reactBeautifulDnd.mod

import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.bottom
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.height
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.horizontal
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.left
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.right
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.top
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.width
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.x
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalAxis extends Axis {
  var crossAxisEnd: bottom
  var crossAxisLine: y
  var crossAxisSize: height
  var crossAxisStart: top
  var direction: horizontal
  var end: right
  var line: x
  var size: width
  var start: left
}

object HorizontalAxis {
  @scala.inline
  def apply(
    crossAxisEnd: bottom,
    crossAxisLine: y,
    crossAxisSize: height,
    crossAxisStart: top,
    direction: horizontal,
    end: right,
    line: x,
    size: width,
    start: left
  ): HorizontalAxis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = crossAxisEnd.asInstanceOf[js.Any], crossAxisLine = crossAxisLine.asInstanceOf[js.Any], crossAxisSize = crossAxisSize.asInstanceOf[js.Any], crossAxisStart = crossAxisStart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HorizontalAxis]
  }
}

