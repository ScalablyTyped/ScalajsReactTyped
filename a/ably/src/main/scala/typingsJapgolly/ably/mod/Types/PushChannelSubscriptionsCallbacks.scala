package typingsJapgolly.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushChannelSubscriptionsCallbacks extends js.Object {
  def list(params: PushChannelSubscriptionParams, callback: paginatedResultCallback[PushChannelSubscription]): Unit = js.native
  def listChannels(params: PushChannelsParams, callback: paginatedResultCallback[String]): Unit = js.native
  def remove(subscription: PushChannelSubscription): Unit = js.native
  def remove(subscription: PushChannelSubscription, callback: errorCallback): Unit = js.native
  def removeWhere(params: PushChannelSubscriptionParams): Unit = js.native
  def removeWhere(params: PushChannelSubscriptionParams, callback: errorCallback): Unit = js.native
  def save(subscription: PushChannelSubscription): Unit = js.native
  def save(
    subscription: PushChannelSubscription,
    callback: js.Function2[/* error */ ErrorInfo, /* subscription */ PushChannelSubscription, Unit]
  ): Unit = js.native
}

