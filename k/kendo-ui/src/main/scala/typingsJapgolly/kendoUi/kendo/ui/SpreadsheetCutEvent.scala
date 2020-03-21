package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.spreadsheet.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetCutEvent extends SpreadsheetEvent {
  var range: js.UndefOr[Range] = js.undefined
}

object SpreadsheetCutEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    range: Range = null
  ): SpreadsheetCutEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetCutEvent]
  }
}

