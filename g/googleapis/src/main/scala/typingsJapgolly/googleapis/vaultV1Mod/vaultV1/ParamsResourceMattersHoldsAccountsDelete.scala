package typingsJapgolly.googleapis.vaultV1Mod.vaultV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMattersHoldsAccountsDelete extends StandardParameters {
  /**
    * The ID of the account to remove from the hold.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The hold ID.
    */
  var holdId: js.UndefOr[String] = js.native
  /**
    * The matter ID.
    */
  var matterId: js.UndefOr[String] = js.native
}

