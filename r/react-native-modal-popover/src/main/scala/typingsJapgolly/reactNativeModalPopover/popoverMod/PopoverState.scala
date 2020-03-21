package typingsJapgolly.reactNativeModalPopover.popoverMod

import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNativeModalPopover.popoverGeometryMod.Geometry
import typingsJapgolly.reactNativeModalPopover.popoverGeometryMod.Placement
import typingsJapgolly.reactNativeModalPopover.popoverGeometryMod.Point
import typingsJapgolly.reactNativeModalPopover.popoverGeometryMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverState extends Geometry {
  var animation: Value
  var contentSize: Size
  var isAwaitingShow: Boolean
  var visible: Boolean
}

object PopoverState {
  @scala.inline
  def apply(
    anchor: Point,
    animation: Value,
    contentSize: Size,
    isAwaitingShow: Boolean,
    origin: Point,
    placement: Placement,
    visible: Boolean
  ): PopoverState = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], isAwaitingShow = isAwaitingShow.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PopoverState]
  }
}

