package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Local
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Remote
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.WorksheetAdded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the Added event.
  *
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetAddedEventArgs extends js.Object {
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var source: EventSource | Local | Remote
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetAdded
  /**
    *
    * Gets the id of the worksheet that is added to the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}

object WorksheetAddedEventArgs {
  @scala.inline
  def apply(source: EventSource | Local | Remote, `type`: WorksheetAdded, worksheetId: String): WorksheetAddedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetAddedEventArgs]
  }
}

