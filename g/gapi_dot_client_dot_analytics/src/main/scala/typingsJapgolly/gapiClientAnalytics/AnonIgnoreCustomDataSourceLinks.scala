package typingsJapgolly.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnoreCustomDataSourceLinks extends js.Object {
  /** Account ID for the custom dimension to update. */
  var accountId: String
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Custom dimension ID for the custom dimension to update. */
  var customDimensionId: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set. */
  var ignoreCustomDataSourceLinks: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** Web property ID for the custom dimension to update. */
  var webPropertyId: String
}

object AnonIgnoreCustomDataSourceLinks {
  @scala.inline
  def apply(
    accountId: String,
    customDimensionId: String,
    webPropertyId: String,
    alt: String = null,
    fields: String = null,
    ignoreCustomDataSourceLinks: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): AnonIgnoreCustomDataSourceLinks = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], customDimensionId = customDimensionId.asInstanceOf[js.Any], webPropertyId = webPropertyId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCustomDataSourceLinks)) __obj.updateDynamic("ignoreCustomDataSourceLinks")(ignoreCustomDataSourceLinks.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreCustomDataSourceLinks]
  }
}

