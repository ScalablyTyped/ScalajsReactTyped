package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorPasteEvent extends EditorEvent {
  var html: js.UndefOr[js.Any] = js.undefined
}

object EditorPasteEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Editor_,
    html: js.Any = null
  ): EditorPasteEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorPasteEvent]
  }
}

