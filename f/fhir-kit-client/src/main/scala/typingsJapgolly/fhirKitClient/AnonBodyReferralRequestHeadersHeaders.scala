package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.ReferralRequest
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyReferralRequestHeadersHeaders extends js.Object {
  var body: ReferralRequest
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ReferralRequest
}

object AnonBodyReferralRequestHeadersHeaders {
  @scala.inline
  def apply(
    body: ReferralRequest,
    id: String,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ReferralRequest,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyReferralRequestHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyReferralRequestHeadersHeaders]
  }
}

