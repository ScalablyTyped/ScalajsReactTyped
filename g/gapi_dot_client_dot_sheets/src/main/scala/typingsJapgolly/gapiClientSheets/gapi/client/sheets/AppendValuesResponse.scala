package typingsJapgolly.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendValuesResponse extends js.Object {
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  /**
    * The range (in A1 notation) of the table that values are being appended to
    * (before the values were appended).
    * Empty if no table was found.
    */
  var tableRange: js.UndefOr[String] = js.undefined
  /** Information about the updates that were applied. */
  var updates: js.UndefOr[UpdateValuesResponse] = js.undefined
}

object AppendValuesResponse {
  @scala.inline
  def apply(spreadsheetId: String = null, tableRange: String = null, updates: UpdateValuesResponse = null): AppendValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange.asInstanceOf[js.Any])
    if (updates != null) __obj.updateDynamic("updates")(updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendValuesResponse]
  }
}

