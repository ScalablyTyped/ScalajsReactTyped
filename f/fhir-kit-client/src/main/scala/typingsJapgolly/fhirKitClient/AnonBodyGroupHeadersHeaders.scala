package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.Group
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyGroupHeadersHeaders extends js.Object {
  var body: Group
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Group
}

object AnonBodyGroupHeadersHeaders {
  @scala.inline
  def apply(
    body: Group,
    id: String,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Group,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyGroupHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyGroupHeadersHeaders]
  }
}

