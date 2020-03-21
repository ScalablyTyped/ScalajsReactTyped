package typingsJapgolly.googleapis.sheetsV4Mod.sheetsV4

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSpreadsheetsSheetsCopyto extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCopySheetToAnotherSpreadsheetRequest] = js.native
  /**
    * The ID of the sheet to copy.
    */
  var sheetId: js.UndefOr[Double] = js.native
  /**
    * The ID of the spreadsheet containing the sheet to copy.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
}

