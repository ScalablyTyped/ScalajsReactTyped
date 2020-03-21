package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetDeleteColumnEvent extends SpreadsheetEvent {
  var index: js.UndefOr[Double] = js.undefined
  var sheet: js.UndefOr[Sheet] = js.undefined
}

object SpreadsheetDeleteColumnEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    index: Int | Double = null,
    sheet: Sheet = null
  ): SpreadsheetDeleteColumnEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetDeleteColumnEvent]
  }
}

