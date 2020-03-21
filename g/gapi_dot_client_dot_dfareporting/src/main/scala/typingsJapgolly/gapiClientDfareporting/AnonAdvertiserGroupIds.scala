package typingsJapgolly.gapiClientDfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdvertiserGroupIds extends js.Object {
  /** Select only advertisers with these advertiser group IDs. */
  var advertiserGroupIds: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Select only advertisers with these floodlight configuration IDs. */
  var floodlightConfigurationIds: js.UndefOr[String] = js.undefined
  /** Select only advertisers with these IDs. */
  var ids: js.UndefOr[String] = js.undefined
  /** Select only advertisers which do not belong to any advertiser group. */
  var includeAdvertisersWithoutGroupsOnly: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Select only advertisers which use another advertiser's floodlight configuration. */
  var onlyParent: js.UndefOr[Boolean] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "advertiser&#42;2015" will return objects with names like "advertiser
    * June 2015", "advertiser April 2015", or simply "advertiser 2015". Most of the searches also add wildcards implicitly at the start and the end of the
    * search string. For example, a search string of "advertiser" will match objects with name "my advertiser", "advertiser 2015", or simply "advertiser".
    */
  var searchString: js.UndefOr[String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.undefined
  /** Select only advertisers with the specified status. */
  var status: js.UndefOr[String] = js.undefined
  /** Select only advertisers with these subaccount IDs. */
  var subaccountId: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonAdvertiserGroupIds {
  @scala.inline
  def apply(
    profileId: String,
    advertiserGroupIds: String = null,
    alt: String = null,
    fields: String = null,
    floodlightConfigurationIds: String = null,
    ids: String = null,
    includeAdvertisersWithoutGroupsOnly: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    onlyParent: js.UndefOr[Boolean] = js.undefined,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    searchString: String = null,
    sortField: String = null,
    sortOrder: String = null,
    status: String = null,
    subaccountId: String = null,
    userIp: String = null
  ): AnonAdvertiserGroupIds = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    if (advertiserGroupIds != null) __obj.updateDynamic("advertiserGroupIds")(advertiserGroupIds.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (floodlightConfigurationIds != null) __obj.updateDynamic("floodlightConfigurationIds")(floodlightConfigurationIds.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAdvertisersWithoutGroupsOnly)) __obj.updateDynamic("includeAdvertisersWithoutGroupsOnly")(includeAdvertisersWithoutGroupsOnly.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyParent)) __obj.updateDynamic("onlyParent")(onlyParent.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdvertiserGroupIds]
  }
}

