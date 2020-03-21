package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhirKitClient.mod.Compartment
import typingsJapgolly.fhirKitClient.mod.ResourceType
import typingsJapgolly.fhirKitClient.mod.SearchParams
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompartmentHeaders extends js.Object {
  var compartment: Compartment
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: ResourceType
  var searchParams: js.UndefOr[SearchParams] = js.undefined
}

object AnonCompartmentHeaders {
  @scala.inline
  def apply(
    compartment: Compartment,
    resourceType: ResourceType,
    headers: Headers = null,
    options: Options = null,
    searchParams: SearchParams = null
  ): AnonCompartmentHeaders = {
    val __obj = js.Dynamic.literal(compartment = compartment.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (searchParams != null) __obj.updateDynamic("searchParams")(searchParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompartmentHeaders]
  }
}

