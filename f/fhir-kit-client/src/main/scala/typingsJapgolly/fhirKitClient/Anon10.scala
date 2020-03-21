package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhirKitClient.fhirKitClientStrings.DomainResource
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon10 extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: DomainResource
  var version: String
}

object Anon10 {
  @scala.inline
  def apply(
    id: String,
    resourceType: DomainResource,
    version: String,
    headers: Headers = null,
    options: Options = null
  ): Anon10 = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon10]
  }
}

