package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.EnrollmentRequest
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyEnrollmentRequest extends js.Object {
  var body: EnrollmentRequest
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.EnrollmentRequest
}

object AnonBodyEnrollmentRequest {
  @scala.inline
  def apply(
    body: EnrollmentRequest,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.EnrollmentRequest,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyEnrollmentRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyEnrollmentRequest]
  }
}

