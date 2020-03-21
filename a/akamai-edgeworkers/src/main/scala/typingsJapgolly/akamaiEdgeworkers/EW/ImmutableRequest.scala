package typingsJapgolly.akamaiEdgeworkers.EW

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImmutableRequest
  extends ReadsHeaders
     with ReadsVariables
     with Request

object ImmutableRequest {
  @scala.inline
  def apply(
    cpCode: Double,
    getHeader: String => CallbackTo[js.Array[String] | Null],
    getVariable: String => CallbackTo[js.UndefOr[String]],
    host: String,
    method: String,
    path: String,
    query: String,
    scheme: String,
    url: String,
    device: Device = null,
    userLocation: UserLocation = null
  ): ImmutableRequest = {
    val __obj = js.Dynamic.literal(cpCode = cpCode.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: java.lang.String) => getHeader(t0).runNow()))
    __obj.updateDynamic("getVariable")(js.Any.fromFunction1((t0: java.lang.String) => getVariable(t0).runNow()))
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (userLocation != null) __obj.updateDynamic("userLocation")(userLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmutableRequest]
  }
}

