package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.CompartmentDefinition
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyCompartmentDefinitionHeadersHeaders extends js.Object {
  var body: CompartmentDefinition
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.CompartmentDefinition
}

object AnonBodyCompartmentDefinitionHeadersHeaders {
  @scala.inline
  def apply(
    body: CompartmentDefinition,
    id: String,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.CompartmentDefinition,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyCompartmentDefinitionHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyCompartmentDefinitionHeadersHeaders]
  }
}

