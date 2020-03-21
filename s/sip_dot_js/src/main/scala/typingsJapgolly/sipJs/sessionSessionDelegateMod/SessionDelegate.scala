package typingsJapgolly.sipJs.sessionSessionDelegateMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.ackMod.IncomingAckRequest
import typingsJapgolly.sipJs.byeMod.IncomingByeRequest
import typingsJapgolly.sipJs.inviteMod.IncomingInviteRequest
import typingsJapgolly.sipJs.methodsInfoMod.IncomingInfoRequest
import typingsJapgolly.sipJs.notifyMod.IncomingNotifyRequest
import typingsJapgolly.sipJs.prackMod.IncomingPrackRequest
import typingsJapgolly.sipJs.referMod.IncomingReferRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionDelegate extends js.Object {
  /**
    * Receive ACK request.
    * @param request - Incoming ACK request.
    */
  var onAck: js.UndefOr[js.Function1[/* request */ IncomingAckRequest, Unit]] = js.undefined
  /**
    * Timeout waiting for ACK request.
    * If no handler is provided the Session will terminated with a BYE.
    * https://tools.ietf.org/html/rfc3261#section-13.3.1.4
    */
  var onAckTimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Receive BYE request.
    * https://tools.ietf.org/html/rfc3261#section-15.1.2
    * @param request - Incoming BYE request.
    */
  var onBye: js.UndefOr[js.Function1[/* request */ IncomingByeRequest, Unit]] = js.undefined
  /**
    * Receive INFO request.
    * @param request - Incoming INFO request.
    */
  var onInfo: js.UndefOr[js.Function1[/* request */ IncomingInfoRequest, Unit]] = js.undefined
  /**
    * Receive re-INVITE request.
    * https://tools.ietf.org/html/rfc3261#section-14.2
    * @param request - Incoming INVITE request.
    */
  var onInvite: js.UndefOr[js.Function1[/* request */ IncomingInviteRequest, Unit]] = js.undefined
  /**
    * Receive NOTIFY request.
    * https://tools.ietf.org/html/rfc6665#section-4.1.3
    * @param request - Incoming NOTIFY request.
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingNotifyRequest, Unit]] = js.undefined
  /**
    * Receive PRACK request.
    * https://tools.ietf.org/html/rfc3262#section-3
    * @param request - Incoming PRACK request.
    */
  var onPrack: js.UndefOr[js.Function1[/* request */ IncomingPrackRequest, Unit]] = js.undefined
  /**
    * Receive REFER request.
    * https://tools.ietf.org/html/rfc3515#section-2.4.2
    * @param request - Incoming REFER request.
    */
  var onRefer: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.undefined
}

object SessionDelegate {
  @scala.inline
  def apply(
    onAck: /* request */ IncomingAckRequest => Callback = null,
    onAckTimeout: js.UndefOr[Callback] = js.undefined,
    onBye: /* request */ IncomingByeRequest => Callback = null,
    onInfo: /* request */ IncomingInfoRequest => Callback = null,
    onInvite: /* request */ IncomingInviteRequest => Callback = null,
    onNotify: /* request */ IncomingNotifyRequest => Callback = null,
    onPrack: /* request */ IncomingPrackRequest => Callback = null,
    onRefer: /* request */ IncomingReferRequest => Callback = null
  ): SessionDelegate = {
    val __obj = js.Dynamic.literal()
    if (onAck != null) __obj.updateDynamic("onAck")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.ackMod.IncomingAckRequest) => onAck(t0).runNow()))
    onAckTimeout.foreach(p => __obj.updateDynamic("onAckTimeout")(p.toJsFn))
    if (onBye != null) __obj.updateDynamic("onBye")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.byeMod.IncomingByeRequest) => onBye(t0).runNow()))
    if (onInfo != null) __obj.updateDynamic("onInfo")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.methodsInfoMod.IncomingInfoRequest) => onInfo(t0).runNow()))
    if (onInvite != null) __obj.updateDynamic("onInvite")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.inviteMod.IncomingInviteRequest) => onInvite(t0).runNow()))
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.notifyMod.IncomingNotifyRequest) => onNotify(t0).runNow()))
    if (onPrack != null) __obj.updateDynamic("onPrack")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.prackMod.IncomingPrackRequest) => onPrack(t0).runNow()))
    if (onRefer != null) __obj.updateDynamic("onRefer")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.referMod.IncomingReferRequest) => onRefer(t0).runNow()))
    __obj.asInstanceOf[SessionDelegate]
  }
}

