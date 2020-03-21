package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.NutritionOrder
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyNutritionOrder extends js.Object {
  var body: NutritionOrder
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.NutritionOrder
}

object AnonBodyNutritionOrder {
  @scala.inline
  def apply(
    body: NutritionOrder,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.NutritionOrder,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyNutritionOrder = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyNutritionOrder]
  }
}

