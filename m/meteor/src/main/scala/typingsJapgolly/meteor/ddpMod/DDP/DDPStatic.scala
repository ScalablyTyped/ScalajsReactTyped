package typingsJapgolly.meteor.ddpMod.DDP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.meteor.Meteor.SubscriptionHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DDPStatic extends js.Object {
  @JSName("apply")
  def apply(method: String, parameters: js.Any*): js.Any
  def call(method: String, parameters: js.Any*): js.Any
  def disconnect(): Unit
  def methods(IMeteorMethodsDictionary: js.Any): js.Any
  def onReconnect(): Unit
  def reconnect(): Unit
  def status(): DDPStatus
  def subscribe(name: String, rest: js.Any*): SubscriptionHandle
}

object DDPStatic {
  @scala.inline
  def apply(
    apply: (String, /* repeated */ js.Any) => CallbackTo[js.Any],
    call: (String, /* repeated */ js.Any) => CallbackTo[js.Any],
    disconnect: Callback,
    methods: js.Any => CallbackTo[js.Any],
    onReconnect: Callback,
    reconnect: Callback,
    status: CallbackTo[DDPStatus],
    subscribe: (String, /* repeated */ js.Any) => CallbackTo[SubscriptionHandle]
  ): DDPStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => apply(t0, t1).runNow()))
    __obj.updateDynamic("call")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => call(t0, t1).runNow()))
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("methods")(js.Any.fromFunction1((t0: js.Any) => methods(t0).runNow()))
    __obj.updateDynamic("onReconnect")(onReconnect.toJsFn)
    __obj.updateDynamic("reconnect")(reconnect.toJsFn)
    __obj.updateDynamic("status")(status.toJsFn)
    __obj.updateDynamic("subscribe")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => subscribe(t0, t1).runNow()))
    __obj.asInstanceOf[DDPStatic]
  }
}

