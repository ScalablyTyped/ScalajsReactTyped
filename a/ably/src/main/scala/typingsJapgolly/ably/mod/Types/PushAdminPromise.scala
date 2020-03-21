package typingsJapgolly.ably.mod.Types

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushAdminPromise extends js.Object {
  var channelSubscriptions: PushChannelSubscriptionsPromise
  var deviceRegistrations: PushDeviceRegistrationsPromise
  def publish(recipient: js.Any, payload: js.Any): js.Promise[Unit]
}

object PushAdminPromise {
  @scala.inline
  def apply(
    channelSubscriptions: PushChannelSubscriptionsPromise,
    deviceRegistrations: PushDeviceRegistrationsPromise,
    publish: (js.Any, js.Any) => CallbackTo[js.Promise[Unit]]
  ): PushAdminPromise = {
    val __obj = js.Dynamic.literal(channelSubscriptions = channelSubscriptions.asInstanceOf[js.Any], deviceRegistrations = deviceRegistrations.asInstanceOf[js.Any])
    __obj.updateDynamic("publish")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => publish(t0, t1).runNow()))
    __obj.asInstanceOf[PushAdminPromise]
  }
}

