package typingsJapgolly.sipJs.sessionDelegateMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.coreMod.IncomingRequestMessage
import typingsJapgolly.sipJs.infoMod.Info
import typingsJapgolly.sipJs.notificationMod.Notification
import typingsJapgolly.sipJs.referralMod.Referral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionDelegate extends js.Object {
  /**
    * Called upon receiving an incoming in dialog INFO request.
    * @param info - The info.
    */
  var onInfo: js.UndefOr[js.Function1[/* info */ Info, Unit]] = js.undefined
  /**
    * Called upon receiving an incoming in dialog INVITE request.
    * @param invite - The invite.
    */
  var onInvite: js.UndefOr[
    js.Function3[
      /* request */ IncomingRequestMessage, 
      /* response */ String, 
      /* statusCode */ Double, 
      Unit
    ]
  ] = js.undefined
  /**
    * Called upon receiving an incoming in dialog NOTIFY request.
    *
    * @remarks
    * If a refer is in progress notifications are delivered to the referrers delegate.
    *
    * @param notification - The notification.
    */
  var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.undefined
  /**
    * Called upon receiving an incoming in dialog REFER request.
    * @param referral - The referral.
    */
  var onRefer: js.UndefOr[js.Function1[/* referral */ Referral, Unit]] = js.undefined
}

object SessionDelegate {
  @scala.inline
  def apply(
    onInfo: /* info */ Info => Callback = null,
    onInvite: (/* request */ IncomingRequestMessage, /* response */ String, /* statusCode */ Double) => Callback = null,
    onNotify: /* notification */ Notification => Callback = null,
    onRefer: /* referral */ Referral => Callback = null
  ): SessionDelegate = {
    val __obj = js.Dynamic.literal()
    if (onInfo != null) __obj.updateDynamic("onInfo")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.sipJs.infoMod.Info) => onInfo(t0).runNow()))
    if (onInvite != null) __obj.updateDynamic("onInvite")(js.Any.fromFunction3((t0: /* request */ typingsJapgolly.sipJs.coreMod.IncomingRequestMessage, t1: /* response */ java.lang.String, t2: /* statusCode */ scala.Double) => onInvite(t0, t1, t2).runNow()))
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction1((t0: /* notification */ typingsJapgolly.sipJs.notificationMod.Notification) => onNotify(t0).runNow()))
    if (onRefer != null) __obj.updateDynamic("onRefer")(js.Any.fromFunction1((t0: /* referral */ typingsJapgolly.sipJs.referralMod.Referral) => onRefer(t0).runNow()))
    __obj.asInstanceOf[SessionDelegate]
  }
}

