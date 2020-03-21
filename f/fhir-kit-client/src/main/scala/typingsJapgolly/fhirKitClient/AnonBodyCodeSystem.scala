package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.CodeSystem
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyCodeSystem extends js.Object {
  var body: CodeSystem
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.CodeSystem
}

object AnonBodyCodeSystem {
  @scala.inline
  def apply(
    body: CodeSystem,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.CodeSystem,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyCodeSystem = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyCodeSystem]
  }
}

