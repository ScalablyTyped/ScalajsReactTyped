package typingsJapgolly.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePagespeedapiRunpagespeed extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Indicates if third party resources should be filtered out before
    * PageSpeed analysis.
    */
  var filter_third_party_resources: js.UndefOr[Boolean] = js.native
  /**
    * The locale used to localize formatted results
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * A PageSpeed rule to run; if none are given, all rules are run
    */
  var rule: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates if binary data containing a screenshot should be included
    */
  var screenshot: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if binary data containing snapshot images should be included
    */
  var snapshots: js.UndefOr[Boolean] = js.native
  /**
    * The analysis strategy (desktop or mobile) to use, and desktop is the
    * default
    */
  var strategy: js.UndefOr[String] = js.native
  /**
    * The URL to fetch and analyze
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Campaign name for analytics.
    */
  var utm_campaign: js.UndefOr[String] = js.native
  /**
    * Campaign source for analytics.
    */
  var utm_source: js.UndefOr[String] = js.native
}

object ParamsResourcePagespeedapiRunpagespeed {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    filter_third_party_resources: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    locale: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    rule: js.Array[String] = null,
    screenshot: js.UndefOr[Boolean] = js.undefined,
    snapshots: js.UndefOr[Boolean] = js.undefined,
    strategy: String = null,
    url: String = null,
    userIp: String = null,
    utm_campaign: String = null,
    utm_source: String = null
  ): ParamsResourcePagespeedapiRunpagespeed = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(filter_third_party_resources)) __obj.updateDynamic("filter_third_party_resources")(filter_third_party_resources.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (!js.isUndefined(screenshot)) __obj.updateDynamic("screenshot")(screenshot.asInstanceOf[js.Any])
    if (!js.isUndefined(snapshots)) __obj.updateDynamic("snapshots")(snapshots.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (utm_campaign != null) __obj.updateDynamic("utm_campaign")(utm_campaign.asInstanceOf[js.Any])
    if (utm_source != null) __obj.updateDynamic("utm_source")(utm_source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourcePagespeedapiRunpagespeed]
  }
}

