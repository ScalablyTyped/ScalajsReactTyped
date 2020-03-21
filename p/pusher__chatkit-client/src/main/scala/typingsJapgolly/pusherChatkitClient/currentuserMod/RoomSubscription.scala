package typingsJapgolly.pusherChatkitClient.currentuserMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomSubscription extends js.Object {
  var disableCursors: Boolean
  var hooks: js.UndefOr[RoomSubscriptionHooks] = js.undefined
  var messageLimit: Double
  var roomId: String
  def cancel(): js.Promise[Unit]
}

object RoomSubscription {
  @scala.inline
  def apply(
    cancel: CallbackTo[js.Promise[Unit]],
    disableCursors: Boolean,
    messageLimit: Double,
    roomId: String,
    hooks: RoomSubscriptionHooks = null
  ): RoomSubscription = {
    val __obj = js.Dynamic.literal(disableCursors = disableCursors.asInstanceOf[js.Any], messageLimit = messageLimit.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSubscription]
  }
}

