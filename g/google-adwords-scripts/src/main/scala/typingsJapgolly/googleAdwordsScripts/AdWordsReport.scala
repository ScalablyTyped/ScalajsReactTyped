package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Reports
trait AdWordsReport extends js.Object {
  def exportToSheet(sheet: Sheet): Unit
  def getColumnHeader(awqlColumnName: String): AdWordsReportColumnHeader
  def rows(): AdWordsReportRowIterator
}

object AdWordsReport {
  @scala.inline
  def apply(
    exportToSheet: Sheet => Callback,
    getColumnHeader: String => CallbackTo[AdWordsReportColumnHeader],
    rows: CallbackTo[AdWordsReportRowIterator]
  ): AdWordsReport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exportToSheet")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet) => exportToSheet(t0).runNow()))
    __obj.updateDynamic("getColumnHeader")(js.Any.fromFunction1((t0: java.lang.String) => getColumnHeader(t0).runNow()))
    __obj.updateDynamic("rows")(rows.toJsFn)
    __obj.asInstanceOf[AdWordsReport]
  }
}

