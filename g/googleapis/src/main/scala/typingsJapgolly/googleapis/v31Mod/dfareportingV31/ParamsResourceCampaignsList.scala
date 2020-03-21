package typingsJapgolly.googleapis.v31Mod.dfareportingV31

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCampaignsList extends StandardParameters {
  /**
    * Select only campaigns whose advertisers belong to these advertiser
    * groups.
    */
  var advertiserGroupIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only campaigns that belong to these advertisers.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only archived campaigns. Don't set this field to select both
    * archived and non-archived campaigns.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Select only campaigns that have at least one optimization activity.
    */
  var atLeastOneOptimizationActivity: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Exclude campaigns with these IDs.
    */
  var excludedIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only campaigns with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Select only campaigns that have overridden this event tag ID.
    */
  var overriddenEventTagId: js.UndefOr[String] = js.native
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Allows searching for campaigns by name or ID. Wildcards (*) are allowed.
    * For example, "campaign*2015" will return campaigns with names like
    * "campaign June 2015", "campaign April 2015", or simply "campaign 2015".
    * Most of the searches also add wildcards implicitly at the start and the
    * end of the search string. For example, a search string of "campaign" will
    * match campaigns with name "my campaign", "campaign 2015", or simply
    * "campaign".
    */
  var searchString: js.UndefOr[String] = js.native
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.native
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * Select only campaigns that belong to this subaccount.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object ParamsResourceCampaignsList {
  @scala.inline
  def apply(
    advertiserGroupIds: js.Array[String] = null,
    advertiserIds: js.Array[String] = null,
    alt: String = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    atLeastOneOptimizationActivity: js.UndefOr[Boolean] = js.undefined,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    excludedIds: js.Array[String] = null,
    fields: String = null,
    ids: js.Array[String] = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    overriddenEventTagId: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    profileId: String = null,
    quotaUser: String = null,
    searchString: String = null,
    sortField: String = null,
    sortOrder: String = null,
    subaccountId: String = null,
    userIp: String = null
  ): ParamsResourceCampaignsList = {
    val __obj = js.Dynamic.literal()
    if (advertiserGroupIds != null) __obj.updateDynamic("advertiserGroupIds")(advertiserGroupIds.asInstanceOf[js.Any])
    if (advertiserIds != null) __obj.updateDynamic("advertiserIds")(advertiserIds.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (!js.isUndefined(atLeastOneOptimizationActivity)) __obj.updateDynamic("atLeastOneOptimizationActivity")(atLeastOneOptimizationActivity.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (excludedIds != null) __obj.updateDynamic("excludedIds")(excludedIds.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (overriddenEventTagId != null) __obj.updateDynamic("overriddenEventTagId")(overriddenEventTagId.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceCampaignsList]
  }
}

