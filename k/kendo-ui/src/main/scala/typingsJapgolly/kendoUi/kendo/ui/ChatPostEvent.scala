package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatPostEvent extends ChatEvent {
  var from: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[js.Date] = js.undefined
}

object ChatPostEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Chat,
    from: js.Any = null,
    text: String = null,
    timestamp: js.Date = null
  ): ChatPostEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatPostEvent]
  }
}

