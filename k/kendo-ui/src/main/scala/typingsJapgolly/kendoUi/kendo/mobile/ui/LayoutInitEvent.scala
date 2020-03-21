package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutInitEvent extends LayoutEvent {
  var layout: js.UndefOr[JQuery] = js.undefined
}

object LayoutInitEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Layout,
    layout: JQuery = null
  ): LayoutInitEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutInitEvent]
  }
}

