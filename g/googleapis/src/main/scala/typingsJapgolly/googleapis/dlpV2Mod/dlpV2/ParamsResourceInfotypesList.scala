package typingsJapgolly.googleapis.dlpV2Mod.dlpV2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceInfotypesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional filter to only return infoTypes supported by certain parts of
    * the API. Defaults to supported_by=INSPECT.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional BCP-47 language code for localized infoType friendly names. If
    * omitted, or if localized strings are not available, en-US strings will be
    * returned.
    */
  var languageCode: js.UndefOr[String] = js.native
}

