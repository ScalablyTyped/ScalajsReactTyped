package typingsJapgolly.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepresentativeInfoRequest extends js.Object {
  var contextParams: js.UndefOr[ContextParams] = js.undefined
}

object RepresentativeInfoRequest {
  @scala.inline
  def apply(contextParams: ContextParams = null): RepresentativeInfoRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepresentativeInfoRequest]
  }
}

