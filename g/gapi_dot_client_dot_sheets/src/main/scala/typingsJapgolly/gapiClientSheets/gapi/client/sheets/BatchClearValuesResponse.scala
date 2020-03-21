package typingsJapgolly.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchClearValuesResponse extends js.Object {
  /**
    * The ranges that were cleared, in A1 notation.
    * (If the requests were for an unbounded range or a ranger larger
    * than the bounds of the sheet, this will be the actual ranges
    * that were cleared, bounded to the sheet's limits.)
    */
  var clearedRanges: js.UndefOr[js.Array[String]] = js.undefined
  /** The spreadsheet the updates were applied to. */
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

