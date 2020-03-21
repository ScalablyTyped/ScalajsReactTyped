package typingsJapgolly.pubnub.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// addListener
trait ListenerParameters extends js.Object {
  var membership: js.UndefOr[js.Function1[/* membershipEvent */ MembershipEvent, Unit]] = js.undefined
  var message: js.UndefOr[js.Function1[/* messageEvent */ MessageEvent, Unit]] = js.undefined
  var messageAction: js.UndefOr[js.Function1[/* messageActionEvent */ MessageActionEvent, Unit]] = js.undefined
  var presence: js.UndefOr[js.Function1[/* presenceEvent */ PresenceEvent, Unit]] = js.undefined
  var signal: js.UndefOr[js.Function1[/* signalEvent */ SignalEvent, Unit]] = js.undefined
  var space: js.UndefOr[js.Function1[/* spaceEvent */ SpaceEvent, Unit]] = js.undefined
  var status: js.UndefOr[js.Function1[/* statusEvent */ StatusEvent, Unit]] = js.undefined
  var user: js.UndefOr[js.Function1[/* userEvent */ UserEvent, Unit]] = js.undefined
}

object ListenerParameters {
  @scala.inline
  def apply(
    membership: /* membershipEvent */ MembershipEvent => Callback = null,
    message: /* messageEvent */ MessageEvent => Callback = null,
    messageAction: /* messageActionEvent */ MessageActionEvent => Callback = null,
    presence: /* presenceEvent */ PresenceEvent => Callback = null,
    signal: /* signalEvent */ SignalEvent => Callback = null,
    space: /* spaceEvent */ SpaceEvent => Callback = null,
    status: /* statusEvent */ StatusEvent => Callback = null,
    user: /* userEvent */ UserEvent => Callback = null
  ): ListenerParameters = {
    val __obj = js.Dynamic.literal()
    if (membership != null) __obj.updateDynamic("membership")(js.Any.fromFunction1((t0: /* membershipEvent */ typingsJapgolly.pubnub.mod.MembershipEvent) => membership(t0).runNow()))
    if (message != null) __obj.updateDynamic("message")(js.Any.fromFunction1((t0: /* messageEvent */ typingsJapgolly.pubnub.mod.MessageEvent) => message(t0).runNow()))
    if (messageAction != null) __obj.updateDynamic("messageAction")(js.Any.fromFunction1((t0: /* messageActionEvent */ typingsJapgolly.pubnub.mod.MessageActionEvent) => messageAction(t0).runNow()))
    if (presence != null) __obj.updateDynamic("presence")(js.Any.fromFunction1((t0: /* presenceEvent */ typingsJapgolly.pubnub.mod.PresenceEvent) => presence(t0).runNow()))
    if (signal != null) __obj.updateDynamic("signal")(js.Any.fromFunction1((t0: /* signalEvent */ typingsJapgolly.pubnub.mod.SignalEvent) => signal(t0).runNow()))
    if (space != null) __obj.updateDynamic("space")(js.Any.fromFunction1((t0: /* spaceEvent */ typingsJapgolly.pubnub.mod.SpaceEvent) => space(t0).runNow()))
    if (status != null) __obj.updateDynamic("status")(js.Any.fromFunction1((t0: /* statusEvent */ typingsJapgolly.pubnub.mod.StatusEvent) => status(t0).runNow()))
    if (user != null) __obj.updateDynamic("user")(js.Any.fromFunction1((t0: /* userEvent */ typingsJapgolly.pubnub.mod.UserEvent) => user(t0).runNow()))
    __obj.asInstanceOf[ListenerParameters]
  }
}

