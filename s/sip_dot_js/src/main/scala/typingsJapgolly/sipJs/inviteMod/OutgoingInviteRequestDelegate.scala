package typingsJapgolly.sipJs.inviteMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingInviteRequestDelegate extends OutgoingRequestDelegate {
  /**
    * Received a 2xx positive final response to this request.
    * @param response - Incoming response (including a confirmed Session).
    */
  @JSName("onAccept")
  var onAccept_OutgoingInviteRequestDelegate: js.UndefOr[js.Function1[/* response */ AckableIncomingResponseWithSession, Unit]] = js.undefined
  /**
    * Received a 1xx provisional response to this request. Excluding 100 responses.
    * @param response - Incoming response (including an early Session).
    */
  @JSName("onProgress")
  var onProgress_OutgoingInviteRequestDelegate: js.UndefOr[js.Function1[/* response */ PrackableIncomingResponseWithSession, Unit]] = js.undefined
}

object OutgoingInviteRequestDelegate {
  @scala.inline
  def apply(
    onAccept: /* response */ AckableIncomingResponseWithSession => Callback = null,
    onProgress: /* response */ PrackableIncomingResponseWithSession => Callback = null,
    onRedirect: /* response */ IncomingResponse => Callback = null,
    onReject: /* response */ IncomingResponse => Callback = null,
    onTrying: /* response */ IncomingResponse => Callback = null
  ): OutgoingInviteRequestDelegate = {
    val __obj = js.Dynamic.literal()
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.inviteMod.AckableIncomingResponseWithSession) => onAccept(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.inviteMod.PrackableIncomingResponseWithSession) => onProgress(t0).runNow()))
    if (onRedirect != null) __obj.updateDynamic("onRedirect")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onRedirect(t0).runNow()))
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onReject(t0).runNow()))
    if (onTrying != null) __obj.updateDynamic("onTrying")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onTrying(t0).runNow()))
    __obj.asInstanceOf[OutgoingInviteRequestDelegate]
  }
}

