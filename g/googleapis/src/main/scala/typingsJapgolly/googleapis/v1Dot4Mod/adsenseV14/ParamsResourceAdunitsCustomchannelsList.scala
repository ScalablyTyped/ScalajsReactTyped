package typingsJapgolly.googleapis.v1Dot4Mod.adsenseV14

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAdunitsCustomchannelsList extends StandardParameters {
  /**
    * Ad client which contains the ad unit.
    */
  var adClientId: js.UndefOr[String] = js.native
  /**
    * Ad unit for which to list custom channels.
    */
  var adUnitId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of custom channels to include in the response, used
    * for paging.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * A continuation token, used to page through custom channels. To retrieve
    * the next page, set this parameter to the value of "nextPageToken" from
    * the previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceAdunitsCustomchannelsList {
  @scala.inline
  def apply(
    adClientId: String = null,
    adUnitId: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): ParamsResourceAdunitsCustomchannelsList = {
    val __obj = js.Dynamic.literal()
    if (adClientId != null) __obj.updateDynamic("adClientId")(adClientId.asInstanceOf[js.Any])
    if (adUnitId != null) __obj.updateDynamic("adUnitId")(adUnitId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceAdunitsCustomchannelsList]
  }
}

