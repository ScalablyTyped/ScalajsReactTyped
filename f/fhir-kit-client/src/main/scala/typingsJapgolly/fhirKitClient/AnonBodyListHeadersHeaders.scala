package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.List
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyListHeadersHeaders extends js.Object {
  var body: List
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.List
}

object AnonBodyListHeadersHeaders {
  @scala.inline
  def apply(
    body: List,
    id: String,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.List,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyListHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyListHeadersHeaders]
  }
}

