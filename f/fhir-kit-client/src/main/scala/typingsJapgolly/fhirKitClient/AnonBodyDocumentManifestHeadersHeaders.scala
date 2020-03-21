package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.DocumentManifest
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDocumentManifestHeadersHeaders extends js.Object {
  var body: DocumentManifest
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DocumentManifest
}

object AnonBodyDocumentManifestHeadersHeaders {
  @scala.inline
  def apply(
    body: DocumentManifest,
    id: String,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DocumentManifest,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyDocumentManifestHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyDocumentManifestHeadersHeaders]
  }
}

