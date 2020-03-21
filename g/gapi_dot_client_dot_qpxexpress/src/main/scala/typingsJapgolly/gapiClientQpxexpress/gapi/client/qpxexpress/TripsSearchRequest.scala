package typingsJapgolly.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripsSearchRequest extends js.Object {
  /** A QPX Express search request. Required values are at least one adult or senior passenger, an origin, a destination, and a date. */
  var request: js.UndefOr[TripOptionsRequest] = js.undefined
}

object TripsSearchRequest {
  @scala.inline
  def apply(request: TripOptionsRequest = null): TripsSearchRequest = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripsSearchRequest]
  }
}

