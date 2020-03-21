package typingsJapgolly.sipJs.userAgentCoreDelegateMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.inviteMod.IncomingInviteRequest
import typingsJapgolly.sipJs.methodsMessageMod.IncomingMessageRequest
import typingsJapgolly.sipJs.notifyMod.IncomingNotifyRequest
import typingsJapgolly.sipJs.referMod.IncomingReferRequest
import typingsJapgolly.sipJs.registerMod.IncomingRegisterRequest
import typingsJapgolly.sipJs.subscribeMod.IncomingSubscribeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentCoreDelegate extends js.Object {
  /**
    * Receive INVITE request.
    * @param request - Incoming INVITE request.
    */
  var onInvite: js.UndefOr[js.Function1[/* request */ IncomingInviteRequest, Unit]] = js.undefined
  /**
    * Receive MESSAGE request.
    * @param request - Incoming MESSAGE request.
    */
  var onMessage: js.UndefOr[js.Function1[/* request */ IncomingMessageRequest, Unit]] = js.undefined
  /**
    * DEPRECATED. Receive NOTIFY request.
    * @param message - Incoming NOTIFY request.
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingNotifyRequest, Unit]] = js.undefined
  /**
    * Receive REFER request.
    * @param request - Incoming REFER request.
    */
  var onRefer: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.undefined
  /**
    * Receive REGISTER request.
    * @param request - Incoming REGISTER request.
    */
  var onRegister: js.UndefOr[js.Function1[/* request */ IncomingRegisterRequest, Unit]] = js.undefined
  /**
    * Receive SUBSCRIBE request.
    * @param request - Incoming SUBSCRIBE request.
    */
  var onSubscribe: js.UndefOr[js.Function1[/* request */ IncomingSubscribeRequest, Unit]] = js.undefined
}

object UserAgentCoreDelegate {
  @scala.inline
  def apply(
    onInvite: /* request */ IncomingInviteRequest => Callback = null,
    onMessage: /* request */ IncomingMessageRequest => Callback = null,
    onNotify: /* request */ IncomingNotifyRequest => Callback = null,
    onRefer: /* request */ IncomingReferRequest => Callback = null,
    onRegister: /* request */ IncomingRegisterRequest => Callback = null,
    onSubscribe: /* request */ IncomingSubscribeRequest => Callback = null
  ): UserAgentCoreDelegate = {
    val __obj = js.Dynamic.literal()
    if (onInvite != null) __obj.updateDynamic("onInvite")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.inviteMod.IncomingInviteRequest) => onInvite(t0).runNow()))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.methodsMessageMod.IncomingMessageRequest) => onMessage(t0).runNow()))
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.notifyMod.IncomingNotifyRequest) => onNotify(t0).runNow()))
    if (onRefer != null) __obj.updateDynamic("onRefer")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.referMod.IncomingReferRequest) => onRefer(t0).runNow()))
    if (onRegister != null) __obj.updateDynamic("onRegister")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.registerMod.IncomingRegisterRequest) => onRegister(t0).runNow()))
    if (onSubscribe != null) __obj.updateDynamic("onSubscribe")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.subscribeMod.IncomingSubscribeRequest) => onSubscribe(t0).runNow()))
    __obj.asInstanceOf[UserAgentCoreDelegate]
  }
}

