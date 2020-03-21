package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadRemoveEvent extends UploadEvent {
  var data: js.UndefOr[js.Any] = js.undefined
  var files: js.UndefOr[js.Array[_]] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
}

object UploadRemoveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Upload,
    data: js.Any = null,
    files: js.Array[_] = null,
    headers: js.Any = null
  ): UploadRemoveEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadRemoveEvent]
  }
}

