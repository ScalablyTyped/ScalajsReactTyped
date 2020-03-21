package typingsJapgolly.sipJs.subscribeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingSubscribeRequestDelegate extends OutgoingRequestDelegate {
  /**
    * Received the initial subscription creating NOTIFY in response to this request.
    * Called for out of dialog SUBSCRIBE requests only (not called for re-SUBSCRIBE requests).
    * @param request - Incoming NOTIFY request (including a Subscription).
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingRequestWithSubscription, Unit]] = js.undefined
  /**
    * Timed out waiting to receive the initial subscription creating NOTIFY in response to this request.
    * Called for out of dialog SUBSCRIBE requests only (not called for re-SUBSCRIBE requests).
    */
  var onNotifyTimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object OutgoingSubscribeRequestDelegate {
  @scala.inline
  def apply(
    onAccept: /* response */ IncomingResponse => Callback = null,
    onNotify: /* request */ IncomingRequestWithSubscription => Callback = null,
    onNotifyTimeout: js.UndefOr[Callback] = js.undefined,
    onProgress: /* response */ IncomingResponse => Callback = null,
    onRedirect: /* response */ IncomingResponse => Callback = null,
    onReject: /* response */ IncomingResponse => Callback = null,
    onTrying: /* response */ IncomingResponse => Callback = null
  ): OutgoingSubscribeRequestDelegate = {
    val __obj = js.Dynamic.literal()
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onAccept(t0).runNow()))
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.subscribeMod.IncomingRequestWithSubscription) => onNotify(t0).runNow()))
    onNotifyTimeout.foreach(p => __obj.updateDynamic("onNotifyTimeout")(p.toJsFn))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onProgress(t0).runNow()))
    if (onRedirect != null) __obj.updateDynamic("onRedirect")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onRedirect(t0).runNow()))
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onReject(t0).runNow()))
    if (onTrying != null) __obj.updateDynamic("onTrying")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onTrying(t0).runNow()))
    __obj.asInstanceOf[OutgoingSubscribeRequestDelegate]
  }
}

