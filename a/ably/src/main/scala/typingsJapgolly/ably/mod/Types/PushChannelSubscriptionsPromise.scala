package typingsJapgolly.ably.mod.Types

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushChannelSubscriptionsPromise extends js.Object {
  def list(params: PushChannelSubscriptionParams): js.Promise[PaginatedResult[PushChannelSubscription]]
  def listChannels(params: PushChannelsParams): js.Promise[PaginatedResult[String]]
  def remove(subscription: PushChannelSubscription): js.Promise[Unit]
  def removeWhere(params: PushChannelSubscriptionParams): js.Promise[Unit]
  def save(subscription: PushChannelSubscription): js.Promise[PushChannelSubscription]
}

object PushChannelSubscriptionsPromise {
  @scala.inline
  def apply(
    list: PushChannelSubscriptionParams => CallbackTo[js.Promise[PaginatedResult[PushChannelSubscription]]],
    listChannels: PushChannelsParams => CallbackTo[js.Promise[PaginatedResult[String]]],
    remove: PushChannelSubscription => CallbackTo[js.Promise[Unit]],
    removeWhere: PushChannelSubscriptionParams => CallbackTo[js.Promise[Unit]],
    save: PushChannelSubscription => CallbackTo[js.Promise[PushChannelSubscription]]
  ): PushChannelSubscriptionsPromise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.ably.mod.Types.PushChannelSubscriptionParams) => list(t0).runNow()))
    __obj.updateDynamic("listChannels")(js.Any.fromFunction1((t0: typingsJapgolly.ably.mod.Types.PushChannelsParams) => listChannels(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.ably.mod.Types.PushChannelSubscription) => remove(t0).runNow()))
    __obj.updateDynamic("removeWhere")(js.Any.fromFunction1((t0: typingsJapgolly.ably.mod.Types.PushChannelSubscriptionParams) => removeWhere(t0).runNow()))
    __obj.updateDynamic("save")(js.Any.fromFunction1((t0: typingsJapgolly.ably.mod.Types.PushChannelSubscription) => save(t0).runNow()))
    __obj.asInstanceOf[PushChannelSubscriptionsPromise]
  }
}

