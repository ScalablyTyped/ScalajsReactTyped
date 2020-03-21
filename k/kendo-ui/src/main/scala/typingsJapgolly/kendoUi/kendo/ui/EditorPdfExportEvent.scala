package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorPdfExportEvent extends EditorEvent {
  var promise: js.UndefOr[JQueryPromise[_]] = js.undefined
}

object EditorPdfExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Editor_,
    promise: JQueryPromise[_] = null
  ): EditorPdfExportEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorPdfExportEvent]
  }
}

