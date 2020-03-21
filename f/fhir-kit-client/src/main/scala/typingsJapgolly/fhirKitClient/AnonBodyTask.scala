package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhir.fhir.Task
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyTask extends js.Object {
  var body: Task
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Task
}

object AnonBodyTask {
  @scala.inline
  def apply(
    body: Task,
    resourceType: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Task,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyTask = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyTask]
  }
}

