package typingsJapgolly.googleapis.vaultV1Mod.vaultV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMattersSavedqueriesDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The matter id of the parent matter for which the saved query is to be
    * deleted.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * Id of the saved query to be deleted.
    */
  var savedQueryId: js.UndefOr[String] = js.native
}

