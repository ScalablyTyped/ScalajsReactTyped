package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStripSelectEvent extends TabStripEvent {
  var contentElement: js.UndefOr[Element] = js.undefined
  var item: js.UndefOr[Element] = js.undefined
}

object TabStripSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: TabStrip,
    contentElement: Element = null,
    item: Element = null
  ): TabStripSelectEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (contentElement != null) __obj.updateDynamic("contentElement")(contentElement.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStripSelectEvent]
  }
}

