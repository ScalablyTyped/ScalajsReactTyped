package typingsJapgolly.sipJs.referrerDelegateMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse
import typingsJapgolly.sipJs.notificationMod.Notification
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferrerDelegate extends OutgoingRequestDelegate {
  def onNotify(notification: Notification): Unit
}

object ReferrerDelegate {
  @scala.inline
  def apply(
    onNotify: Notification => Callback,
    onAccept: /* response */ IncomingResponse => Callback = null,
    onProgress: /* response */ IncomingResponse => Callback = null,
    onRedirect: /* response */ IncomingResponse => Callback = null,
    onReject: /* response */ IncomingResponse => Callback = null,
    onTrying: /* response */ IncomingResponse => Callback = null
  ): ReferrerDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onNotify")(js.Any.fromFunction1((t0: typingsJapgolly.sipJs.notificationMod.Notification) => onNotify(t0).runNow()))
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onAccept(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onProgress(t0).runNow()))
    if (onRedirect != null) __obj.updateDynamic("onRedirect")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onRedirect(t0).runNow()))
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onReject(t0).runNow()))
    if (onTrying != null) __obj.updateDynamic("onTrying")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.incomingResponseMod.IncomingResponse) => onTrying(t0).runNow()))
    __obj.asInstanceOf[ReferrerDelegate]
  }
}

