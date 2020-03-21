package typingsJapgolly.actioncable.ActionCable

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cable extends js.Object {
  var subscriptions: Subscriptions
  def connect(): Unit
  def disconnect(): Unit
  def ensureActiveConnection(): Unit
  def send(data: js.Any): Unit
}

object Cable {
  @scala.inline
  def apply(
    connect: Callback,
    disconnect: Callback,
    ensureActiveConnection: Callback,
    send: js.Any => Callback,
    subscriptions: Subscriptions
  ): Cable = {
    val __obj = js.Dynamic.literal(subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.updateDynamic("connect")(connect.toJsFn)
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("ensureActiveConnection")(ensureActiveConnection.toJsFn)
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: js.Any) => send(t0).runNow()))
    __obj.asInstanceOf[Cable]
  }
}

