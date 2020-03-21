package typingsJapgolly.googleapis.androidpublisherV3Mod.androidpublisherV3

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePurchasesVoidedpurchasesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The time, in milliseconds since the Epoch, of the newest voided in-app
    * product purchase that you want to see in the response. The value of this
    * parameter cannot be greater than the current time and is ignored if a
    * pagination token is set. Default value is current time. Note: This filter
    * is applied on the time at which the record is seen as voided by our
    * systems and not the actual voided time returned in the response.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    *
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The package name of the application for which voided purchases need to be
    * returned (for example, 'com.some.thing').
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    *
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * The time, in milliseconds since the Epoch, of the oldest voided in-app
    * product purchase that you want to see in the response. The value of this
    * parameter cannot be older than 30 days and is ignored if a pagination
    * token is set. Default value is current time minus 30 days. Note: This
    * filter is applied on the time at which the record is seen as voided by
    * our systems and not the actual voided time returned in the response.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    *
    */
  var token: js.UndefOr[String] = js.native
}

object ParamsResourcePurchasesVoidedpurchasesList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    endTime: String = null,
    fields: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    packageName: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startIndex: Int | Double = null,
    startTime: String = null,
    token: String = null,
    userIp: String = null
  ): ParamsResourcePurchasesVoidedpurchasesList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourcePurchasesVoidedpurchasesList]
  }
}

