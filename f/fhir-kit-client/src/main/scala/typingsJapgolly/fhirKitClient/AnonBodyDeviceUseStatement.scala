package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.DeviceUseStatement
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDeviceUseStatement extends js.Object {
  var body: DeviceUseStatement
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DeviceUseStatement
}

object AnonBodyDeviceUseStatement {
  @scala.inline
  def apply(
    body: DeviceUseStatement,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DeviceUseStatement,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyDeviceUseStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyDeviceUseStatement]
  }
}

