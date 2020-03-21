package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchClearValuesResponse extends js.Object {
  var clearedRanges: js.UndefOr[js.Array[String]] = js.undefined
  var spreadsheetId: js.UndefOr[String] = js.undefined
}

object BatchClearValuesResponse {
  @scala.inline
  def apply(clearedRanges: js.Array[String] = null, spreadsheetId: String = null): BatchClearValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (clearedRanges != null) __obj.updateDynamic("clearedRanges")(clearedRanges.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchClearValuesResponse]
  }
}

