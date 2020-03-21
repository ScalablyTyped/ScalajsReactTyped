package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.MeasureReport
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyMeasureReport extends js.Object {
  var body: MeasureReport
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.MeasureReport
}

object AnonBodyMeasureReport {
  @scala.inline
  def apply(
    body: MeasureReport,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.MeasureReport,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyMeasureReport = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyMeasureReport]
  }
}

