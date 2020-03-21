package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerErrorEvent extends PDFViewerEvent {
  var dialog: js.UndefOr[Dialog] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object PDFViewerErrorEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: PDFViewer,
    dialog: Dialog = null,
    error: js.Any = null,
    message: String = null
  ): PDFViewerErrorEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (dialog != null) __obj.updateDynamic("dialog")(dialog.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerErrorEvent]
  }
}

