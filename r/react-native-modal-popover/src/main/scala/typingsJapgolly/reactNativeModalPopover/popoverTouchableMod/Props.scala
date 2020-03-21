package typingsJapgolly.reactNativeModalPopover.popoverTouchableMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var onPopoverDisplayed: js.UndefOr[js.Function0[_]] = js.undefined
}

object Props {
  @scala.inline
  def apply(onPopoverDisplayed: js.UndefOr[CallbackTo[js.Any]] = js.undefined): Props = {
    val __obj = js.Dynamic.literal()
    onPopoverDisplayed.foreach(p => __obj.updateDynamic("onPopoverDisplayed")(p.toJsFn))
    __obj.asInstanceOf[Props]
  }
}

