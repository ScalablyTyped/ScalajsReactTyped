package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadClearEvent extends UploadEvent {
  var e: js.UndefOr[js.Any] = js.undefined
}

object UploadClearEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Upload,
    e: js.Any = null
  ): UploadClearEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadClearEvent]
  }
}

