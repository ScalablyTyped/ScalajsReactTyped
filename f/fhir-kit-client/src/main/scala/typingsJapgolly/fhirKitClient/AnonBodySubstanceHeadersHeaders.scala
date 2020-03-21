package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.Substance
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodySubstanceHeadersHeaders extends js.Object {
  var body: Substance
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Substance
}

object AnonBodySubstanceHeadersHeaders {
  @scala.inline
  def apply(
    body: Substance,
    id: String,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Substance,
    headers: Headers = null,
    options: Options = null
  ): AnonBodySubstanceHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodySubstanceHeadersHeaders]
  }
}

