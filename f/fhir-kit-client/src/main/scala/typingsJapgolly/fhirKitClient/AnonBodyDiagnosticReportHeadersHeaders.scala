package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.DiagnosticReport
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDiagnosticReportHeadersHeaders extends js.Object {
  var body: DiagnosticReport
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DiagnosticReport
}

object AnonBodyDiagnosticReportHeadersHeaders {
  @scala.inline
  def apply(
    body: DiagnosticReport,
    id: String,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DiagnosticReport,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyDiagnosticReportHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyDiagnosticReportHeadersHeaders]
  }
}

