package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhirKitClient.mod.ResourceType
import typingsJapgolly.fhirKitClient.mod.SearchParams
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSearchParams extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: ResourceType
  var searchParams: SearchParams
}

object AnonSearchParams {
  @scala.inline
  def apply(
    resourceType: ResourceType,
    searchParams: SearchParams,
    headers: Headers = null,
    options: Options = null
  ): AnonSearchParams = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], searchParams = searchParams.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSearchParams]
  }
}

