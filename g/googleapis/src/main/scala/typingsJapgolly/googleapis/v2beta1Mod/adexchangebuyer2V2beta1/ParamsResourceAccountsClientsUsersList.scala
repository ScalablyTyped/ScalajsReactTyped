package typingsJapgolly.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAccountsClientsUsersList extends StandardParameters {
  /**
    * Numerical account ID of the sponsor buyer of the client to list users
    * for. (required)
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The account ID of the client buyer to list users for. (required) You must
    * specify either a string representation of a numerical account identifier
    * or the `-` character to list all the client users for all the clients of
    * a given sponsor buyer.
    */
  var clientAccountId: js.UndefOr[String] = js.native
  /**
    * Requested page size. The server may return fewer clients than requested.
    * If unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of ListClientUsersResponse.nextPageToken
    * returned from the previous call to the accounts.clients.users.list
    * method.
    */
  var pageToken: js.UndefOr[String] = js.native
}

