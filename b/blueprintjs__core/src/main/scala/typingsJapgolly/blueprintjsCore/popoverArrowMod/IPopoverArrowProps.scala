package typingsJapgolly.blueprintjsCore.popoverArrowMod

import typingsJapgolly.popperJs.mod.Placement
import typingsJapgolly.reactPopper.mod.PopperArrowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopoverArrowProps extends js.Object {
  var arrowProps: PopperArrowProps
  var placement: Placement
}

object IPopoverArrowProps {
  @scala.inline
  def apply(arrowProps: PopperArrowProps, placement: Placement): IPopoverArrowProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPopoverArrowProps]
  }
}

