package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Collection.Spreadsheets

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.CopySheetToAnotherSpreadsheetRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.SheetProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsCollection extends js.Object {
  // Copies a single sheet from a spreadsheet to another spreadsheet.
  // Returns the properties of the newly created sheet.
  def copyTo(resource: CopySheetToAnotherSpreadsheetRequest, spreadsheetId: String, sheetId: Double): SheetProperties
}

object SheetsCollection {
  @scala.inline
  def apply(copyTo: (CopySheetToAnotherSpreadsheetRequest, String, Double) => CallbackTo[SheetProperties]): SheetsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copyTo")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.CopySheetToAnotherSpreadsheetRequest, t1: java.lang.String, t2: scala.Double) => copyTo(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SheetsCollection]
  }
}

