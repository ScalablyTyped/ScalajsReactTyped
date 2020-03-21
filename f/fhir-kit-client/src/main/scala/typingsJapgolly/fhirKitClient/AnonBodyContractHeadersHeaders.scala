package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.Contract
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyContractHeadersHeaders extends js.Object {
  var body: Contract
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Contract
}

object AnonBodyContractHeadersHeaders {
  @scala.inline
  def apply(
    body: Contract,
    id: String,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Contract,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyContractHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyContractHeadersHeaders]
  }
}

