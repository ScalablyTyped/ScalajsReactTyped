package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetRenameSheetEvent extends SpreadsheetEvent {
  var newSheetName: js.UndefOr[String] = js.undefined
  var sheet: js.UndefOr[Sheet] = js.undefined
}

object SpreadsheetRenameSheetEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    newSheetName: String = null,
    sheet: Sheet = null
  ): SpreadsheetRenameSheetEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (newSheetName != null) __obj.updateDynamic("newSheetName")(newSheetName.asInstanceOf[js.Any])
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetRenameSheetEvent]
  }
}

