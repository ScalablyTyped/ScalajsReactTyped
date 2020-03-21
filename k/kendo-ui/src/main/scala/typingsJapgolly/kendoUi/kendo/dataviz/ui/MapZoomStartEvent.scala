package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapZoomStartEvent extends MapEvent {
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object MapZoomStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Map,
    originalEvent: js.Any = null
  ): MapZoomStartEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapZoomStartEvent]
  }
}

