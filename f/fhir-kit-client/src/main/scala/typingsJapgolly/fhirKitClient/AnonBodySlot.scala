package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.Slot
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodySlot extends js.Object {
  var body: Slot
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Slot
}

object AnonBodySlot {
  @scala.inline
  def apply(
    body: Slot,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Slot,
    headers: Headers = null,
    options: Options = null
  ): AnonBodySlot = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodySlot]
  }
}

