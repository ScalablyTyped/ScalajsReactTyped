package typingsJapgolly.googleapis.youtubeV3Mod.youtubeV3

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceChannelsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The categoryId parameter specifies a YouTube guide category, thereby
    * requesting YouTube channels associated with that category.
    */
  var categoryId: js.UndefOr[String] = js.native
  /**
    * The forUsername parameter specifies a YouTube username, thereby
    * requesting the channel associated with that username.
    */
  var forUsername: js.UndefOr[String] = js.native
  /**
    * The hl parameter should be used for filter out the properties that are
    * not in the given language. Used for the brandingSettings part.
    */
  var hl: js.UndefOr[String] = js.native
  /**
    * The id parameter specifies a comma-separated list of the YouTube channel
    * ID(s) for the resource(s) that are being retrieved. In a channel
    * resource, the id property specifies the channel's YouTube channel ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Note: This parameter is intended exclusively for YouTube content
    * partners.  Set this parameter's value to true to instruct the API to only
    * return channels managed by the content owner that the
    * onBehalfOfContentOwner parameter specifies. The user must be
    * authenticated as a CMS account linked to the specified content owner and
    * onBehalfOfContentOwner must be provided.
    */
  var managedByMe: js.UndefOr[Boolean] = js.native
  /**
    * The maxResults parameter specifies the maximum number of items that
    * should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Set this parameter's value to true to instruct the API to only return
    * channels owned by the authenticated user.
    */
  var mine: js.UndefOr[Boolean] = js.native
  /**
    * Use the subscriptions.list method and its mySubscribers parameter to
    * retrieve a list of subscribers to the authenticated user's channel.
    */
  var mySubscribers: js.UndefOr[Boolean] = js.native
  /**
    * Note: This parameter is intended exclusively for YouTube content
    * partners.  The onBehalfOfContentOwner parameter indicates that the
    * request's authorization credentials identify a YouTube CMS user who is
    * acting on behalf of the content owner specified in the parameter value.
    * This parameter is intended for YouTube content partners that own and
    * manage many different YouTube channels. It allows content owners to
    * authenticate once and get access to all their video and channel data,
    * without having to provide authentication credentials for each individual
    * channel. The CMS account that the user authenticates with must be linked
    * to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  /**
    * The pageToken parameter identifies a specific page in the result set that
    * should be returned. In an API response, the nextPageToken and
    * prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The part parameter specifies a comma-separated list of one or more
    * channel resource properties that the API response will include.  If the
    * parameter identifies a property that contains child properties, the child
    * properties will be included in the response. For example, in a channel
    * resource, the contentDetails property contains other properties, such as
    * the uploads properties. As such, if you set part=contentDetails, the API
    * response will also contain all of those nested properties.
    */
  var part: js.UndefOr[String] = js.native
}

object ParamsResourceChannelsList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    categoryId: String = null,
    fields: String = null,
    forUsername: String = null,
    hl: String = null,
    id: String = null,
    key: String = null,
    managedByMe: js.UndefOr[Boolean] = js.undefined,
    maxResults: Int | Double = null,
    mine: js.UndefOr[Boolean] = js.undefined,
    mySubscribers: js.UndefOr[Boolean] = js.undefined,
    oauth_token: String = null,
    onBehalfOfContentOwner: String = null,
    pageToken: String = null,
    part: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): ParamsResourceChannelsList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (forUsername != null) __obj.updateDynamic("forUsername")(forUsername.asInstanceOf[js.Any])
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(managedByMe)) __obj.updateDynamic("managedByMe")(managedByMe.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(mine)) __obj.updateDynamic("mine")(mine.asInstanceOf[js.Any])
    if (!js.isUndefined(mySubscribers)) __obj.updateDynamic("mySubscribers")(mySubscribers.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (onBehalfOfContentOwner != null) __obj.updateDynamic("onBehalfOfContentOwner")(onBehalfOfContentOwner.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (part != null) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceChannelsList]
  }
}

