package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.Observation
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyObservation extends js.Object {
  var body: Observation
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Observation
}

object AnonBodyObservation {
  @scala.inline
  def apply(
    body: Observation,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Observation,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyObservation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyObservation]
  }
}

