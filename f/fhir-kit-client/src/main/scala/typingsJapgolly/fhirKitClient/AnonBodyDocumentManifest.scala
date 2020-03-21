package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.DocumentManifest
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDocumentManifest extends js.Object {
  var body: DocumentManifest
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DocumentManifest
}

object AnonBodyDocumentManifest {
  @scala.inline
  def apply(
    body: DocumentManifest,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DocumentManifest,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyDocumentManifest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyDocumentManifest]
  }
}

