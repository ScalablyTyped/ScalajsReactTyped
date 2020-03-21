package typingsJapgolly.airtable.mod._Global_.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AirtableOptions extends js.Object {
  var allowUnauthorizedSsl: js.UndefOr[Boolean] = js.undefined
  var apiKey: js.UndefOr[String] = js.undefined
  var apiVersion: js.UndefOr[String] = js.undefined
  var endpointUrl: js.UndefOr[String] = js.undefined
  var noRetryIfRateLimited: js.UndefOr[Boolean] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
}

object AirtableOptions {
  @scala.inline
  def apply(
    allowUnauthorizedSsl: js.UndefOr[Boolean] = js.undefined,
    apiKey: String = null,
    apiVersion: String = null,
    endpointUrl: String = null,
    noRetryIfRateLimited: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: Int | Double = null
  ): AirtableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnauthorizedSsl)) __obj.updateDynamic("allowUnauthorizedSsl")(allowUnauthorizedSsl.asInstanceOf[js.Any])
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(noRetryIfRateLimited)) __obj.updateDynamic("noRetryIfRateLimited")(noRetryIfRateLimited.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AirtableOptions]
  }
}

