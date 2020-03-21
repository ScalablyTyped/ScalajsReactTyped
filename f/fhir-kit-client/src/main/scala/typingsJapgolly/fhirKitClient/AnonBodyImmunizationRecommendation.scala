package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.ImmunizationRecommendation
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyImmunizationRecommendation extends js.Object {
  var body: ImmunizationRecommendation
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ImmunizationRecommendation
}

object AnonBodyImmunizationRecommendation {
  @scala.inline
  def apply(
    body: ImmunizationRecommendation,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ImmunizationRecommendation,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyImmunizationRecommendation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyImmunizationRecommendation]
  }
}

