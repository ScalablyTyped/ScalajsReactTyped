package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetPdfExportEvent extends SpreadsheetEvent {
  var promise: js.UndefOr[JQueryPromise[_]] = js.undefined
}

object SpreadsheetPdfExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    promise: JQueryPromise[_] = null
  ): SpreadsheetPdfExportEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetPdfExportEvent]
  }
}

