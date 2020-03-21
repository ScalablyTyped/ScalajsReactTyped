package typingsJapgolly.gapiClientContent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcknowledged extends js.Object {
  /**
    * Obtains orders that match the acknowledgement status. When set to true, obtains orders that have been acknowledged. When false, obtains orders that
    * have not been acknowledged.
    * We recommend using this filter set to false, in conjunction with the acknowledge call, such that only un-acknowledged orders are returned.
    */
  var acknowledged: js.UndefOr[Boolean] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of orders to return in the response, used for paging. The default value is 25 orders per page, and the maximum allowed value is 250
    * orders per page.
    * Known issue: All List calls will return all Orders without limit regardless of the value of this field.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** The ID of the managing account. */
  var merchantId: String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * The ordering of the returned list. The only supported value are placedDate desc and placedDate asc for now, which returns orders sorted by placement
    * date. "placedDate desc" stands for listing orders by placement date, from oldest to most recent. "placedDate asc" stands for listing orders by
    * placement date, from most recent to oldest. In future releases we'll support other sorting criteria.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  /** The token returned by the previous request. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Obtains orders placed before this date (exclusively), in ISO 8601 format. */
  var placedDateEnd: js.UndefOr[String] = js.undefined
  /** Obtains orders placed after this date (inclusively), in ISO 8601 format. */
  var placedDateStart: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Obtains orders that match any of the specified statuses. Multiple values can be specified with comma separation. Additionally, please note that active
    * is a shortcut for pendingShipment and partiallyShipped, and completed is a shortcut for shipped , partiallyDelivered, delivered, partiallyReturned,
    * returned, and canceled.
    */
  var statuses: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonAcknowledged {
  @scala.inline
  def apply(
    merchantId: String,
    acknowledged: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    fields: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageToken: String = null,
    placedDateEnd: String = null,
    placedDateStart: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    statuses: String = null,
    userIp: String = null
  ): AnonAcknowledged = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any])
    if (!js.isUndefined(acknowledged)) __obj.updateDynamic("acknowledged")(acknowledged.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (placedDateEnd != null) __obj.updateDynamic("placedDateEnd")(placedDateEnd.asInstanceOf[js.Any])
    if (placedDateStart != null) __obj.updateDynamic("placedDateStart")(placedDateStart.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcknowledged]
  }
}

