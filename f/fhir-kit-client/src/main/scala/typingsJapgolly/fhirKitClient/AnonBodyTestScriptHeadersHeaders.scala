package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.TestScript
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyTestScriptHeadersHeaders extends js.Object {
  var body: TestScript
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.TestScript
}

object AnonBodyTestScriptHeadersHeaders {
  @scala.inline
  def apply(
    body: TestScript,
    id: String,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.TestScript,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyTestScriptHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyTestScriptHeadersHeaders]
  }
}

