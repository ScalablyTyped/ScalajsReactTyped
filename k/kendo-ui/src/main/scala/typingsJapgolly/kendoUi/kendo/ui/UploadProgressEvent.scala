package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadProgressEvent extends UploadEvent {
  var files: js.UndefOr[js.Array[_]] = js.undefined
  var percentComplete: js.UndefOr[Double] = js.undefined
}

object UploadProgressEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Upload,
    files: js.Array[_] = null,
    percentComplete: Int | Double = null
  ): UploadProgressEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgressEvent]
  }
}

