package typingsJapgolly.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMetadata extends js.Object {
  /** Experiment IDs the current request belongs to. */
  var experimentIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Locale to use for the current request. */
  var locale: js.UndefOr[String] = js.undefined
  /** Google Partners session ID. */
  var partnersSessionId: js.UndefOr[String] = js.undefined
  /** Source of traffic for the current request. */
  var trafficSource: js.UndefOr[TrafficSource] = js.undefined
  /**
    * Values to use instead of the user's respective defaults for the current
    * request. These are only honored by whitelisted products.
    */
  var userOverrides: js.UndefOr[UserOverrides] = js.undefined
}

object RequestMetadata {
  @scala.inline
  def apply(
    experimentIds: js.Array[String] = null,
    locale: String = null,
    partnersSessionId: String = null,
    trafficSource: TrafficSource = null,
    userOverrides: UserOverrides = null
  ): RequestMetadata = {
    val __obj = js.Dynamic.literal()
    if (experimentIds != null) __obj.updateDynamic("experimentIds")(experimentIds.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (partnersSessionId != null) __obj.updateDynamic("partnersSessionId")(partnersSessionId.asInstanceOf[js.Any])
    if (trafficSource != null) __obj.updateDynamic("trafficSource")(trafficSource.asInstanceOf[js.Any])
    if (userOverrides != null) __obj.updateDynamic("userOverrides")(userOverrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMetadata]
  }
}

