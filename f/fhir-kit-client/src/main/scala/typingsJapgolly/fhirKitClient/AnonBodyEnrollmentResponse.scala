package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.EnrollmentResponse
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyEnrollmentResponse extends js.Object {
  var body: EnrollmentResponse
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.EnrollmentResponse
}

object AnonBodyEnrollmentResponse {
  @scala.inline
  def apply(
    body: EnrollmentResponse,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.EnrollmentResponse,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyEnrollmentResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyEnrollmentResponse]
  }
}

