package typingsJapgolly.reactCalendarTimeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollisionLeft extends js.Object {
  var collisionLeft: Double
  var collisionWidth: Double
  var height: Double
  var isDragging: Boolean
  var left: Double
  var order: AnonGroup
  var originalLeft: Double
  var stack: Boolean
  var top: Double | Null
  var width: Double
}

object AnonCollisionLeft {
  @scala.inline
  def apply(
    collisionLeft: Double,
    collisionWidth: Double,
    height: Double,
    isDragging: Boolean,
    left: Double,
    order: AnonGroup,
    originalLeft: Double,
    stack: Boolean,
    width: Double,
    top: Int | Double = null
  ): AnonCollisionLeft = {
    val __obj = js.Dynamic.literal(collisionLeft = collisionLeft.asInstanceOf[js.Any], collisionWidth = collisionWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], originalLeft = originalLeft.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollisionLeft]
  }
}

