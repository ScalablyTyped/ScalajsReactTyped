package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.CarePlan
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyCarePlan extends js.Object {
  var body: CarePlan
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.CarePlan
}

object AnonBodyCarePlan {
  @scala.inline
  def apply(
    body: CarePlan,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.CarePlan,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyCarePlan = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyCarePlan]
  }
}

