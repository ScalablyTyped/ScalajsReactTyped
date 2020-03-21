package typingsJapgolly.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAccountsClientsInvitationsGet extends StandardParameters {
  /**
    * Numerical account ID of the client's sponsor buyer. (required)
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Numerical account ID of the client buyer that the user invitation to be
    * retrieved is associated with. (required)
    */
  var clientAccountId: js.UndefOr[String] = js.native
  /**
    * Numerical identifier of the user invitation to retrieve. (required)
    */
  var invitationId: js.UndefOr[String] = js.native
}

