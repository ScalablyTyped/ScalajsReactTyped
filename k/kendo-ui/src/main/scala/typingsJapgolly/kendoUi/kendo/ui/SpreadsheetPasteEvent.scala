package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.spreadsheet.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetPasteEvent extends SpreadsheetEvent {
  var clipboardContent: js.UndefOr[js.Any] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
}

object SpreadsheetPasteEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    clipboardContent: js.Any = null,
    range: Range = null
  ): SpreadsheetPasteEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (clipboardContent != null) __obj.updateDynamic("clipboardContent")(clipboardContent.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetPasteEvent]
  }
}

