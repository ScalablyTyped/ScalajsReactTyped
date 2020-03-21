package typingsJapgolly.sipJs.userAgentDelegateMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.invitationMod.Invitation
import typingsJapgolly.sipJs.messageMod.Message
import typingsJapgolly.sipJs.notificationMod.Notification
import typingsJapgolly.sipJs.referralMod.Referral
import typingsJapgolly.sipJs.registerMod.IncomingRegisterRequest
import typingsJapgolly.sipJs.subscribeMod.IncomingSubscribeRequest
import typingsJapgolly.sipJs.subscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentDelegate extends js.Object {
  /**
    * Called upon transport transitioning to connected state.
    */
  var onConnect: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called upon transport transitioning from connected state.
    * @param error - An error if disconnect triggered by transport. Otherwise undefined.
    */
  var onDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Error], Unit]] = js.undefined
  /**
    * Called upon receipt of an invitation.
    * @remarks
    * Handler for incoming out of dialog INVITE requests.
    * @param invitation - The invitation.
    */
  var onInvite: js.UndefOr[js.Function1[/* invitation */ Invitation, Unit]] = js.undefined
  /**
    * Called upon receipt of a message.
    * @remarks
    * Handler for incoming out of dialog MESSAGE requests.
    * @param message - The message.
    */
  var onMessage: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
  /**
    * Called upon receipt of a notification.
    * @remarks
    * Handler for incoming out of dialog NOTIFY requests.
    * @param notification - The notification.
    */
  var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.undefined
  /**
    * Called upon receipt of a referral.
    * @remarks
    * Handler for incoming out of dialog REFER requests.
    * @param referral - The referral.
    */
  var onRefer: js.UndefOr[js.Function1[/* referral */ Referral, Unit]] = js.undefined
  /**
    * @internal
    * Called upon receipt of a registration request. Used by test suite.
    * @param request - The request.
    */
  var onRegisterRequest: js.UndefOr[js.Function1[/* request */ IncomingRegisterRequest, Unit]] = js.undefined
  /**
    * Called upon receipt of a subscription.
    * @remarks
    * Handler for incoming out of dialog SUBSCRIBE requests.
    * @param subscription - The subscription.
    */
  var onSubscribe: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.undefined
  /**
    * @internal
    * Called upon receipt of a subscription request. Used by test suite.
    * @param request - The request.
    */
  var onSubscribeRequest: js.UndefOr[js.Function1[/* request */ IncomingSubscribeRequest, Unit]] = js.undefined
}

object UserAgentDelegate {
  @scala.inline
  def apply(
    onConnect: js.UndefOr[Callback] = js.undefined,
    onDisconnect: /* error */ js.UndefOr[js.Error] => Callback = null,
    onInvite: /* invitation */ Invitation => Callback = null,
    onMessage: /* message */ Message => Callback = null,
    onNotify: /* notification */ Notification => Callback = null,
    onRefer: /* referral */ Referral => Callback = null,
    onRegisterRequest: /* request */ IncomingRegisterRequest => Callback = null,
    onSubscribe: /* subscription */ Subscription => Callback = null,
    onSubscribeRequest: /* request */ IncomingSubscribeRequest => Callback = null
  ): UserAgentDelegate = {
    val __obj = js.Dynamic.literal()
    onConnect.foreach(p => __obj.updateDynamic("onConnect")(p.toJsFn))
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Error]) => onDisconnect(t0).runNow()))
    if (onInvite != null) __obj.updateDynamic("onInvite")(js.Any.fromFunction1((t0: /* invitation */ typingsJapgolly.sipJs.invitationMod.Invitation) => onInvite(t0).runNow()))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.sipJs.messageMod.Message) => onMessage(t0).runNow()))
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction1((t0: /* notification */ typingsJapgolly.sipJs.notificationMod.Notification) => onNotify(t0).runNow()))
    if (onRefer != null) __obj.updateDynamic("onRefer")(js.Any.fromFunction1((t0: /* referral */ typingsJapgolly.sipJs.referralMod.Referral) => onRefer(t0).runNow()))
    if (onRegisterRequest != null) __obj.updateDynamic("onRegisterRequest")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.registerMod.IncomingRegisterRequest) => onRegisterRequest(t0).runNow()))
    if (onSubscribe != null) __obj.updateDynamic("onSubscribe")(js.Any.fromFunction1((t0: /* subscription */ typingsJapgolly.sipJs.subscriptionMod.Subscription) => onSubscribe(t0).runNow()))
    if (onSubscribeRequest != null) __obj.updateDynamic("onSubscribeRequest")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.sipJs.subscribeMod.IncomingSubscribeRequest) => onSubscribeRequest(t0).runNow()))
    __obj.asInstanceOf[UserAgentDelegate]
  }
}

