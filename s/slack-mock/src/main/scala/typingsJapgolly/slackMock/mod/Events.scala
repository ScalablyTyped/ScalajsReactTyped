package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events[T] extends js.Object {
  var calls: js.Array[EventCall[T]]
  def reset(): Unit
  def send(targetUrl: EventUrl, body: T): js.Promise[Unit]
}

object Events {
  @scala.inline
  def apply[T](
    calls: js.Array[EventCall[T]],
    reset: Callback,
    send: (EventUrl, T) => CallbackTo[js.Promise[Unit]]
  ): Events[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any])
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("send")(js.Any.fromFunction2((t0: typingsJapgolly.slackMock.mod.EventUrl, t1: T) => send(t0, t1).runNow()))
    __obj.asInstanceOf[Events[T]]
  }
}

