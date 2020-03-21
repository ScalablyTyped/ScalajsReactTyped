package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.Location
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyLocationHeadersHeaders extends js.Object {
  var body: Location
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Location
}

object AnonBodyLocationHeadersHeaders {
  @scala.inline
  def apply(
    body: Location,
    id: String,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Location,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyLocationHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyLocationHeadersHeaders]
  }
}

