package typingsJapgolly.sipJs.outgoingRequestMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingRequestDelegate extends js.Object {
  /**
    * Received a 2xx positive final response to this request.
    * @param response - Incoming response.
    */
  var onAccept: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.undefined
  /**
    * Received a 1xx provisional response to this request. Excluding 100 responses.
    * @param response - Incoming response.
    */
  var onProgress: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.undefined
  /**
    * Received a 3xx negative final response to this request.
    * @param response - Incoming response.
    */
  var onRedirect: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.undefined
  /**
    * Received a 4xx, 5xx, or 6xx negative final response to this request.
    * @param response - Incoming response.
    */
  var onReject: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.undefined
  /**
    * Received a 100 provisional response.
    * @param response - Incoming response.
    */
  var onTrying: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.undefined
}

object OutgoingRequestDelegate {
  @scala.inline
  def apply(
    onAccept: /* response */ IncomingResponse => Callback = null,
    onProgress: /* response */ IncomingResponse => Callback = null,
    onRedirect: /* response */ IncomingResponse => Callback = null,
    onReject: /* response */ IncomingResponse => Callback = null,
    onTrying: /* response */ IncomingResponse => Callback = null
  ): OutgoingRequestDelegate = {
    val __obj = js.Dynamic.literal()
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onAccept(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onProgress(t0).runNow()))
    if (onRedirect != null) __obj.updateDynamic("onRedirect")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onRedirect(t0).runNow()))
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onReject(t0).runNow()))
    if (onTrying != null) __obj.updateDynamic("onTrying")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onTrying(t0).runNow()))
    __obj.asInstanceOf[OutgoingRequestDelegate]
  }
}

