package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhirKitClient.mod.ResourceType
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadersHeadersOptionsOptions extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: ResourceType
}

object AnonHeadersHeadersOptionsOptions {
  @scala.inline
  def apply(resourceType: ResourceType, headers: Headers = null, options: Options = null): AnonHeadersHeadersOptionsOptions = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeadersHeadersOptionsOptions]
  }
}

