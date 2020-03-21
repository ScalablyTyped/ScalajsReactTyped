package typingsJapgolly.googleapis.v3Mod.analyticsV3

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceManagementCustomdimensionsUpdate extends StandardParameters {
  /**
    * Account ID for the custom dimension to update.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Custom dimension ID for the custom dimension to update.
    */
  var customDimensionId: js.UndefOr[String] = js.native
  /**
    * Force the update and ignore any warnings related to the custom dimension
    * being linked to a custom data source / data set.
    */
  var ignoreCustomDataSourceLinks: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCustomDimension] = js.native
  /**
    * Web property ID for the custom dimension to update.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object ParamsResourceManagementCustomdimensionsUpdate {
  @scala.inline
  def apply(
    accountId: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    customDimensionId: String = null,
    fields: String = null,
    ignoreCustomDataSourceLinks: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: SchemaCustomDimension = null,
    userIp: String = null,
    webPropertyId: String = null
  ): ParamsResourceManagementCustomdimensionsUpdate = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (customDimensionId != null) __obj.updateDynamic("customDimensionId")(customDimensionId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCustomDataSourceLinks)) __obj.updateDynamic("ignoreCustomDataSourceLinks")(ignoreCustomDataSourceLinks.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceManagementCustomdimensionsUpdate]
  }
}

