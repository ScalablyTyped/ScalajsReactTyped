package typingsJapgolly.pusherChatkitClient.currentuserMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.pusherChatkitClient.hooksMod.ReadCursorHook
import typingsJapgolly.pusherChatkitClient.hooksMod.UserHook
import typingsJapgolly.pusherChatkitClient.hooksMod.UserPresenceHook
import typingsJapgolly.pusherChatkitClient.hooksMod.UserPresenceState
import typingsJapgolly.pusherChatkitClient.messageMod.PusherMessage
import typingsJapgolly.pusherChatkitClient.roomMod.PusherReadCursor
import typingsJapgolly.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomSubscriptionHooks extends js.Object {
  var onMessage: js.UndefOr[js.Function1[/* message */ PusherMessage, Unit]] = js.undefined
  var onMessageDeleted: js.UndefOr[js.Function1[/* messageId */ Double, Unit]] = js.undefined
  var onNewReadCursor: js.UndefOr[ReadCursorHook] = js.undefined
  var onPresenceChanged: js.UndefOr[UserPresenceHook] = js.undefined
  var onUserJoined: js.UndefOr[UserHook] = js.undefined
  var onUserLeft: js.UndefOr[UserHook] = js.undefined
  var onUserStartedTyping: js.UndefOr[UserHook] = js.undefined
  var onUserStoppedTyping: js.UndefOr[UserHook] = js.undefined
}

object RoomSubscriptionHooks {
  @scala.inline
  def apply(
    onMessage: /* message */ PusherMessage => Callback = null,
    onMessageDeleted: /* messageId */ Double => Callback = null,
    onNewReadCursor: /* cursor */ PusherReadCursor => Callback = null,
    onPresenceChanged: (/* state */ UserPresenceState, /* user */ PusherUser) => Callback = null,
    onUserJoined: /* room */ PusherUser => Callback = null,
    onUserLeft: /* room */ PusherUser => Callback = null,
    onUserStartedTyping: /* room */ PusherUser => Callback = null,
    onUserStoppedTyping: /* room */ PusherUser => Callback = null
  ): RoomSubscriptionHooks = {
    val __obj = js.Dynamic.literal()
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.pusherChatkitClient.messageMod.PusherMessage) => onMessage(t0).runNow()))
    if (onMessageDeleted != null) __obj.updateDynamic("onMessageDeleted")(js.Any.fromFunction1((t0: /* messageId */ scala.Double) => onMessageDeleted(t0).runNow()))
    if (onNewReadCursor != null) __obj.updateDynamic("onNewReadCursor")(js.Any.fromFunction1((t0: /* cursor */ typingsJapgolly.pusherChatkitClient.roomMod.PusherReadCursor) => onNewReadCursor(t0).runNow()))
    if (onPresenceChanged != null) __obj.updateDynamic("onPresenceChanged")(js.Any.fromFunction2((t0: /* state */ typingsJapgolly.pusherChatkitClient.hooksMod.UserPresenceState, t1: /* user */ typingsJapgolly.pusherChatkitClient.userMod.PusherUser) => onPresenceChanged(t0, t1).runNow()))
    if (onUserJoined != null) __obj.updateDynamic("onUserJoined")(js.Any.fromFunction1((t0: /* room */ typingsJapgolly.pusherChatkitClient.userMod.PusherUser) => onUserJoined(t0).runNow()))
    if (onUserLeft != null) __obj.updateDynamic("onUserLeft")(js.Any.fromFunction1((t0: /* room */ typingsJapgolly.pusherChatkitClient.userMod.PusherUser) => onUserLeft(t0).runNow()))
    if (onUserStartedTyping != null) __obj.updateDynamic("onUserStartedTyping")(js.Any.fromFunction1((t0: /* room */ typingsJapgolly.pusherChatkitClient.userMod.PusherUser) => onUserStartedTyping(t0).runNow()))
    if (onUserStoppedTyping != null) __obj.updateDynamic("onUserStoppedTyping")(js.Any.fromFunction1((t0: /* room */ typingsJapgolly.pusherChatkitClient.userMod.PusherUser) => onUserStoppedTyping(t0).runNow()))
    __obj.asInstanceOf[RoomSubscriptionHooks]
  }
}

