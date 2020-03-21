package typingsJapgolly.googleapis.v24Mod.analyticsV24

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDataGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A comma-separated list of Analytics dimensions. E.g.,
    * 'ga:browser,ga:city'.
    */
  var dimensions: js.UndefOr[String] = js.native
  /**
    * End date for fetching report data. All requests should specify an end
    * date formatted as YYYY-MM-DD.
    */
  var `end-date`: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of dimension or metric filters to be applied to
    * the report data.
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Unique table ID for retrieving report data. Table ID is of the form
    * ga:XXXX, where XXXX is the Analytics view (profile) ID.
    */
  var ids: js.UndefOr[String] = js.native
  /**
    * The maximum number of entries to include in this feed.
    */
  var `max-results`: js.UndefOr[Double] = js.native
  /**
    * A comma-separated list of Analytics metrics. E.g.,
    * 'ga:sessions,ga:pageviews'. At least one metric must be specified to
    * retrieve a valid Analytics report.
    */
  var metrics: js.UndefOr[String] = js.native
  /**
    * An Analytics advanced segment to be applied to the report data.
    */
  var segment: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of dimensions or metrics that determine the sort
    * order for the report data.
    */
  var sort: js.UndefOr[String] = js.native
  /**
    * Start date for fetching report data. All requests should specify a start
    * date formatted as YYYY-MM-DD.
    */
  var `start-date`: js.UndefOr[String] = js.native
  /**
    * An index of the first entity to retrieve. Use this parameter as a
    * pagination mechanism along with the max-results parameter.
    */
  var `start-index`: js.UndefOr[Double] = js.native
}

object ParamsResourceDataGet {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    dimensions: String = null,
    `end-date`: String = null,
    fields: String = null,
    filters: String = null,
    ids: String = null,
    key: String = null,
    `max-results`: Int | Double = null,
    metrics: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    segment: String = null,
    sort: String = null,
    `start-date`: String = null,
    `start-index`: Int | Double = null,
    userIp: String = null
  ): ParamsResourceDataGet = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (`end-date` != null) __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`start-date` != null) __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
    if (`start-index` != null) __obj.updateDynamic("start-index")(`start-index`.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceDataGet]
  }
}

