package typingsJapgolly.actioncable.ActionCable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  def perform(action: String, data: js.Object): Unit
  def send(data: js.Any): Boolean
  def unsubscribe(): Unit
}

object Channel {
  @scala.inline
  def apply(
    perform: (String, js.Object) => Callback,
    send: js.Any => CallbackTo[Boolean],
    unsubscribe: Callback
  ): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("perform")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => perform(t0, t1).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: js.Any) => send(t0).runNow()))
    __obj.updateDynamic("unsubscribe")(unsubscribe.toJsFn)
    __obj.asInstanceOf[Channel]
  }
}

