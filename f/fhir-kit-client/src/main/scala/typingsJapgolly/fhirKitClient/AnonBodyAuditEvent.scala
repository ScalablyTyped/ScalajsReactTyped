package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.AuditEvent
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyAuditEvent extends js.Object {
  var body: AuditEvent
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.AuditEvent
}

object AnonBodyAuditEvent {
  @scala.inline
  def apply(
    body: AuditEvent,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.AuditEvent,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyAuditEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyAuditEvent]
  }
}

