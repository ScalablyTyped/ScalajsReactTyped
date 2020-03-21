package typingsJapgolly.fhirKitClient

import typingsJapgolly.fhirKitClient.mod.SearchParams
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptionsSearchParams extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var searchParams: SearchParams
}

object AnonOptionsSearchParams {
  @scala.inline
  def apply(searchParams: SearchParams, headers: Headers = null, options: Options = null): AnonOptionsSearchParams = {
    val __obj = js.Dynamic.literal(searchParams = searchParams.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptionsSearchParams]
  }
}

