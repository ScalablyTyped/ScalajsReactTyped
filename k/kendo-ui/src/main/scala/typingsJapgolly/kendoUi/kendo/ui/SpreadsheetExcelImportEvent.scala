package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsJapgolly.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetExcelImportEvent extends SpreadsheetEvent {
  var file: js.UndefOr[Blob | File] = js.undefined
  var progress: js.UndefOr[JQueryPromise[_]] = js.undefined
}

object SpreadsheetExcelImportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    file: Blob | File = null,
    progress: JQueryPromise[_] = null
  ): SpreadsheetExcelImportEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetExcelImportEvent]
  }
}

