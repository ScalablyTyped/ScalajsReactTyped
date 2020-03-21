package typingsJapgolly.reactNativeModalPopover.popoverControllerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeModalPopover.popoverGeometryMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverControllerRenderProps extends js.Object {
  var popoverAnchorRect: Rect
  var popoverVisible: Boolean
  def closePopover(): Unit
  def openPopover(): Unit
  def setPopoverAnchor(ref: js.Any): Unit
}

object PopoverControllerRenderProps {
  @scala.inline
  def apply(
    closePopover: Callback,
    openPopover: Callback,
    popoverAnchorRect: Rect,
    popoverVisible: Boolean,
    setPopoverAnchor: js.Any => Callback
  ): PopoverControllerRenderProps = {
    val __obj = js.Dynamic.literal(popoverAnchorRect = popoverAnchorRect.asInstanceOf[js.Any], popoverVisible = popoverVisible.asInstanceOf[js.Any])
    __obj.updateDynamic("closePopover")(closePopover.toJsFn)
    __obj.updateDynamic("openPopover")(openPopover.toJsFn)
    __obj.updateDynamic("setPopoverAnchor")(js.Any.fromFunction1((t0: js.Any) => setPopoverAnchor(t0).runNow()))
    __obj.asInstanceOf[PopoverControllerRenderProps]
  }
}

