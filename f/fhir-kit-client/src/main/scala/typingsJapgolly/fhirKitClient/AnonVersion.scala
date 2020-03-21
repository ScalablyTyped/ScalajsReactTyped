package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhirKitClient.fhirKitClientStrings.AllergyIntolerance
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVersion extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: AllergyIntolerance
  var version: String
}

object AnonVersion {
  @scala.inline
  def apply(
    id: String,
    resourceType: AllergyIntolerance,
    version: String,
    headers: Headers = null,
    options: Options = null
  ): AnonVersion = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVersion]
  }
}

