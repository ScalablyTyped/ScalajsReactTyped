package typingsJapgolly.googleapis.datatransferV1Mod.adminDatatransferV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTransfersList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Immutable ID of the Google Apps account.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return. Default is 100.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Destination user's profile ID.
    */
  var newOwnerUserId: js.UndefOr[String] = js.native
  /**
    * Source user's profile ID.
    */
  var oldOwnerUserId: js.UndefOr[String] = js.native
  /**
    * Token to specify the next page in the list.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Status of the transfer.
    */
  var status: js.UndefOr[String] = js.native
}

object ParamsResourceTransfersList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    customerId: String = null,
    fields: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    newOwnerUserId: String = null,
    oauth_token: String = null,
    oldOwnerUserId: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    status: String = null,
    userIp: String = null
  ): ParamsResourceTransfersList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (newOwnerUserId != null) __obj.updateDynamic("newOwnerUserId")(newOwnerUserId.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (oldOwnerUserId != null) __obj.updateDynamic("oldOwnerUserId")(oldOwnerUserId.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceTransfersList]
  }
}

