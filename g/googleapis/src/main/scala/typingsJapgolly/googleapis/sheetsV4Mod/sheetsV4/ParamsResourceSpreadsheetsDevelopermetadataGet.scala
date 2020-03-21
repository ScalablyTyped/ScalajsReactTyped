package typingsJapgolly.googleapis.sheetsV4Mod.sheetsV4

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSpreadsheetsDevelopermetadataGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the developer metadata to retrieve.
    */
  var metadataId: js.UndefOr[Double] = js.native
  /**
    * The ID of the spreadsheet to retrieve metadata from.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
}

