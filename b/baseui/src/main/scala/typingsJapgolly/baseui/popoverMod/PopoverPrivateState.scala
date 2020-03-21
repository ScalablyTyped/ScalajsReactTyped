package typingsJapgolly.baseui.popoverMod

import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.bottomLeft
import typingsJapgolly.baseui.baseuiStrings.bottomRight
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.leftBottom
import typingsJapgolly.baseui.baseuiStrings.leftTop
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.baseuiStrings.rightBottom
import typingsJapgolly.baseui.baseuiStrings.rightTop
import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.baseui.baseuiStrings.topLeft
import typingsJapgolly.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverPrivateState extends js.Object {
  var arrowOffset: Offset
  var isAnimating: Boolean
  var isLayerMounted: Boolean
  var isMounted: Boolean
  var placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  var popoverOffset: Offset
}

object PopoverPrivateState {
  @scala.inline
  def apply(
    arrowOffset: Offset,
    isAnimating: Boolean,
    isLayerMounted: Boolean,
    isMounted: Boolean,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top,
    popoverOffset: Offset
  ): PopoverPrivateState = {
    val __obj = js.Dynamic.literal(arrowOffset = arrowOffset.asInstanceOf[js.Any], isAnimating = isAnimating.asInstanceOf[js.Any], isLayerMounted = isLayerMounted.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popoverOffset = popoverOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PopoverPrivateState]
  }
}

